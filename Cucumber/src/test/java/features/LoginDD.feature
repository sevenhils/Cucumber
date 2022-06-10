Feature:Testing the loginFuntionality
Scenario: postive test Validate Login Functionality
    Given Intialize the browser with Chrome
    And navigated to "https://opensource-demo.orangehrmlive.com/"site
     When User Enters Username <username> 
     And User Enters Password <password>
    Then Logged in successfully
    And close the Browser
    
    
    
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
  #  When I check for the <value> in step
   # Then I verify the <status> in step

    Examples: 
      | username  | password  |
      |  Admin    | admin123 |
      |  Admin1   | dmin123  | 
      |  Admin    |  admin1  | 
      |  Admin22  |  admin1  | 
      |           |          | 