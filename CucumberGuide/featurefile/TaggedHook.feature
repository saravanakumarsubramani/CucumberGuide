@TaggedHook
Feature: test tagged hook

@First
Scenario: This is the 1 first scenario
 Given This is the 1 first step
 When This is the  1 Second step
 Then This is the 1 Third step
 
 @Second
Scenario: This is the 2 Second scenario
 Given This is the 2 first step
 When This is the 2 Second step
 Then This is the 2 Third step
 
 @Third
Scenario: This is the 3 Third scenario
 Given This is the 3 first step
 When This is the 3 Second step
 Then This is the 3 Third step