## SPRING FRAMEWORK

This application is a basic User Management System
built using Spring Core without Spring Boot,
Spring MVC, and Spring Data JPA. It allows users to perform CRUD operations
such as creating, viewing, updating, and deleting users through a web interface.

## Table of Contents
- [Project Structure](#project-structure)
- [Dependency Injection (DI)](#dependency-injection-di)
- [Inversion of Control (IoC)](#inversion-of-control-ioc)
- [Spring Beans](#spring-beans)
- [Bean Scopes](#bean-scopes)
- [ApplicationContext](#applicationcontext)
- [Component Scanning and Stereotype Annotations](#component-scanning-and-stereotype-annotations)
- [Spring Data JPA](#spring-data-jpa)
- [Spring MVC](#spring-mvc)
- [Installation and Setup](#installation-and-setup)

### Project Structure

![Capture d’écran 2024-10-27 180443.png](..%2F..%2FUsers%2FYoucode%2FDownloads%2FCapture%20d%92%E9cran%202024-10-27%20180443.png)

### Dependency Injection (DI)
L'Injection de Dépendances (DI) dans Spring Core est une technique utilisée pour instancier et fournir des objets nécessaires à d'autres objets,
* Types d'Injection de Dépendances dans Spring
 - Injection par constructeur : Les dépendances sont injectées via un constructeur.
 - Injection par setter : Les dépendances sont injectées via des méthodes de type "setter".
 - Injection par interface : Elle consiste à injecter des dépendances via une méthode d’interface spécifique.

Depuis Spring 2.5, on peut utiliser les annotations pour éviter les fichiers XML et définir la configuration directement dans les classes.

### Inversion of Control (IoC)
L'inversion de contrôle (IoC) est un principe ou c'est le framework (comme Spring) qui prend en charge la gestion des objets, au lieu que le programmeur gère manuellement leur création.
### Spring Beans
Un Spring Bean est un objet géré par le contexte de Spring (IoC container) qui gère son cycle de vie, ses dépendances, et ses configurations

* Caractéristiques principales des Spring Beans
 - Gestion par le conteneur Spring : Spring crée, configure, et gère les beans tout au long de leur cycle de vie. Cette gestion inclut l’injection des dépendances et la configuration selon les besoins de l’application.
 - Configuration via le fichier XML, les annotations ou Java : Les beans peuvent être définis dans un fichier XML (applicationContext.xml), directement avec des annotations (@Component, @Service, @Repository, etc.), ou avec une configuration Java (@Configuration).
 - Singleton par défaut : Par défaut, chaque bean en Spring est un singleton, ce qui signifie qu’une seule instance du bean est créée et partagée dans tout le conteneur.
 - Injection de dépendances : Le conteneur Spring gère l’injection de dépendances des beans.

### Bean Scopes
Les Beans Spring sont des objets Java gérés par le conteneur IoC de Spring. Les beans sont créés, configurés et gérés par le conteneur IoC de Spring. Les beans sont définis dans le fichier de configuration Spring (applicationContext.xml)

### ApplicationContext
ApplicationContext est l'interface principale du conteneur IoC (Inversion of Control) de Spring. Il est responsable de la création, configuration et gestion des beans, ainsi que de l'injection de leurs dépendances

### Component Scanning and Stereotype Annotations
Component scanning est une fonctionnalité de Spring qui permet à Spring de découvrir et d'enregistrer automatiquement les beans dans le conteneur IoC de Spring. Les annotations de stéréotype sont utilisées pour indiquer le rôle d'une classe dans l'application.
### Spring Data JPA
Spring Data JPA est une partie de Spring Data dédiée aux bases de données utilisant JPA (Java Persistence API). Il facilite l'interaction avec une base de données en éliminant le besoin d'écrire du code de persistance détaillé ou des requêtes SQL.
### Spring MVC
Spring MVC est une partie du framework Spring qui fournit une architecture modèle-vue-contrôleur pour construire des applications web. 
### Installation and Setup