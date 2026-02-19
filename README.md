# Git Essentials Cheat Sheet

A quick-reference guide for the most common Git commands and why they are used.

## 🏁 Starting a Project
| Command | Why use it? |
| :--- | :--- |
| `git init` | Initializes a brand new local repository in your current folder. |
| `git clone [url]` | Downloads an existing repository and its entire history to your machine. |
| `git config --global user.name "[name]"` | Sets the name attached to your commits so teammates know who made changes. |

## 📝 Managing Changes (The Staging Area)
| Command | Why use it? |
| :--- | :--- |
| `git status` | Shows which files are modified, deleted, or ready to be committed. |
| `git add [file]` | Moves a specific file to the staging area for the next "snapshot." |
| `git add .` | Stages **all** modified and new files at once for a bulk update. |
| `git commit -m "[msg]"` | Saves your staged changes into history with a descriptive note. |
| `git diff` | Shows exact line-by-line changes made since your last commit. |

## 🌿 Branching & Merging
| Command | Why use it? |
| :--- | :--- |
| `git branch` | Lists all existing branches in your current project. |
| `git checkout [name]` | Switches your working directory to the specified branch. |
| `git checkout -b [name]` | Creates a new branch and immediately switches you into it. |
| `git merge [branch]` | Combines work from another branch into your current active branch. |

## ☁️ Remote Collaboration (GitHub/GitLab)
| Command | Why use it? |
| :--- | :--- |
| `git remote add origin [url]` | Connects your local repository to a remote server for the first time. |
| `git push origin [branch]` | Uploads your local commits to the server for others to access. |
| `git pull origin [branch]` | Downloads and merges the latest server changes into your local code. |
| `git fetch` | Downloads info from the server without merging it into your code yet. |

## 🕒 History & Recovery
| Command | Why use it? |
| :--- | :--- |
| `git log --oneline` | Displays a compact, chronological list of all previous commits. |
| `git restore [file]` | Discards uncommitted changes and resets a file to its last saved state. |
| `git reset --hard [hash]` | Forces the project back to a specific point, deleting all work after it. |
| `git revert [hash]` | Creates a new commit that exactly undoes the changes of a previous one. |

---
*Created for quick reference in the terminal.*