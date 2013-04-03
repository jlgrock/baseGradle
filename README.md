baseGradle
==========

The base gradle files that I like to start using during a project setup.  This is a continuous work-in-progress.  The base gradle files that I like to start using during a project setup.  This is set up in a modular fashion so that anyone can pick and choose which of these plugins they would like to apply.

## Project layout
The way that I have this set up, this assumes a multi-module (aka multi-project, multi-subproject) setup since most of the projects I have ever created ended up being multi-module), but it is easy enough to adjust for a single project.

By default, this expects that all of your source is in the standard location maven/groovy defined directories (source in src/main/java, src/main/groovy and tests in src/test/java, src/test/groovy).  By default, it is using spock testing for the groovy code.  If you are unfamiliar, this is a DSL language very similar to Cucumber in the Ruby world and is very declarative - think SQL for unit testing.

In addition to this, integration testing has been put into place in the src/integrationTest/groovy location.  With this addition comes extra sourceSets, so if you have any plugins that go through all of the sourceSets for use (for example codenarc), make sure to specify that this should not apply to all sourceSets.

## Security
Please note that with any usernames, passwords, or secure paths should not be exposed to the general community.  It is expected that you either provide these via the command line, using the "-P<parameterName>=<parametervalue>" or by storing this in your global Gradle properties file (which is by default stored in your $HOME/.gradle/gradle.properties).

## Publishing
This publishes to a Maven repository and is configuring the pom file appropraitely.  This is the most useful to be able to pull into other Gradle, Maven, or Ivy projects.

This script has the ability to sign artifacts before publishing, though your repository needs to support that method.

## Code Quality
I am still working on integration with Sonar for all projects.  Checkstyle, Cobertura, PMD and Findbugs are in place for any Java related projects.  Checkstyle and CodeNarc are in place for any Groovy related projects.

# More...
If you have any additions or optimizations to my code, just send me a pull request!

-Justin G
