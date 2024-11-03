Feature: Test Product Store Homepage Usability

  @web
  Scenario: Test the functionality of the carousel previous button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user will click on the previous button of the carousel
    Then user will be directed to the previous slide

  @web
  Scenario: Test the functionality of the carousel next button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user will click on the next button of the carousel
    Then user will be directed to the next slide

  @web
  Scenario: Test the functionality of "Phones" category
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Phones category
    Then all phones will be displayed

  @web
  Scenario: Test the functionality of "Laptops" category
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Laptops category
    Then all laptops will be displayed

  @web
  Scenario: Test the functionality of "Monitors" category
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Monitors category
    Then all monitors will be displayed

  @web
  Scenario: Test the functionality of "Contact" button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Contact button
    Then the contact form will appear

  @web
  Scenario: Test the functionality of "About us" button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks About us button
    Then a short introduction video will be displayed

  @web
  Scenario: Test the functionality of "Cart" button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Cart button
    Then the cart list will be displayed

  @web
  Scenario: Test the functionality of "Login" button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear

  @web
  Scenario: Test the functionality of "Signup" button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Signup button
    Then the Signup form will appear

  @web
  Scenario: Test the functionality of the "previous and next products" button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user will click on the next page button
    Then user will be directed to the next product page
    And user will click on the previous page button
    Then user will be directed to the previous product page
