#Author:
#User Story Name:
#User Story Id:
#Purpose:
#DEscription:

Feature: Login and Logout functionality
Description: Verify the Login and Logout functionality

Scenario Outline: Verify the Login functionality with valid data
Given I launch the Chrome Browser
And I navigate the application url
When I enter "<username>" in username text field
And I enter "<password>" in password text field
And I click on login button
Then I find the Home Page
And I minimize the flyout window
Given I find the Home Page
When I click on Logout link
Then I find the login page
And I close the Application

Examples:
|username|password|
|admin|manager|
|admin|manager|
|admin|manager|

