Feature: Test Product Store Login Page Usability

  @web
  Scenario: Test the functionality of the Login form normal
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then user will see "Welcome" and their username

  @web
  Scenario: Test the functionality of the Login form without a username
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then a pop-up message "Please fill out Username and Password." will appear

  @web
  Scenario: Test the functionality of the Login form without a password
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "" in the login form
    And user clicks the Login button
    Then a pop-up message "Please fill out Username and Password." will appear

  @web
  Scenario: Test the functionality of the Login form with an unregistered username
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "KingNebuchadnezzar" in the login form
    And user fills in the password "jfihruf37832" in the login form
    And user clicks the Login button
    Then a pop-up message "User does not exist." will appear

  @web
  Scenario: Test the functionality of the Logout button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then user will see "Welcome" and their username
    And user clicks the Logout button
    Then user will be back to the Homepage