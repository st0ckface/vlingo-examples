# Example on using the vlingo platform w/ AWS
This module includes a basic maven + docker setup that can be used as a template when setting up new vlingo projects.

Using that docker-file maven plugin from spotify, the docker build has been integragted into the `package` phase.

Simply run `mvn clean package` to compile the code and build a docker container complete with dependencies.