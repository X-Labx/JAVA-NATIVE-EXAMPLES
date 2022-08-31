On Windows remove any java tooling from the system's path variables, next install the MS Build Tools and also the Liberica Native Image Kit (Full version, Java 17 tested).

Now download the Github repo, extract it, open a "x64 Native Tools Command Prompt" and change into the "swing-example-windows" directory.

Next run the following commands to create the executable.

<code>mkdir -p META-INF\native-image</code>

<code>java -agentlib:native-image-agent=config-output-dir=META-INF/native-image -jar SwingSet2.jar</code>

<code>native-image -Djava.awt.headless=false -H:ReflectionConfigurationFiles=META-INF\native-image\reflect-config.json -H:ResourceConfigurationFiles=META-INF\native-image\resource-config.json -jar SwingSet2.jar</code>

<code>EDITBIN /SUBSYSTEM:WINDOWS SwingSet2.exe</code>

Now you should have an executable SwingSet2.exe which will run correctly. The Swing and JavaFX features in Liberica native-image on in development and not fully implemented (as of version NIK 22) so expect reliablity issues and possibly unhandled exceptions. 
