[version française](LISMOI.md)

# About
This file describes some of the configuration details for building JavaFX projects in VS Code.

# VS Code set-up
The full **"Java Extension Pack"** for VS Code was added before getting into this project.

It was possible to work only with the **"Language Support for Java"** extension on all previous projects, making manual configuration files, then compiling and running from the command line but the build structure for JavaFX projects is too heavy to manage manually.

# Maven
It is important to also install **Maven** to be able to use the project building and managing tools effectively. This is what makes the biggest difference.

# Project structure
Basic JavaFX projects can be set up with the org.openjfx **"javafx-archetype-simple"** Maven archetype > look for it when you add a new Java Project > Maven in the the "more..." entry and type "openjfx".

## Changes to default settings
The `pom.xml` file needs to be modified, changing the Java version to your preferred value.
*  Scan the file to find the **release** tag. Change it to the same level as your Java installation. For example, JavaSE-14 is the default installation on my computer, so I changed the release value to 14. The release value can be at or below the JDK level in your JAVA_HOME path variable.
* Dependencies need to be added through Maven as you go: most notably `javafx-fxml` once you start working with that type of file and project structure.
* Once fxml comes into play, the `module-info.java` file also needs to add the line
    ```java
    requires javafx.fxml;
    ```
    and eventually (once your project includes control classes)
    ```java
    opens <package> to javafx.fxml;
    ```

## Starting off with fxml
If you are starting a project with `fxml`, it is better to use the Maven org.openjfx **"javafx-archetype-fxml"** Maven archetype (because the dependencies and module-info.java file are already prepared for fxml), but the `pom.xml` file will still need to be adjusted to your installed/default release value.

You may also need to remove some of the template `java` files or modify some folders to suit your own project.

# Project arc
The project is being developed following the tutorials from [JavaFX Tutorials for Beginners](https://www.youtube.com/watch?v=Q_1cZYoGoYM&list=PLS1QulWo1RIaUGP446_pWLgTZPiFizEMq).

# Author
David Crowley, EAO
@physcrowley