In a Linux terminal with "'GraalVM 22.2.0 Java 17" and native image installed and in your path, run:

<code>mkdir -p META-INF/native-image</code>

<code>javac Test.java</code>

<code>java -agentlib:native-image-agent=config-output-dir=META-INF/native-image -cp .:sqlite-jdbc-3.39.2.1.jar Test</code>

<code>native-image -cp .:sqlite-jdbc-3.39.2.1.jar --no-fallback Test</code>

<code>./test</code>
