**Name:** Annsona Ansilon Dores
**Student Id:** C0932173

**Assignment Title:** Assignment 1
**Assignment Description**:
In this project, we implemented Java classes `Dog` and `Person` that interact with each other. The `Dog` class holds attributes like the dog's name and age, while the `Person` class includes a reference to a `Dog` object and methods for managing the relationship between the person and their dog. The project also includes unit tests for validating the functionality of both classes using JUnit.

**Instructions to Run Code and Unit Tests**

**Prerequisites:**
1. **Java Development Kit (JDK)**:
   - Ensure you have JDK 11 or higher installed on your system

2. **Maven**:
   - IntelliJ IDEA automatically integrates with Maven, so there's no need for separate installation of Maven. You just need to make sure it's properly configured in your project.

3. **JUnit (for Unit Testing)**:
   - Ensure that **JUnit 5** is included in your `pom.xml` dependencies. IntelliJ IDEA will recognize this automatically when you open the project.

**Steps to Run the Project**:

**1. Clone the repository**:
Clone the project to your local machine by running:
cmd: git clone https://github.com/yourusername/MyJavaProject.git

**2. Navigate to the project directory**:
      cmd: cd path/to/the/project

**3. Compile the code**:
   Maven automatically handles the compilation of the code. To compile the project, run:
   cmd: mvn compile

**4. Running the application**:
   If the project has a main method in the Person or Dog class, you can run the application using Maven:
   cmd mvn exec:java

**Note: Ensure you have the following plugin configured in your pom.xml**:
<plugin>
    <groupId>org.codehaus.mojo</groupId>
    <artifactId>exec-maven-plugin</artifactId>
    <version>3.1.0</version>
    <executions>
        <execution>
            <goals>
                <goal>java</goal>
            </goals>
        </execution>
    </executions>
</plugin>


**Steps to Run Unit Tests**:
**1. Ensure JUnit dependency is added**:
Make sure that the JUnit 5 dependency is included in your pom.xml. Here's the necessary dependency:

<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>

**2. Run Unit Tests**:
   To run your unit tests with Maven, use the following command:
   cmd: mvn test (Maven will automatically execute the tests located in the src/test/java/ directory)

