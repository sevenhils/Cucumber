

Feature: OrangeHRM Login
  I want to use this template for my feature file

 
  Scenario: postive test Validate Login Functionality
    Given Intialize the browser with Chrome
    And navigated to "https://opensource-demo.orangehrmlive.com/"site
     When User Enters Username "Admin" and Password "admin123"
    Then Logged in successfully
    And close the Browser
   
  #@tag
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
