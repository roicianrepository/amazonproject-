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
Feature: Signin button testing

  @smoke
  Scenario: clicking on sign in button
    Given user must be on homepage by clicking on url "https://www.amazon.ca/ "
    When user clicks on Signin button
    Then Signin Page should be displayed

  @regression
  Scenario Outline: checking the functionality of signin button
    Given user must be on amazon sign in page by clicking on url "https://www.amazon.ca/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.ca%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=caflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"
    When Enter Valid <Email>
    And click on continue button
    And Enter valid <password>
    And click on signin button
    Then User must be navigated to his or her account

    Examples: 
      | Email                      | password       |
      | poojasethi131096@gmail.com | Ishwinder@123  |
      | neeru1122@gmail.com        | neerusaini     |
      | ishwinders@hotmail.com     | ishwinder11222 |
      | neeru@gmail.com            | sam            |
