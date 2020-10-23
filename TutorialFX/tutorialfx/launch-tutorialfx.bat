@echo off
rem ====================MANUAL=========================

rem Work from project source folder
cd C:/users/crowlda/Documents/JavaFXMaven/TutorialFX/tutorialfx/src/main/java

rem Set source directory / package
set source-dir=edu/djc

rem Set output directory
set output=..\..\..\bin\main

rem Set module dependencies: separate paths with ; and modules with ,
set module-path="C:/Program Files/JavaFX/javafx-sdk-11.0.2/lib"
set modules=javafx.controls,javafx.fxml

rem Set sources: include all .java files in the sources variable as a space-separated list
set main-class=App
set sources=%source-dir%/PrimaryController.java %source-dir%/%main-class%.java

rem =================AUTOMATIC==========================

set source-dir-win=%source-dir:/=\%
set package=%source-dir:/=.%

rem Compile
javac -d %output% ^
--module-path %module-path% ^
--add-modules %modules% ^
%sources%

rem Copy project resources to classpath
mkdir %output%\%source-dir-win%\fxml\
mkdir %output%\%source-dir-win%\css\
copy ..\resources\%source-dir-win%\fxml\*.fxml %output%\%source-dir-win%\fxml\
copy ..\resources\%source-dir-win%\css\*.css   %output%\%source-dir-win%\css\

rem Run
@echo on
java -cp %output% ^
--module-path %module-path% ^
--add-modules %modules% ^
%package%.%main-class%
