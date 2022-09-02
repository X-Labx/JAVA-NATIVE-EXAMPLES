mkdir -p META-INF/native-image
javac Test.java
java -agentlib:native-image-agent=config-output-dir=META-INF/native-image -cp .:sqlite-jdbc-3.39.2.1.jar Test
native-image -cp .:sqlite-jdbc-3.39.2.1.jar --no-fallback Test


