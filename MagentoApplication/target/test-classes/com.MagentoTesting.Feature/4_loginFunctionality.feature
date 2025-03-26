Feature:
Scenario Outline: Login with Valid & Invalid Credentials
Given User opens the browser  
And User navigates to the application URL "https://magento.softwaretestingboard.com/"
When User clicks on "Sign In" 
And User enters e-mail '<InvalidEmail>'
And User enters password '<password>'
And User clicks on "sign In" button 
Then User should see error message "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later."
When User enters valid-email '<validEmail>' 
And user enter valid password '<password>'
And User again clicks on "Sign In" button
Then User verifies "Home Page" displayed after login

Examples:
|InvalidEmail|password|validEmail|
|kbhavs9@gmail.com|password@123|kbhavs10@gmail.com|