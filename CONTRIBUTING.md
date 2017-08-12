# Contributing to codeforces

This section will guide you through the contribution process.


### Step 1: Fork

Fork the project on [GitHub] and clone your fork locally.

    $ git clone git@github.com:username/codeforces.git
    $ cd codeforces
    $ git remote add upstream https://github.com/AlbertHambardzumyan/codeforces

[GitHub]: https://github.com/AlbertHambardzumyan/codeforces  
    
##### Which branch?

For developing new features and bug fixes, the master branch should be pulled and built upon.


### Step 2: Branch

    $ git checkout -b my-branch -t origin/master

    
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
     
### Step 4: Rebase

Use `git rebase` (not `git merge`) to synchronize your work with the main repository.

    $ git fetch upstream
    $ git rebase upstream/master
    
### Step 6: Push

    $ git push origin my-branch

Pull requests are usually reviewed within a few days.


### Discuss and update

You will probably get feedback or requests for changes to your Pull Request. This is a big part of the submission 
 process so don't be discouraged!

To make changes to an existing Pull Request, make the changes to your branch. When you push that branch to your fork,
 GitHub will automatically update the Pull Request.