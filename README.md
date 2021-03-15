# BMO-test

This is a maven project that consists of all the dependencies required for Cucumber and Selenium. The dependencies are mentioned in the pom.xml file. There are two packages namely **cucumber_test** and **step_definition** under src/test/java. There are two folders namely **Feature** and **Drivers**

## Feature folder:
Consists of 3 feature files;
1. LoginTest.feature, 
2. SearhCuisines.feature, and 
3. SearchRestaurants.feature

## Drivers folder:
Consists of Chrome driver but, can contain more

## Packages:
1. cucumber_test (run thisto execute the Cucumber Test):
consists of TestRunner.java class which tells JUnit to use Cucumber Class and CucumberOptions Class in order to execute the feature files which are in turn glued to the classes under the step_definition package.
2. step_definition:
consists of Test_Steps class that contains Selenium code to execute the test steps.
