# Contributing to codeforces

This section will guide you through the contribution process.


### Step 1: Clone

Fork the project on [GitHub] and clone your fork locally.

    $ git clone https://github.com/AlbertHambardzumyan/codeforces.git
    $ cd codeforces

[GitHub]: https://github.com/AlbertHambardzumyan/codeforces  

For developing new features and bug fixes, the master branch should be pulled and built upon.


### Step 2: Branch

Create a new topic branch to contain your problem, change, or fix:

    $ git checkout -b <topic-branch-name>
    
Problem 38A - Army
  
### Step 3: Commit

Make sure git knows your name and email address:

    $ git config --global user.name "user"
    $ git config --global user.email "user@example.com"
    
Add and commit:

    $ git add my/changed/files
    $ git commit
    
#### Commit message guidelines

a). Adding new solution

    Problem {number} - {name}.
    Problem 38A - Army.

b). Improving existing solution

    Problem {number} - {name}:
     - {message}.
    Problem 38A - Army:
     - Improvement in performance
     - Reformat code
    
### Step 4: Push

    $ git push origin <topic-branch-name>

### Step 5: Pull Request

Open a Pull Request with a clear title and description.

Pull requests are usually reviewed within a few days.


### Step 6: Discuss and update

You will probably get feedback or requests for changes to your Pull Request. This is a big part of the submission 
 process so don't be discouraged!

To make changes to an existing Pull Request, make the changes to your branch. When you push to that branch,
 GitHub will automatically update the Pull Request.