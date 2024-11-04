Feature: Test Product Store Signup Page Usability

  @web
  Scenario: Test the functionality of the Signup form normal
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Signup button
    Then the Signup form will appear
    And user fills in the username "WackyWombatGiggleGoose"
    And user fills in the password "r736r7e3hbf"
    And user clicks the Sign up button
    Then a pop-up message "Sign up successful." will appear

  @web
  Scenario: Test the functionality of the Signup form without a username
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Signup button
    Then the Signup form will appear
    And user fills in the username ""
    And user fills in the password "1234567"
    And user clicks the Sign up button
    Then a pop-up message "Please fill out Username and Password." will appear


  @web
  Scenario: Test the functionality of the Signup form without a password
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Signup button
    Then the Signup form will appear
    And user fills in the username "johndoe"
    And user fills in the password ""
    And user clicks the Sign up button
    Then a pop-up message "Please fill out Username and Password." will appear

  @web
  Scenario: Test the functionality of the Signup form with a taken username
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Signup button
    Then the Signup form will appear
    And user fills in the username "vitrilukito"
    And user fills in the password "1234567"
    And user clicks the Sign up button
    Then a pop-up message "This user already exist." will appear

  @web
  Scenario: Test the functionality of the Close button in the Signup form
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Signup button
    Then the Signup form will appear
    And user clicks the Close button
    Then user will be back to the Homepage

