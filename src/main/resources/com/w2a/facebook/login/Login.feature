Feature: Login to Facebook.com

In order to access Application
As a Admin
I want to login

Scenario: Login in to Facebook.com

Given I open "testsiteurl" on "browser"
And I enter "username" as "seleniumcoaching@gmail.com"
And I enter "password" as "selenium123"
And I click on "signin"
Then login should be a "success"