
@tag
Feature: check  facebook application
  

  @tag1
  Scenario: facebook login with valid cerdentials
    Given user launch firefox browser
    And user enter url
    Then user enters username and password
    And click login
    
    
    @tag2
  Scenario: parameter cerdentials
    Given user launch firefox browser
    And user enter url
    Then user enters "saranya" and "1234"
    And click login
    
    
   @tag3 
  Scenario: parameter cerdentials
    Given user launch firefox browser
    And user enter url
    Then user enters "<username>" and "<password>"
    And click login
    
    
    Examples:
    |username|password|
    |saranya|1234|
    |hghjk|87970|
    |nlmln|658|
    |jnnkk|67854|
    