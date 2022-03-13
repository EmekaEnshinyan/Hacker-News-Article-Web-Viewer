# HackerNews-Article-API-Web-Viewer-Front-End
Fundamental function: A full stack application that makes an API call to Hacker News, collects JSON data, parses the data and sends it to the front end client to do be formatted and displayed on a webpage in a readable format.

This API design displays the data of a news article that was retrieved from the Hacker News API currently using a localhost port. The technologies useed are Java, Springboot in Spring MVC Structure, Javascript, React.js, Atom, MaterialUI, and Node.js.

[![](https://img.shields.io/badge/license-Spring-darkgreen.svg?)](https://www.apache.org/licenses/LICENSE-2.0)
[![](https://img.shields.io/badge/license-Node-blue.svg?)](https://github.com/nodejs/node/blob/master/LICENSE)
[![](https://img.shields.io/badge/license-React-lightblue.svg?)](https://github.com/facebook/react/blob/main/LICENSE)

*Questions?  Comments?  Feedback? Email me at emeka.enshinyan@gmail.com 

-----



# Documentation
1. [Requirements](#Requirements)
2. [Setup](#Setup)
3. [Running-The-Application](#Running-The-Application)
4. [Plans-&-Improvements](#Plans-&-Improvements)

## Requirements
**NOTE** This has not been tested on a Mac or Linux OS.

###### The following tools are required to to have the application run:
- Java 15 (can also be run on Java 8)
- Apache-Maven version 15
- Internet connection
- A means to compile and run the Java code (the editors I used were IntelliJ for Java and VSCode for JS)
- Node.JS
- Bootstrap

## Setup
##### Back End
1. Download the [Back End Repo](https://github.com/EmekaEnshinyan/HackerNews-API-Design-Back-End.git)
2.  Make sure the server is listening in on the right port (default 8080)
##### Front End
1. Download the [Front End Repo](https://github.com/EmekaEnshinyan/HackerNews-API-Design-Front-End.git) and open it in VSCode
2. make sure it is listening on a different port (default is 3000)

## Running-The-Application
1.  Run the server through IntelliJ by compiling and running the program (you can test via Postman or type in **localhost:8080/hn/articles** in a browser) 
2. type the following in the terminal either in VSCode or in Windows CLI:
```
$cd [directory of HackerNews-API-Design-Front-End repository]
```
then npm start:
```
$C:\Users\user\HackerNews-API-Design-Front-End> npm start
```
A new browser tab should open up showing a list of the Article Data categories predefined by Hacker News.

## Plans-&-Improvements

display the top 500 trending articles
integrate DB
