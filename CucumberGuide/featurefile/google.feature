@opengoogle@datadriven
Feature: open google.com feature for simplelogin

@positive
Scenario: open google website and search
 Given user is the entering google.com
 When the user clicks the search term "saravanakumar"
 And enters the return key
 Then the user should see the  results for saravanakumar 
 
@negative 
 Scenario: open google website and search
 Given user is the entering google.com
 When the user clicks the search term "saravanakumar"
 And enters the return key
 Then the user should see the  results for saravanakumar 