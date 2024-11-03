Feature: Test Product Store Contact Page Usability

  @web
  Scenario: Test the functionality of the contact form normal
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Contact button
    Then the contact form will appear
    And user will fill in the Contact Email "vitri@abc.com"
    And user will fill in the Contact Name "Vitri"
    And user will fill in the Message "Hi there!"
    And user will click the Send Message button
    Then a pop-up message "Thanks for the message!!" will appear

  @web
  Scenario: Test the functionality of the close button in the contact form
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Contact button
    Then the contact form will appear
    And user will click the Close button
    Then user will be back to the Homepage

  @web
  Scenario: Test the functionality of the contact form with invalid contact email
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Contact button
    Then the contact form will appear
    And user will fill in the Contact Email "vitri"
    And user will fill in the Contact Name "Vitri"
    And user will fill in the Message "Hi there!"
    And user will click the Send Message button
    Then a pop-up message "Thanks for the message!!" will appear

  @web
  Scenario: Test the functionality of the contact form with invalid contact name
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Contact button
    Then the contact form will appear
    And user will fill in the Contact Email "vitri@abc.com"
    And user will fill in the Contact Name "vit@123"
    And user will fill in the Message "Hi there!"
    And user will click the Send Message button
    Then a pop-up message "Thanks for the message!!" will appear

  @web
  Scenario: Test the functionality of the contact form without a message
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Contact button
    Then the contact form will appear
    And user will fill in the Contact Email "vitri@abc.com"
    And user will fill in the Contact Name "Vitri"
    And user will fill in the Message ""
    And user will click the Send Message button
    Then a pop-up message "Thanks for the message!!" will appear