@datadriven
Feature: This is DataDrivenWithHeader orangeHRM application
Scenario: This is login scanario for orangeHRM
Given Go the login page
When  enter the valid credentials
|username|password|
|Admin|admin123|
And  click login button
