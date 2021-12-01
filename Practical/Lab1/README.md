# Lab 1: Setting up a new repository and learning new git commands.
Git is a free and open source distributed version control system designed to handle everything from small to very large projects with speed and efficiency.It is easy to learn and has a tiny footprint with lightning fast performance. 

## Initial Setup
1. Create new repo in github.
2. Create a new local directory to contain the project.
3. Open Terminal.
4. Change the current working directory to our local project.
5. Initialize the local directory as a Git repository.
```
git init
```
6. Create a README.md file.
``` 
touch README.md
```
7. Add the files in your new local repository. This stages them for the first commit.
```
git add .
```
8. Commit the files that you've staged in your local repository.
```
git commit -m "First commit"
```
9. In Terminal, add the URL for the remote repository where your local repository will be pushed.
```
git remote add origin  <REMOTE_URL> 
```
10. Push the changes in your local repository.
```
git push -u origin master
```

## Branching, Merging and Fetching
### Creating a new branch
```
git branch <branch>
```
### Deleting a branch
```
git branch -d <branch>
```
### To switch to specified branch and update the working directory
```
git checkout <branch>
```
### To merge branch
```
git merge <branch>
```
### To fetch all of the branches from the repository OR to only fetch the specified branch.
```
git fetch <remote>
git fetch <remote> <branch>
```
### To fetch  all registered remotes and their branches
```
git fetch --all
```
