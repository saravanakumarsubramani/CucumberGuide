@datadriven
Feature: This DatadrivenWithoutHeader orangeHRM application
Scenario: This is login scanario for orangeHRM
Given You are on the login page
When You enter the valid credentials 
|Admin|admin123|
And You clicks the login button
Then You should see the home page screen