# Effective Java Examples

This repository contains examples of concepts from the book "Effective Java" by Joshua Bloch, implemented in Java 11 and built with Gradle.

## Table of Contents

- [Getting Started](#getting-started)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Building the Project](#building-the-project)
- [Running Tests](#running-tests)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To get started with this project, clone the repository to your local machine:

```bash
git clone https://github.com/your-username/effective-java-examples.git
```
## Items
The book "Effective Java" by Joshua Bloch is organized into 90 items, each of which provides a specific tip or best practice for writing high-quality Java code. The items are classified into 11 different chapters, each of which covers a particular aspect of Java programming
1. **Introduction**

2. **Creating and Destroying Objects**
   - **Item 1:** Consider static factory methods instead of constructors
   - **Item 2:** Consider a builder when faced with many constructor parameters
   - **Item 3:** Enforce the singleton property with a private constructor or an enum type
   - **Item 4:** Enforce noninstantiability with a private constructor
   - **Item 5:** Prefer dependency injection to hardwiring resources
   - **Item 6:** Avoid creating unnecessary objects
   - **Item 7:** Eliminate obsolete object references
   - **Item 8:** Avoid finalizers and cleaners
   - **Item 9:** Prefer try -with-resources to try - finally

3. **Methods Common to All Objects**
   - **Item 10:** Obey the general contract when overriding equals
   - **Item 11:** Always override hashCode when you override equals
   - **Item 12:** Always override toString
   - **Item 13:** Always override toString
   - **Item 14:** Consider implementing Comparable

## Installation
1. Clone the repository:

```bash
Copy code
git clone https://github.com/KshitijBaluni/effective-java.git
```
2. Navigate to the project directory:

```bash
Copy code
cd effective-java/
```

3. Build the project using Gradle:

```bash
Copy code
./gradlew build
```
This will download all the required dependencies and build the project. If you encounter any errors during the build process, please refer to the project's documentation or contact the project maintainers for assistance.

4. Run the project:

```arduino
Copy code
./gradlew run
```
This will execute the project's main method and launch the application. If you need to pass any command-line arguments to the application, you can do so using the following command:

```arduino
Copy code
./gradlew run --args='arg1 arg2 ...'
```
Replace arg1 arg2 ... with the actual command-line arguments you wish to pass to the application.

That's it! You should now have the project up and running on your local machine.

## Usage
1. Clone the repository:

```bash
Copy code
git clone https://github.com/KshitijBaluni/effective-java.git
````
2. Navigate to the project directory:

```bash
Copy code
cd effective-java/
```
3. Choose the item you want to learn from the book and navigate to the corresponding package:

```bash
Copy code
cd item-01/
```
4. Open the source code file:

```css
Copy code
open src/main/java/com/example/item01/MyClass.java
```
Replace MyClass.java with the actual source code file you want to view.

5. Study the code and read the comments to understand the concepts and best practices presented in the book.

6. Build and run the project using Gradle:

```bash
Copy code
./gradlew build
./gradlew run
```
This will execute the main method of the application and demonstrate how the concepts presented in the book can be applied in practice.

7. Repeat steps 3-6 for each item you want to learn from the book.

That's it! The Effective Java repository provides examples of best practices and common pitfalls in Java programming, and you can use it to learn from the experience of seasoned Java developers.

## Build the Project

To build the project, you will need to have Java 11 and Gradle installed on your machine.

Navigate to the project directory and run the following command to build the project:

```bash
./gradlew build
```

This will compile the source code, run the tests, and generate any necessary artifacts (such as JAR files) in the build directory.

If the build is successful, you should see a message like this at the end of the output:

```bash
BUILD SUCCESSFUL in 5s
7 actionable tasks: 7 executed
```

If the build fails, you will see an error message explaining what went wrong. You can usually find more detailed error messages in the build/reports directory.

In addition to the build task, Gradle provides many other useful tasks for managing your project. You can see a list of all available tasks by running:

```bash
./gradlew tasks
```
This will show a list of tasks grouped by category (such as "Build Setup", "Verification", etc.)

## Running Tests
To run the tests individually, run the following command:

```bash
Copy code
./gradlew test --tests <TestClassName>
```
For example, to run tests for the BuilderPatternTest class, you would run:

```bash
Copy code
./gradlew test --tests BuilderPatternTest
```

## Contributing
Contributions to this project are welcome! To contribute, fork the repository and create a new branch for your changes:

```bash
Copy code
git checkout -b my-new-feature
```
After making your changes, submit a pull request to have your changes reviewed and merged into the main branch.

## License
This project is licensed under the [MIT License](https://opensource.org/licenses/MIT) 
see the [LICENSE](https://chat.openai.com/LICENSE) file for details.

The MIT License is a permissive open-source software license that allows users to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the software, subject to certain conditions. It is a popular license for many open-source projects due to its simplicity and flexibility. For more information, see the [MIT License](https://opensource.org/licenses/MIT) page on the Open Source Initiative's website.