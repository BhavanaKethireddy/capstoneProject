Feature: Checking Logout Functionality 

Scenario Outline: To check the Logout functionality 
Given User opens the browser 
And User navigates to the application URL "https://magento.softwaretestingboard.com/" 
When User clicks the link "Sign In" 
And User enters valid email '<ValidEmail>' 
And User enter password '<Password>' 
And User clicks the "Sign In" button 
When User clicks "My Account" 
Then User clicks "Sign Out" from my account
Then User verifies that the session ends and user is redirected to the homepage 
Examples: 
|ValidEmail|Password|
|kbhavs10@gmail.com|password@123|
