FROM openjdk:8-jre
MAINTAINER You Break You Buy "youBreak@youBuy.it

# Dependencies put in target/lib by the maven dependency plugin
ADD target/lib           /usr/share/aws-example/lib
# JAR_NAME and path are configured in the maven-docker plugin
ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/aws-example/vlingo-aws-example.jar

ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/myservice/vlingo-aws-example.jar"]