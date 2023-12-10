# odpj-api-common
- The common code and settings for others project
## add sub module
```
git submodule add git@gitlab.com:odpjgrp/odpj-api-common.git
```

<<<<<<< HEAD
## Before push to git
run the command below and make sure there is no error
```
./gradlew clean build
```
if spotless error is showed, run
```
./gradlew spotlessApply
```

=======
>>>>>>> 4faedea7b5cece46f9bd1606487349983d55db55
## Getting started

```
cd existing_repo
git remote add origin https://gitlab.com/odpjgrp/odpj-api-common.git
git branch -M main
git push -uf origin main
```



## Khi commit code cần thực hiện các bước sau:

1. Rebase với branch develop 

``
git pull -r origin develop
``

2. Format code 

``
./gradlew spotlessApply
``

3. Check build succesful ở local

4. Sau khi commit kiểm tra build result ở pineline





## Khi merge code cần thực hiện các bước sau:

1. Review với check list và document liên quan

2. Check build result ở pineline

<<<<<<< HEAD
## Usage
Use examples liberally, and show the expected output if you can. It's helpful to have inline the smallest example of usage that you can demonstrate, while providing links to more sophisticated examples if they are too long to reasonably include in the README.

## Support
Tell people where they can go to for help. It can be any combination of an issue tracker, a chat room, an email address, etc.

## Roadmap
If you have ideas for releases in the future, it is a good idea to list them in the README.

## Contributing
State if you are open to contributions and what your requirements are for accepting them.

For people who want to make changes to your project, it's helpful to have some documentation on how to get started. Perhaps there is a script that they should run or some environment variables that they need to set. Make these steps explicit. These instructions could also be useful to your future self.

You can also document commands to lint the code or run tests. These steps help to ensure high code quality and reduce the likelihood that the changes inadvertently break something. Having instructions for running tests is especially helpful if it requires external setup, such as starting a Selenium server for testing in a browser.

## Authors and acknowledgment
Show your appreciation to those who have contributed to the project.

## License
For open source projects, say how it is licensed.

## Project status
If you have run out of energy or time for your project, put a note at the top of the README saying that development has slowed down or stopped completely. Someone may choose to fork your project or volunteer to step in as a maintainer or owner, allowing your project to keep going. You can also make an explicit request for maintainers.
=======
3. Sau khi merge code kiểm tra build + deploy result ở pinline
>>>>>>> 4faedea7b5cece46f9bd1606487349983d55db55
