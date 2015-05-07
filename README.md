# Examples of actors in Akka
In Java, using Gradle for managing dependencies and build. Currently there is only a basic example that uses akka version 2.3.8.

## Use (command line)
Clone the project in your computer. Then go to the directory where a file named `build.gradle` is. Run `$ ./gradlew tasks` (`gradlew.bat` if you are in Windows). If everything is fine, this will download a specific version of Gradle to your computer (only the first time), and will show the available Gradle tasks in the build.

To try the example run `$ ./gradlew --quiet run` in the shell. 

## Use (Eclipse IDE)
Install the plugin named "Gradle Integration for Eclipse" for your Eclipse version from its marketplace. Then go to File > Import..., choose Gradle Project, put as root folder the directory you want (one with a build.gradle file) from the project, click on Build model, choose the one that is shown and click on Finish. This imports the project to Eclipse so you can run it from there.

If dependencies are not automatically met, right click on the name of the project in the Package Explorer and choose Gradle > Refresh All.
