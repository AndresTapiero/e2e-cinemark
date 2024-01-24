## Table of Contents

- [Technologies Used](#technologies-used)
- [Folder Structure](#folder-structure)
- [Setup and Running](#setup-and-running)
- [Design Patterns](#design-patterns)
- [Created By](#created-by)

## Technologies Used

- **Serenity**: Test automation framework that integrates with Cucumber for behavior-driven development (BDD).
- **Cucumber**: BDD tool for writing acceptance tests in a human-readable format.
- **Appium**: Open-source tool for automating mobile applications.
- **Java**: Programming language used for test implementation.
- **Gradle**: Build tool used to manage dependencies and build the project.
- **Other Dependencies**: Add any other significant dependencies or tools used.

## Folder Structure

The project structure is organized as follows:

```bash
|-- .gitignore
|-- README.md
|-- build.gradle
|-- gradlew
|-- gradlew.bat
|-- serenity.properties
|-- src
    -- test
        |-- java
        |   -- com
        |       -- andrest
        |           |-- runners
        |           |   |-- AcceptanceTestSuite.java
        |           |-- steps
        |           |   |-- ParameterDefinitions.java
        |           |   |-- RegisterStepDefinitions.java
        |           |   |-- SearchMovieStepDefinitions.java
        |           |-- targets
        |           |   |-- BillboardTargets.java
        |           |   |-- BillingDataTargets.java
        |           |   |-- LocationTargets.java
        |           |   |-- RegisterTargets.java
        |           |-- tasks
        |           |   |-- BillingForm.java
        |           |   |-- LoginForm.java
        |           |   |-- RegisterForm.java
        |           |   |-- SelectCity.java
        |           |   |-- SelectMovie.java
        |           |-- utils
        |               |-- ScrollUtils.java
        |               |-- Constants.java
        |-- resources
            |-- features
            |   |-- create_booking.feature
            |   |-- search_accommodations.feature

```

## Setup and Running

Follow these steps to set up and run the project:

1. **Clone Repository**:
    - <code> https://github.com/AndresTapiero/e2e-cinemark.git</code>


2. **Install Dependencies**:
   <code>./gradlew install</code>

3. **Run Appium server**:
   You need to have appium installed in your local machine and then run in your terminal
   <code>appium</code>

5. **Run Tests**:
   <code>./gradlew clean test</code>

Add any additional steps or configurations required to run the project.

## Design Patterns

- Page Object Model
- Screenplay Pattern

## Created By

- Andrés Tapiero