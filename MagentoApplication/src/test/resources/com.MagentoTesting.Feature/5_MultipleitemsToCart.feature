Feature: Adding Multiple Products to Cart & Validating Cart Summary  

Scenario Outline: Adding Multiple Products to Cart & Validating Cart Summary 
Given User opens the browser  
And User navigates to the application URL "https://magento.softwaretestingboard.com/"  
When User clicks the "Sign In" link on the homepage  
And User enters the valid Login Credentials 
|LoginDetails.xlsx|
And User clicks the "Sign In" button 
And User enters the data jacket "Jacket" in the search textbox  
And User selects jacket for men from the auto-suggestion list  '<option1>'
And User clicks on the '<item1>'  from the search results
And User selects size, color, and quantity from 
|LoginDetails.xlsx|  
And User clicks the Add to Cart button 
And User enters the data jackets "Jackets" in the search textbox  
And User selects jackets for women from the auto-suggestion list  '<option2>'
And User clicks on the '<item2>'  from the search results
And User selects size, color, and quantity from 
|LoginDetails.xlsx|  
And User clicks the Add to Cart button 
And User click on cart symbol
Then Verify whether the products are added to cart with message and total price "$149.00"

Examples:  
|option1                |option2           |item1                                    |item2       |											     
|Jacket for men         |Jackets for women |Typhon Performance Fleece-lined Jacket   |Bella Tank  | 
