# odpj-gradle-settings
Shared grale settings for all grale (main: java) project
 - test.gradle
 - spotbugs.grale
 - spotless.gradle (google format)
 - checkstyle.grale (google format)
# How to use
## New Project
add this repository as a sub module
- In the root project directory
```
git submodule add git@gitlab.com:odpjgrp/odpj-gradle-settings.git odpj-gradle-settings
```
### Submodule update
- https://devconnected.com/how-to-add-and-update-git-submodules/#Pull_a_Git_Submodule
### Apply setting
- int grale.build file, add the blow settings

```
plugins {
	id 'java'
	id 'jacoco'
	id 'checkstyle'
	id 'com.diffplug.spotless' version '6.11.0' # lastest version https://plugins.gradle.org/plugin/com.diffplug.gradle.spotless
	id 'com.github.spotbugs' version '5.0.13' # lastest version https://plugins.gradle.org/plugin/com.github.spotbugs
}
...
... other settings

apply from: "$rootProject.rootDir/odpj-gradle-settings/all.gradle"
```