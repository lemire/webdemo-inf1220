# Démo Javalin : Devinez le nombre

Ce projet est une application web simple utilisant Javalin et un template HTML. Le but du jeu est de deviner un nombre choisi aléatoirement par le serveur.

## Lancer le projet

1. Assurez-vous d'avoir Java 17 ou mieux et Maven installés. Sinon voir 'Installation de Java et Maven'.
2. Installez les dépendances avec `mvn install`.
3. Lancez le serveur avec `mvn exec:java -Dexec.mainClass="app.GuessNumberApp"`.

Accédez ensuite à http://localhost:7070 dans votre navigateur.

## Installation de Java et Maven

### Sous macOS

1. Installez [Homebrew](https://brew.sh/) si ce n'est pas déjà fait :
   ```sh
   /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
   ```
2. Installez Java 21 ou mieux :
   ```sh
   brew install openjdk@21
   ```
   Ajoutez Java à votre PATH (si nécessaire) :
   ```sh
   echo 'export PATH="/opt/homebrew/opt/openjdk@17/bin:$PATH"' >> ~/.zshrc
   source ~/.zshrc
   ```
3. Installez Maven :
   ```sh
   brew install maven
   ```

### Sous Windows

1. Téléchargez Java 21 (ou mieux) depuis [Adoptium.net](https://adoptium.net/fr/temurin/releases/).
   - Choisissez l'installateur MSI pour Windows, puis suivez les instructions pour installer Java.
   - Lors de l'installation, cochez l'option pour ajouter Java au PATH si disponible.
2. Installez Maven :
   - Téléchargez la dernière version binaire de Maven depuis [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi).
   - Décompressez l'archive ZIP dans un dossier (ex : `C:\maven`).
   - Ajoutez le chemin du dossier `bin` de Maven à la variable d'environnement `PATH` :
     1. Ouvrez le menu Démarrer, recherchez « variables d'environnement » et ouvrez « Modifier les variables d'environnement système ».
     2. Cliquez sur « Variables d'environnement… ».
     3. Dans la section « Variables système », sélectionnez la variable `Path` puis cliquez sur « Modifier… ».
     4. Cliquez sur « Nouveau » et ajoutez le chemin complet du dossier `bin` de Maven (ex : `C:\maven\bin`).
     5. Cliquez sur OK pour valider et fermez toutes les fenêtres.
3. Redémarrez le terminal pour que les variables d'environnement soient prises en compte.

### Vérification

Vérifiez l'installation avec :
```sh
java -version
mvn -version
```
Les deux commandes doivent afficher la version installée.

## Structure
- `src/main/java/app/GuessNumberApp.java` : point d'entrée du serveur Javalin
- `src/main/resources/templates/game.html` : template HTML du jeu

## Dépendances
- [Javalin](https://javalin.io/) (`io.javalin:javalin:5.6.2`)
- [Javalin Rendering](https://javalin.io/documentation#templates) (`io.javalin:javalin-rendering:5.6.2`)
- [SLF4J Simple](http://www.slf4j.org/) (`org.slf4j:slf4j-simple:2.0.13`)
- [Thymeleaf](https://www.thymeleaf.org/) (`org.thymeleaf:thymeleaf:3.1.2.RELEASE`)
- [JTE](https://jte.gg/) (`gg.jte:jte:3.1.5`) *(présent dans le pom.xml, mais non utilisé dans le code)*

