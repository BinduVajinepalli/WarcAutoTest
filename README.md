# Warc Automated tests

Basic Maven project consisting of Java 8 and Cucumber JVM 2.1.0

Implemented the PageFactory model with step definitions using lambdas

# Setup

install java 8 SDK


Install the SDK http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

Edit your System environment variables and make sure JAVA_HOME is set to your install path e.g, C:\Program Files\Java\jdk1.8.151

Edit your System environment variables and make sure PATH has ;%JAVA_HOME%\bin; added to it - and no other Java versions in the path

Open a command line prompt and type java -version. This should be your jdk version

# Install maven

Download it from http://maven.apache.org/download.cgi and unzip to e.g., program files

Edit your System environment variables and make sure M2_HOME is set to your install path e.g, C:\Program Files\apache-maven-3.5.0

Edit your System environment variables and make sure PATH has ;%M2_HOME%\bin; added to it - and no other Maven versions in the path

Open a command line prompt and type mvn. This should run maven

# Run the project in an IDE

Download and install your favourite

Import this maven project

Try and run a test from the IDE If things don't work, check you are using the correct jdk and maven version

# Running tests 

To run tests use the following command:

`mvn test -Dwebdriver.chrome.driver=\path\to\chrome\driver`

If the chrome path is set use command:

`mvn test`
