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

### ApplicationContext

### Component Scanning and Stereotype Annotations

### Spring Data JPA

### Spring MVC

### Installation and Setup