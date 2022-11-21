@datadriven
Feature: This is DataDrivenWithExample orangeHRM application
Scenario Outline: This is login scanario for orangeHRM application
Given proceed to login page
When  enter the valid credentials "<username>" and "<password>"
And Clicked login button

Examples:
|username|password|
|Admin|admin123|
|Admin|admin13|
|Admin|admin12|
|Admin|admin11|