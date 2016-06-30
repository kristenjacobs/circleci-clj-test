FROM java:7

ADD target/uberjar/circleci-clj-test-0.1.0-SNAPSHOT-standalone.jar circleci-clj-test.jar

CMD java -jar circleci-clj-test.jar
