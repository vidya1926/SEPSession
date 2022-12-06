Feature: Create Lead  Funtionality

Background:
Given Open the Chrome browser-maximize the window and set the timeout
And Load the application url "http://leaftaps.com/opentaps/control/main"

Scenario Outline: Create Lead with different sets of data

Given Enter username as 'DemoSalesManager'
And Enter password as 'crmsfa'
And Click the Login Button 
And Click the CRMSFA Button 
And Click the Create Lead 
And Enter the mandatorydata
When Submit button is Clicked 
Then  Verify the lead is created successfully 
Examples:
|Excel|Location|Sheet|
|createLead.xlsx|./data/createLead.xlsx|1|
