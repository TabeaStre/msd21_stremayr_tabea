**git config**\
manages all local and global git settings on your pc\
used once for global settings, otherwise for every new repository

**git init**\
creates a new git repository in the current folder on your pc\
only used once at the beginning

**git commit**\
creates a new commit with all the content that currently is in the staging area\
used every time new changes are finalized in the local repository\
"-m" parameter is used to add a message to the commit

**git status**\
shows all untracked and staged files and the current working branch\
used every time you need information about the local repository

**git add**\
adds untracked changes to the staging area\
used for every change you want to add to the staging area\
if you want to add all changes, add the parameter "." at the end

**git log**\
shows the commit history on the current branch\
used every time you want to take a look at the current commit history in the local repository

**git diff**\
shows the difference between the last commit and the current status\
used every time you need to know exactly what has changed in the local repository

**git pull**\
pulls all changes from the remote repository\
used every time you need to sync changes from remote to local repository

**git push**\
pushes all changes to the remote repository\
used every time you need to sync changes from local to remote repository
