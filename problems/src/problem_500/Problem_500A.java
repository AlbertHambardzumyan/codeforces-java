package problem_500;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;


/**
 * @author Albert Hambardzumyan
 */
public class Problem_500A {
    private static boolean[] visited;
    public static String result = "NO";
    private static int destination;
    private static Iterator<Integer>[] iterator;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vertices = in.nextInt();
        destination = in.nextInt();

        LinkedList<Integer>[] adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < adjacencyList.length; i++)
            adjacencyList[i] = new LinkedList<Integer>();

        int temp;
        for (int i = 0; i < vertices - 1; i++) {
            temp = in.nextInt();
            adjacencyList[i].add(i + temp);
        }

        iterator = new Iterator[vertices];
        for (int i = 0; i < iterator.length; i++)
            iterator[i] = adjacencyList[i].iterator();


        visited = new boolean[vertices];
        Dfs(0);
        System.out.print(result);
    }

    private static void Dfs(int i) {
        int temp;
        if (i == destination - 1)
            result = "YES";
        visited[i] = true;
        if (i != destination - 1) {
            while (iterator[i].hasNext()) {
                temp = iterator[i].next();
                if (!visited[temp]) {
                    Dfs(temp);
                }
            }
        }
    }
}