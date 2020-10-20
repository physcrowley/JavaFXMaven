The full Java Extension Pack for VS Code was added before getting into this project.

Project structure initially created with the org.openjfx simple Maven archetype.

The `pom.xml` file needs to immediately be modified to JavaFX version 11 and Java release 14

Following the tutorials from (JavaFX Tutorials for Beginners)[https://www.youtube.com/watch?v=Q_1cZYoGoYM&list=PLS1QulWo1RIaUGP446_pWLgTZPiFizEMq] on Youtube for the general progress of the project.

Dependencies need to be added through Maven as you go : most notably `javafx-fxml`

The `module-info.java` file also needs to add the line
```requires javafx.fxml;```

and eventually
```opens <package> to javafx.fxml;```

when annotations are added in the controller class.

If you are starting a project with fxml, it is better to use the Maven org.openjfx fxml archetype, but the JavaFX and Java versions will still need to be adjusted to your installed/default values.