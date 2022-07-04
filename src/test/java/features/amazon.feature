Feature: Amazon page login

 
  Scenario: Amazon login with wrong credential
    Given user is already on login page
    When title of the page is "Amazon Sign In"
    Then user enters "pradhan.ash50@gmail.com"
    And user clicks on continue
    Then user puts their password "fkffjdhsdfdkfhdf"
    And user clicks on sign-in	
    And user is now getting error message
    Then user quits
