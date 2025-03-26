Feature: Checking User Registration  

Scenario Outline: User registration with valid and invalid data  
Given User opens the browser  
And User navigates to the application URL "https://magento.softwaretestingboard.com/"  
When User clicks on Create an account 
And User enters the valid '<FirstName>' in firstname textbox  
And User enters the valid '<LastName>' in lastname textbox  
And User enters the invalid '<InvalidEmail>' in email textbox  
And User enters the valid '<Password>' in password textbox  
And User enters the valid '<ConfirmPassword>' in confirm password textbox  
And User clicks the Create an account button  
Then User verifies the '<Error message>' displayed under the email textbox  
When User re-enters the email with valid data '<ValidEmail>'  
And User again clicks the Create an account button  
Then User verifies '<Message>' in the next page  

Examples:  
|FirstName|LastName|InvalidEmail|Password|ConfirmPassword|Error message|ValidEmail|Message|  
|bhav|kethi| 		|Password@123|Password@123|This is a required field.|kbhavs8308088009788889@gmail.com|Thank you for registering with Main Website Store.|
    