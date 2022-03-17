Feature:  Add new Customer
Scenario: Sucessfull add new customer
  
Given User launch Chrome Browser
Then  User open URL "https://admin-demo.nopcommerce.com/login"
And   User enters Email as "admin@yourstore.com" and Password as "admin"
Then  User click on Login
Then  Page Title should be Dashboard
When  User click on customers menu    
And   User click on customers item
Then  User click on Add New button
Then  User can view Add a new customer page
Then  User enters customer info
And   User click on save button
Then  User can view configration message "The new customer has been added successfully."
And   User close browser
 