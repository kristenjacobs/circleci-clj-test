FROM ubuntu:trusty

RUN apt-get install java

ADD target/uberjar/circleci-clj-test-0.1.0-SNAPSHOT-standalone.jar circle-clj-test.jar

CMD java -jar circleci-clj-test.jar
