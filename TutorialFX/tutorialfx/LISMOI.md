# À propos
This file describes some of the configuration details for building JavaFX projects in VS Code.

# Préparation de VS Code
Le **"Java Extension Pack"** pour VS Code est requis pour travailler avec JavaFX.

C'était possible de travailler uniquement avec l'extension **"Language Support for Java"** pour les projets précédents, en gérant des fichiers de configuration manuellement et en compilant et exécutant le code via la ligne de commande. Mais la structure d'un projet JavaFX est trop lourd à gérer de cette façon.

# Maven
C'est critique d'installer **Maven** sur ton ordinateur afin de bénéficier des fonctionnalités de création et de gestion de projet. C'est ce qui fait la plus grande différence.

# Structure de projet
Des projets JavaFX de base devraient utiliser l'archétype Maven **"javafx-archetype-simple"** d'org.openjfx. On le trouve en ajoutant un nouveau Java Project > Maven, en cliquant l'option "more..." et en tapant "openjfx".

## Modifications aux paramètres par défaut
Le fichier `pom.xml` devrait être modifier dès la création du projet, changeant la version de Java à ta valeur préférée.
*  Lis le fichier en diagonal pour trouver la balise **release**. Change sa valeur au même niveau que l'installation Java sur ton système. Par exemple, sur mon système, JavaSE-14 est la valeur par défaut, alors j'ai changer la valeur de "release" à 14. Tu peux choisir une valeur de release qui est égale ou inférieur au niveau du JDK identifié par votre variable d'environnement JAVA_HOME.
* Les dépendances ("Maven dependencies") doivent être bonifiées à mesure que tes projets grandissent. Particulièrement, il faut ajouter `javafx-fxml` dès que vous commencez à utiliser les fichiers fxml et la structure de projet afférent.
* Une fois que fxml entre dans les projets, il faut aussi changer le fichier `module-info.java` en ajoutant la ligne
    ```java
    requires javafx.fxml;
    ```
    et éventuellement (quand le projet inclut de classes de contrôle)
    ```java
    opens <package> to javafx.fxml;
    ```

## Commencer par un projet fxml
Si votre projet démarre déjà avec `fxml`, c'est mieux d'utiliser l'archétype Maven **"javafx-archetype-fxml"** d'org.openjfx (qui inclut déjà les dépendences et déclarations dans module-info,java pour le fxml).  Le fichier `pom.xml` devra toujours être ajusté pour changer la valeur du "release" approprié de Java pour votre système.

C'est également probable d'avoir à enlever certains fichiers-gabarits `java` ou modifier quelques dossiers pour correspondre à votre projet.

# Développemen de ce projet
Ce projet suit les tutoriels Youtube suivants : [JavaFX Tutorials for Beginners](https://www.youtube.com/watch?v=Q_1cZYoGoYM&list=PLS1QulWo1RIaUGP446_pWLgTZPiFizEMq).

# Auteur
David Crowley, EAO
@physcrowley