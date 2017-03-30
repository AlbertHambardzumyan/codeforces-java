package problem_25;

import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_25D {
    private static boolean[][] destroy;
    private static boolean[] visited;
    private static boolean[][] edges;
    public static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int city = in.nextInt();

        boolean[] disconnected = new boolean[city];
        destroy = new boolean[city][city];
        edges = new boolean[city][city];

        int a, b;
        for (int i = 0; i < city - 1; i++) {
            a = in.nextInt();
            b = in.nextInt();
            edges[a - 1][b - 1] = true;
            edges[b - 1][a - 1] = true;
        }

        visited = new boolean[city];

        for (int i = 0; i < city; i++) {
            if (!visited[i]) {
                if (i != 0) {
                    disconnected[i] = true;
                }
                DFS(i);
            }
        }

        String[] disArray = new String[city];
        int index = 0;
        for (int i = 0; i < disconnected.length; i++) {
            if (disconnected[i]) {
                disArray[index] = (i) + " " + (i + 1);
                index++;
            }
        }

        index = 0;
        System.out.println(count);
        for (int i = 0; i < destroy.length; i++) {
            for (int j = 0; j < destroy.length; j++) {
                if (destroy[i][j]) {
                    System.out.print((i + 1) + " " + (j + 1) + " ");
                    System.out.print((disArray[index]));
                    System.out.println();
                    index++;
                }
            }
        }

    }

    private static void DFS(int i) {
        visited[i] = true;
        for (int j = 0; j < edges.length; j++) {
            if (edges[i][j] && !visited[j]) {
                edges[i][j] = false;
                edges[j][i] = false;
                DFS(j);
            } else if (edges[i][j] && visited[j]) {
                destroy[i][j] = true;
                edges[i][j] = false;
                edges[j][i] = false;
                count++;
            }
        }
    }
}