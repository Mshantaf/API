   Feature: facebook login
   
   #Background:
   #Given I navigate to facebook website   
   
   @regression
   Scenario: correct user and pass
    #Given I navigate to facebook website
    When I enter username "aaaa@hot"
    And I enter password "55555"
    Then I an able to login
    
    @regression
     Scenario: correct user and pass
    #Given I navigate to facebook website
    When I enter username "xxxa@hot"
    And I enter password "55555"
    Then I an able to login
   
   
    #Scenario Outline: correct user and pass
    #Given I navigate to facebook website
    #When I enter username "<email>"
    #And I enter password "<pass>"
    #Then I an able to login
    #
 #
    #
    #Examples:
    #|email         |pass |
    #|abc@yahoo.com | aaaaaaa|
    #|def@yahoo.com | bbbbbbb|

