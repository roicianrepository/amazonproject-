#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Your order option is clickable or not
  

  @tag1
  Scenario: checking the functionality of Your order button and  feature
  
    Given User must be on sign in page of google by url "https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"
     And  user should enter username and click on continue 
    And User should enter password and click on sign in button

    
    When After login, user must be mousehover on Hello option 
    And  user must be move the mouse on your order button and click on it
    
    Then it must navigate to your order page 
    
     @tag2 
   Scenario: checking the order history in your order page 

     Given User should be on sign in page of google by url "https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"
     And  user should be  entered username and click on continue 
    And User should be  entered password and click on sign in button

    When After login, user must be mousehover on Hello option on top right corner
    And  user must be move the mouse on yourorder button and click on it
    And  user is able to view the order like previous three  months order, this year or any archieved orders
    
   Then it must navigate to your order page and user should be able to view the orders liek in past three months, this year or any archieved order
   
  