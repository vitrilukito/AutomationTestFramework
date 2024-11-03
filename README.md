# Demo Blaze Web UI and Gorest API Automation Tests Framework

This repository contains two automation tests:
- **First**: the web UI automation test project for [Demo Blaze Product Store](https://www.demoblaze.com) e-commerce website. It is built using Cucumber, WebDriverManager, and Selenium, and aims to ensure the functionality of the homepage, login page, product page, about page, signup page, contact page and cart. The repository includes source code for the project, POM implementation, Gherkin test cases, and Cucumber implementation, along with sample test cases.
- **Second**: the API automation test project for Gorest. It is built to test the [Gorest API](https://www.gorest.co.in/) using positive test cases, negative test cases, and boundary tests. It leverages various dependencies like RestAssured, Cucumber, Assertion, JSON and JSONSchemaValidator for API testing and validation.

Both projects are written in Java programming language, using the JUnit testing framework and Gradle as the build tool.

## Table of Contents

- Technologies Used
- Project Structure
- Requirements
- Dependencies
- Installation
- Configurations
- Running Tests
- Test Cases

## Technologies Used

- **Java**: The primary programming language for the project.
- **Cucumber**: A testing tool that supports Behavior Driven Development (BDD) for defining test cases in Gherkin syntax.
- **Gradle**: A build automation tool used to manage dependencies and build the project.
- **Selenium**: A web automation tool for interacting with web applications.
- **Rest Assured**: An API automation tool to test and validate RESTful APIs.
- **JSON**: A text-based format for storing and exchanging data in each request in an API.

## Project Structure

### Gorest API Automation Test
Here is the breakdown of the project structure:
- **api.feature**: The feature file that contains the scenarios to be tested in Gorest API.
- **JSON Schema Data**: Defines the structure and validation rules for JSON objects used in API requests and responses, ensuring data integrity.
- **Endpoint**: The specific URL path for accessing the Gorest API, enabling interaction with resources like users and posts.
- **Models**: Defines the structure and behavior of data objects used in the application. It includes static responses that link API responses to their respective page representations, facilitating smooth integration and data flow between components.
- **Utility**: Contains helper functions and classes that provide common functionality, promoting code reuse and simplifying application logic.
- **ApiPage**: Object-oriented representations of API endpoints or related logic.
- **ApiRunner**: Contains the runner classes for running the Cucumber tests.
- **ApiStep**: Contains the step definitions that link Cucumber steps to actual code logic.


### Demo Blaze Web UI Automation Test
Here is the breakdown of the project structure:
- **login.feature**: Contains scenarios for testing the login functionality, including valid and invalid login attempts.
- **products.feature**: Tests the product page, such as displaying available products and adding them to the cart.
- **cart.feature**: Tests the shopping cart functionalities, including viewing items and removing products.
- **contact.feature**: Tests the functionality of the contact form.
- **home.feature**: Test the functionality of the category buttons and carousel slides in the homepage.
- **signup.feature**: Contains scenarios for testing the signup functionality, including valid and invalid signup attempts.
- **Models**: Encapsulate the interactions with the UI elements on each page, providing methods to perform actions (like clicking buttons, entering text) and verify page content.
- **Utility**: This includes classes for managing the WebDriver instance, handling configuration settings, and providing reusable methods for various tasks.
- **WebPage**: Each class defines the elements on the page and the methods that encapsulate interactions with those elements. The methods within these classes are called by step definitions in the Cucumber tests.
- **WebStep**: Contains the step definition classes for Cucumber scenarios. Each class corresponds to a feature file and implements the methods that define how to interact with the web application during testing.
- **CucumberTest**: This is used to generate reports in HTML and JSON files.
- **Hooks**: These are blocks of code that run before or after each scenario. They allow us to set up any preconditions or perform clean-up tasks after tests.

## Requirements

- [Java 8 or above](https://www.oracle.com/java/technologies/javaese-downloads.html)
- [IntelliJ IDEA](https://www.jetbrains.com/idea) or another Java IDE
- [Gradle](https://www.gradle.org/install/) for dependency management and build automation
- [JUnit](https://junit.org/junit5/)
- [RestAssured](https://rest-assured.io/)
- [Maven Repository](https://mvnrepository.com)
- [Cucumber](https:cucumber.io)
- [JSONValidator](https://github.com/json-schema-org./json-schema-validator)
- [Selenium Web Driver](https://www.selenium.dev/documentation/webdriver/)
- Browser: The latest version of Google Chrome with the latest version of the WebDriver installed

## Dependencies

The following dependencies are included in the project:

- testImplementation platform('org.junit:junit-bom:5.10.0')
- testImplementation 'org.junit.jupiter:junit-jupiter'
- testImplementation 'org.junit.vintage:junit-vintage-engine:5.7.2'
- implementation group: 'io.cucumber', name: 'cucumber-java', version: '7.20.1'
- implementation group: 'org.seleniumhq.selenium', name: 'selenium-java', version: '4.25.0'
- testImplementation group: 'junit', name: 'junit', version: '4.13.2'
- testImplementation("io.github.bonigarcia:webdrivermanager:5.9.2")
- testImplementation group: 'io.cucumber', name: 'cucumber-junit', version: '7.20.1'
- testRuntimeOnly 'org.junit.jupiter:junit-jupiter-engine:5.9.0'
- testImplementation group: 'org.assertj', name: 'assertj-core', version: '3.26.3'
- testImplementation 'org.junit.jupiter:junit-jupiter-api:5.8.1'
- testImplementation group: 'io.rest-assured', name: 'rest-assured', version: '5.5.0'
- testImplementation group: 'org.json', name: 'json', version: '20240303'
- implementation group: 'io.rest-assured', name: 'json-schema-validator', version: '5.5.0'


## Installation

1. Clone the repository:
   git clone https://github.com/vitrilukito/AutomationTestFramework
2. Open the project in IntelliJ IDEA or your preferred IDE
3. Ensure that Gradle is installed and properly configured in your IDE
4. Run the following Gradle command to download the required dependencies: ./gradlew build

## Configurations

To run this project, make sure you have the following configured:
1. **Java Development Kit (JDK)**: Install JDK 8 or higher on your machine. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk8-downloads.html) or use [OpenJDK](https://www.openjdk.java.net/install/).
2. **Gradle**: Ensure you have Gradle installed. You can install it following the instructions on the [Gradle website](https://gradle.org/install/).
3. **IntelliJ IDEA**: Use IntelliJ IDEA as your IDE for coding. You can download it from the [JetBrains website](https://jetbrains.com/idea/download/).
4. **Dependencies**: The project uses the following dependencies, which are included in the 'build.gradle' file:
   - JUnit
   - Selenium
   - Cucumber
   - Web Driver Manager
   - Assertion 
   - RestAssured
   - JSON
   - JSONSchemaValidator
  
After setting up these tools, you can run the tests and work on the project.

## Running Tests

You can run the tests in the project using the Gradle wrapper or directly from the IDE.

### Running via IDE

1. Navigate to the Runner class.
2. Right-click the class and select "Run" to execute the Cucumber feature.

### Running via Command Line
1. Use the Gradle command: ./gradlew test

## Test Cases

### Gorest API Automation Test

This project includes a total of 23 test cases categorized into:
- **Positive Test Cases**: Validate the successful execution of API calls with valid inputs.
- **Negative Test Cases**: Verify the API's behavior with invalid inputs or missing required fields.
- **Boundary Test Cases**: Ensure correct handling of boundary values (e.g., maximum and minimum limits).

- **Positive Test Cases**: Validate the successful execution of the GET, POST, PUT, and DELETE requests.

**Sample of positive test case:**


<img width="665" alt="image" src="https://github.com/user-attachments/assets/857dcbb8-9f20-4e27-98b6-5c40e7bc6500">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="612" alt="image" src="https://github.com/user-attachments/assets/7aa47067-4abb-41a4-96e1-8002102f5355">



**Page Object:**
The WebPage class of the above test case is as below:


<img width="572" alt="image" src="https://github.com/user-attachments/assets/6aa9934c-3979-47c6-97ec-bb93fa9b26c6">
<img width="688" alt="image" src="https://github.com/user-attachments/assets/72800dca-5b8e-4d70-88c6-f4014bda38eb">



- **Negative Test Cases**: Verify the API's behavior with invalid inputs, invalid usernames, or missing required fields.

**Sample of negative test case:**


<img width="470" alt="image" src="https://github.com/user-attachments/assets/14e5867b-5442-44ad-8051-d780bd6bb34c">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="468" alt="image" src="https://github.com/user-attachments/assets/dd403548-2cc3-4172-825d-b78a590eae28">



**Page Object:**
The WebPage class of the above test case is as below:


<img width="515" alt="image" src="https://github.com/user-attachments/assets/2b32bf46-b079-4632-b1dd-3db00f420ccb">



- **Boundary Test Cases**: Explore the boundaries of input domains for APIs, including the valid and invalid values.

**Sample of boundary test case:**


<img width="659" alt="image" src="https://github.com/user-attachments/assets/3595397c-7c21-451a-9636-1230eb268c41">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="580" alt="image" src="https://github.com/user-attachments/assets/ea351084-8c56-4ed5-8d52-3cd80ed3ff70">



**Page Object:**
The WebPage class of the above test case is as below:


<img width="618" alt="image" src="https://github.com/user-attachments/assets/bb33b5de-e743-4499-b0a9-5ac5954bb96a">



You can view all the test cases in the [api.feature file](src/test/resources/apiFeatures/api.feature).


### Demo Blaze Web UI Automation Project

This project includes a total of 6 pages and 39 test cases categorized into:
- **Positive Test Cases**: Validate the successful execution of the homepage, login page, product page, signup page, cart and contact page with valid inputs.

**Sample of positive test case:**


<img width="546" alt="image" src="https://github.com/user-attachments/assets/e422fbbe-ffa8-46fb-a159-3bdd317e7795">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="520" alt="image" src="https://github.com/user-attachments/assets/b0e28c3b-9a6c-4173-81d2-29b95992ca03">



**Page Object:**
The WebPage class of the above test case is as below:


<img width="605" alt="image" src="https://github.com/user-attachments/assets/6f698fcb-04b3-44d6-aae8-50d210fe211e">
<img width="668" alt="image" src="https://github.com/user-attachments/assets/26711b62-9e73-4d3b-916d-00bc6f6c2373">



- **Negative Test Cases**: To ensure that the website behaves correctly in adverse conditions and can handle invalid inputs or unexpected user actions.

**Sample of negative test case:**


<img width="628" alt="image" src="https://github.com/user-attachments/assets/4f4484b5-b5ba-4009-bee6-ff8aae1bfce0">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="706" alt="image" src="https://github.com/user-attachments/assets/656317a4-e52f-4fad-a70f-2269ff3c4d6b">



**Page Object:**
The WebPage class of the above test case is as below:


<img width="887" alt="image" src="https://github.com/user-attachments/assets/e478d370-de54-4c7f-806c-c8269ac248ef">



- **Boundary Test Cases**: Ensure correct handling of boundary values, including invalid inputs.

**Sample of boundary test case:**


<img width="647" alt="image" src="https://github.com/user-attachments/assets/9664d31e-a293-48ba-bb20-e795d2a7021c">



**Step Definitions:**
Here are the step definitions that implement the above test case:


<img width="681" alt="image" src="https://github.com/user-attachments/assets/824e59ee-120e-4fac-be04-3d19b3d743dd">


**Page Object:**
The WebPage class of the above test case is as below:


<img width="747" alt="image" src="https://github.com/user-attachments/assets/647fe189-6f8b-4abf-8f4b-0ead2a84ed89">



The test cases are presented in 6 different files. You can view all the test cases here:
- [cart.feature](src/test/resources/features/webFeatures/cart.feature)
- [home.feature](src/test/resources/features/webFeatures/home.feature)
- [login.feature](src/test/resources/features/webFeatures/login.feature)
- [products.feature](src/test/resources/features/webFeatures/products.feature)
- [contact.feature](src/test/resources/features/webFeatures/contact.feature)
- [signup.feature](src/test/resources/features/webFeatures/signup.feature)

