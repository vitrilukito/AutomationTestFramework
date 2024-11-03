Feature: Test Product Page Usability

  @web
  Scenario: Test the functionality of "Samsung galaxy six" title button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user will click on the title of Samsung galaxy six
    Then user will be directed to Samsung galaxy six details page

  @web
  Scenario: Test the functionality of "Nokia lumia 1520" title button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user will click on the title of Nokia lumia
    Then user will be directed to Nokia lumia details page

  @web
  Scenario: Test the functionality of "Nexus six" title button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user will click on the title of Nexus six
    Then user will be directed to Nexus six details page

  @web
  Scenario: Test the functionality of "Samsung galaxy seven" title button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user will click on the title of Samsung galaxy seven
    Then user will be directed to Samsung galaxy seven details page

  @web
  Scenario: Test the functionality of "Iphone six" title button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user will click on the title of Iphone six
    Then user will be directed to Iphone six details page

  @web
  Scenario: Test the functionality of the "Add to cart" button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user will click on the title of Samsung galaxy six
    Then user will be directed to Samsung galaxy six details page
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear