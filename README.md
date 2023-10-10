# CalendarAPI

Ce projet est une API qui fournit un service de génération de calendrier. Il utilise la bibliothèque CalendarGenerator pour générer des calendriers.

## Installation

Avant de commencer, assurez-vous d'avoir installé les logiciels suivants :
- Java Development Kit (JDK)
- Apache Maven

### Clonage de la bibliothèque CalendarGenerator

La bibliothèque CalendarGenerator est nécessaire pour générer des calendriers. Pour la cloner, suivez ces étapes :

1. Ouvrez une invite de commande ou un terminal.
2. Exécutez la commande suivante pour cloner le dépôt GitHub de la bibliothèque :

```bash
git clone https://github.com/juva-quentin/CalendarGenerator.git
```

# Construction de la bibliothèque CalendarGenerator
Une fois que vous avez cloné la bibliothèque, vous pouvez la construire en utilisant Apache Maven. Voici comment faire :

1. Accédez au répertoire de la bibliothèque CalendarGenerator à l'aide de la ligne de commande.
2. Exécutez la commande Maven suivante pour construire la bibliothèque :

```bash
mvn clean install
```
La bibliothèque CalendarGenerator sera construite et installée localement dans votre référentiel Maven.

# Exécution de l'API
Maintenant que vous avez cloné la bibliothèque CalendarGenerator et construit la bibliothèque, vous pouvez exécuter l'API. Voici comment faire :

1. Clonez ce projet (CalendarAPI) si ce n'est pas déjà fait.
2. Accédez au répertoire du projet CalendarAPI à l'aide de la ligne de commande.
3. Exécutez la commande Maven suivante pour démarrer l'API :
```bash
mvn spring-boot:run
```
L'API sera lancée et sera accessible à l'adresse
`http://localhost:8080`.

# Utilisation de l'API
Une fois que l'API est en cours d'exécution, vous pouvez l'utiliser pour générer des calendriers. Voici comment faire une demande pour générer un calendrier :

- Utilisez une application HTTP (comme Postman) ou un navigateur web.
- Effectuez une requête GET à l'URL `http://localhost:8080/api/generateCalendar`.
- Incluez les paramètres year (année) et month (mois) dans la requête. Par exemple, `http://localhost:8080/api/generateCalendar?year=2023&month=10`.

L'API renverra un calendrier au format JSON en réponse à votre demande.

N'hésitez pas à explorer davantage les fonctionnalités de cette API pour générer des calendriers personnalisés.

Pour plus d'informations sur l'utilisation de Spring Boot, consultez la documentation Spring Boot.
