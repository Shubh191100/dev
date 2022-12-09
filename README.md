# Movie Information Validation

## Table of contents
- Introduction
- Requirements
- Configuration
- Coding Steps

## Introduction
In Movie Information Validation project, We have extracted the details(Release Date and Country of Origin) of the movie (Pushpa: The Rise) from two sources i.e. IMDB and Wiki Once the Release Date and Country of Origin are extracted from both the sources, we have written a test script for comparing data from both the sources(IMDB and Wiki) and marking test case as fail if details are not matching.

## Requirement
- Eclipse
- JDK
- TestNG

## Configuration

### Dependencies
  - junit(Version: 5.3.2)
  - Selenium(Version: 4.1.2)
  - Testng(Version: 7.4.0)
  - Apache(Version: 4.1.2)
  
## Coding Steps
  - Open Eclipse, create Maven project.
  - Create Hybrid Data Driven Framework using POM (Page Object Model)
  - Create 2 package in src/test/java i.e.
    - pageObject (To store web element)
    - TestCases
  - In pageObject package create class file movie.java and store all web elements.
  - In TestCases package create class file common.java and write code for launching browser and write test cases for comparing movie release date and country origin.
  - Create testng.xml file and add testcase class name.
  - Run testnd.xml file (i.e. Right click on testng.xml file -> run as -> TestNG Suit)
    
