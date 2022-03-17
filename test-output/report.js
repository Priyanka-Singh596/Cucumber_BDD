$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/addCustomer.feature");
formatter.feature({
  "name": "Add new Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sucessfull add new customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Step.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User open URL \"https://admin-demo.nopcommerce.com/login\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_open_url(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"admin@yourstore.com\" and Password as \"admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_enters_email_as_and_password_as(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on Login",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_click_on_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Page Title should be \"Dashboard / nopCommerce administration\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.page_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on customers menu",
  "keyword": "When "
});
formatter.match({
  "location": "Step.user_click_on_customers_menu()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefination.Step.user_click_on_customers_menu(Step.java:70)\r\n\tat ✽.User click on customers menu(file:Features/addCustomer.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User click on customers item",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_click_on_customers_item()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on Add New button",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_click_on_Add_New_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view Add a new customer page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_can_view_Add_a_new_customer_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User enters customer info",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_enters_customer_info()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "Step.user_click_on_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User can view configration message \"The new customer has been added successfully.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Step.user_can_view_configration_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User close browser",
  "keyword": "And "
});
formatter.match({
  "location": "Step.User_close_browser()"
});
formatter.result({
  "status": "skipped"
});
});