
# IT283 - Git and GitHub Quick Reference

## 1. What are Git and GitHub?

Git is a version control system that tracks
changes to files and source code.

GitHub is an online platform for storing and
collaborating on Git repositories.

## 2. Initial Git Configuration

Check your installed Git version:

    git --version

Set your name (first-time setup):

    git config --global user.name "Your Name"

Set your email:

    git config --global user.email "your@email.com"

## 3. Clone a Repository

Download a repository from GitHub:

    git clone <REPOSITORY_URL>

Example:

    git clone https://github.com/USERNAME/IT283.git

## 4. Basic Git Commands

Check repository status:

    git status

Stage all changed files:

    git add .

Stage one specific file:

    git add Car.java

Commit your changes:

    git commit -m "Complete Week 1 assignment"

Upload commits to GitHub:

    git push origin main

Download and integrate changes:

    git pull origin main

View commit history:

    git log --oneline

View unstaged changes:

    git diff

View configured remote repositories:

    git remote -v

## 5. Creating a New Local Repository

Initialize Git in the current folder:

    git init

Rename the current branch to main:

    git branch -M main

Connect to a GitHub repository:

    git remote add origin <REPOSITORY_URL>

Stage and commit your files:

    git add .
    git commit -m "Initial commit"

Upload the first commit:

    git push -u origin main

Note: Create the corresponding empty GitHub
repository first. Do not clone another repository
before using this initialization workflow.

## 6. Basic Branch Commands

List local branches:

    git branch

Create and switch to a new branch:

    git switch -c new-feature

Switch back to main:

    git switch main

## 7. Everyday Assignment Workflow

After finishing your assignment in IntelliJ:

    git status
    git add .
    git commit -m "Finished homework"
    git push origin main

Check GitHub to verify the new commit appears.

## 8. Important Notes

- Run Git commands inside the correct repository.
- Commit meaningful changes regularly.
- Do not upload passwords or API keys.
- Never upload instructor-only solution manuals.
- Do not push homework to the instructor's repo.
- Submit homework to your own private repository.
- Share your private repository with your instructor.
- Use a .gitignore to exclude IDE and build files.
```
