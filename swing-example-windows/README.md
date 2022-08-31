On Windows remove any java tooling from the system's path variables, next install the MS Build Tools and also the Liberica Native Image Kit (Full version, Java 17 tested).

Now download the Github repo, extract it, open a "x64 Native Tools Command Prompt" and change into the "swing-example-windows" directory.

Next run the following commands to create the executable.

<code>mkdir -p META-INF\native-image

java -agentlib:native-image-agent=config-output-dir=META-INF/native-image -jar SwingSet2.jar

native-image -Djava.awt.headless=false --no-fallback -jar SwingSet2.jar

EDITBIN /SUBSYSTEM:WINDOWS SwingSet2.exe</code>

