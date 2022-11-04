# SQA.Technical.Test

---

## Project Purpose
This project aims to give an inspiring or sample of automation test framework that uses Selenium and Cucumber with Java as the programming language.

You can see pieces of framework components that build on master git branch.

---

## Tools and Libraries
In this project is used 2 main tools, Selenium and Cucumber.
On the other hand, I used some of the tools that support this great framework.
The complete list of tools, you can see in the `pom.xml` file.

## Requirements
* Java Development Kit(11)
* Maven
* WebDriver, using ChromeDriver

## Running Tests
* Clone the repository from your fork to this directory
* Open the project using any Java IDE
* Run the tests with the script below
```shell
$ mvn clean verify
```
* If you want to run the specific test, use the cucumber tags like this
```shell
$ mvn clean verify -Dcucumber.filter.tags="@REPLACE_WITH_ANY_TAGS_THAT_YOU_WANT"
```

## Test Results
* Test report automatically generated on `target` folder after finished the test execution
* See test report from `target/cucumber-reports/cucumber-html-reports/overview-features.html`
* You can also share your Cucumber Report with another person at https://reports.cucumber.io, just go to `src/test/java/SQA_Technical_Test/Runner/CukesRunner/Publish` then change the value to be `true`
```properties
$ -Dcucumber.publish.enabled=true
```
* For more information about reports cucumber you can go to https://reports.cucumber.io/docs/cucumber-jvm

---

### References
* https://cucumber.io/docs/installation/java/
* https://www.selenium.dev/documentation/en/
* https://www.w3schools.com/java/
* https://www.oracle.com/java/technologies/javase/codeconventions-introduction.html
