Feature: Login

Scenario: Sucessfully login with valid credential

Given User launch Chrome Browser
Then  User open URL "https://admin-demo.nopcommerce.com/login"
And   User enters Email as "admin@yourstore.com" and Password as "admin"
Then  User click on Login
Then  Page Title should be "Dashboard / nopCommerce administration"
When  User click on Logout link
Then  Page Title should be "Your store. Login"
And   Close the Browser


Scenario Outline: Login with Data Driven

Given User launch Chrome Browser
Then  User open URL "https://admin-demo.nopcommerce.com/login"
And   User enters Email as "<Emails>" and Password as "<Passwords>"
Then  User click on Login
Then  Page Title should be "Dashboard / nopCommerce administration"
When  User click on Logout link
Then  Page Title should be "Your store. Login"
And   Close the Browser

Examples:
|Emails               | Passwords|
|Admin@yourstore.com  | Admin1   |
|admins@yourstore.com | admin123 |
|admin1@yourstore.com | admin1234|
