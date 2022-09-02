In a Linux terminal with "GraalVM 22.2.0 Java 17" and native-image installed and available in your path, run:

<code>javac ToStringSample.java</code>

<code>mkdir -p META-INF/native-image</code>

<code>java -agentlib:native-image-agent=config-output-dir=META-INF/native-image ToStringSample</code>

<code>native-image ToStringSample</code>

<code>./tostringsample</code>
  
