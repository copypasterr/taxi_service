# Taxi Management Service

A [taxi service](http://taxi-env.eba-4mp66kps.eu-west-3.elasticbeanstalk.com/) management system that allows users to manage vehicles and drivers.

![Logo](logo.jpeg)

## Navigation
- [Introduction](#introduction)
- [Installation and Deployment](#installation-and-deployment)
- [Features](#features)
- [Technology](#technology)
- [Author](#author)

## Introduction
Web application aims to provide an efficient taxi management service.

## Installation and Deployment
- Install IntelliJ IdEA;
- Clone project to your local machine;
- Configure your Mysql database and run init_db.sql;
- Also, you have to configure taxi/util/ConnectionUtil for connection to your database;
- Build the project using Maven: mvn clean install;
- Deploy the WAR file to a servlet container such as Tomcat or other;
- After deploying the project, you can use the web application using the link http://localhost:8080/ in your browser
- The project was deployed to get acquainted with the functionality on AWS <br/> elastic beanstalk http://taxi-env.eba-4mp66kps.eu-west-3.elasticbeanstalk.com/

## Features
- Registration of drivers;
- Authentication;
- Password hashing support;
- Add/delete cars, manufacturers, drivers;
- Adding/removing a driver to a specific car;
- Display of information about drivers, manufacturers, driver's cars from DB;

## Technology
- Mysql v.8.0.22;
- jbcrypt v.0.4 (for hashing password);
- javax.servlet-api 4.0.1
- Maven v.3.8.7
- Tomcat v.9.0.73
- JDBC v.4.2
- jstl v.1.2

## Author
Volodymyr Prysiazhniuk