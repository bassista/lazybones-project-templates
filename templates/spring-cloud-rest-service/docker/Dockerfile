#########################################################
# Instruction for automatically build a doockerized image.
# How to build: docker build Dockerfile
#########################################################

# The FROM instruction sets the Base Image for subsequent instructions.
FROM farrukhjon/ubuntu-oracle-jre8

# The MAINTAINER instruction allows you to set the Author field of the generated images.
MAINTAINER Farrukhjon SATTOROV firedandy@gmail.com

# The EXPOSE instructions informs Docker that the container will listen on the specified network ports at runtime.
EXPOSE 8081

ARG PROJECT_NAME

# The COPY instruction copies new files or directories from <src> and adds them to the filesystem of the container at the path <dest>.
COPY artifacts/$PROJECT_NAME /opt/app.jar

VOLUME /tmp

# The WORKDIR instruction sets the working directory for any RUN, CMD, ENTRYPOINT, COPY and ADD instructions that follow it in the Dockerfile.
# WORKDIR /path/to/workdir.
WORKDIR /opt

CMD java $JAVA_OPTS -jar -Djava.security.egd=file:/dev/./urandom app.jar
