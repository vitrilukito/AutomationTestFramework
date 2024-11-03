Feature: Test Product Store Cart Usability

  @web
  Scenario: Test the functionality of the "Place Order" button
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then user will see "Welcome" and their username
    And user will click on the title of Samsung galaxy six
    Then user will be directed to Samsung galaxy six details page
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear
    And user clicks Cart button
    Then the cart list will be displayed
    And user will click the Place Order button
    Then the place order form will be displayed

  @web
  Scenario: Test the functionality of the "Close" button in the Place Order form
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then user will see "Welcome" and their username
    And user will click on the title of Samsung galaxy six
    Then user will be directed to Samsung galaxy six details page
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear
    And user clicks Cart button
    Then the cart list will be displayed
    And user will click the Place Order button
    Then the place order form will be displayed
    And user will click the Close button in the Place Order form
    Then user will be redirected to the Cart page

  @web
  Scenario: Test the functionality of the "Delete" button in the Place Order form
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then user will see "Welcome" and their username
    And user will click on the title of Samsung galaxy six
    Then user will be directed to Samsung galaxy six details page
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear
    And user clicks Cart button
    Then the cart list will be displayed
    And user will click the Delete button in the Place Order form
    Then the deleted item will be gone

  @web
  Scenario: Test the functionality of the Place Order form normal
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then user will see "Welcome" and their username
    And user will click on the title of Samsung galaxy six
    Then user will be directed to Samsung galaxy six details page
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear
    And user clicks Cart button
    Then the cart list will be displayed
    And user will click the Place Order button
    Then the place order form will be displayed
    And user will fill in the name "Vitri"
    And user will fill in the country "Indonesia"
    And user will fill in the city "Medan"
    And user will fill in the credit card "123456789010"
    And user will fill in the month "11"
    And user will fill in the year "2025"
    And user will click the Purchase button
    Then the successful purchase confirmation details will be displayed

  @web
  Scenario: Test the functionality of the Place Order form without a name
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then user will see "Welcome" and their username
    And user will click on the title of Samsung galaxy six
    Then user will be directed to Samsung galaxy six details page
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear
    And user clicks Cart button
    Then the cart list will be displayed
    And user will click the Place Order button
    Then the place order form will be displayed
    And user will fill in the name ""
    And user will fill in the country "Indonesia"
    And user will fill in the city "Medan"
    And user will fill in the credit card "123456789010"
    And user will fill in the month "11"
    And user will fill in the year "2025"
    And user will click the Purchase button
    Then a pop-up message "Please fill out Name and Creditcard." will appear

  @web
  Scenario: Test the functionality of the Place Order form without a credit card information
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then user will see "Welcome" and their username
    And user will click on the title of Samsung galaxy six
    Then user will be directed to Samsung galaxy six details page
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear
    And user clicks Cart button
    Then the cart list will be displayed
    And user will click the Place Order button
    Then the place order form will be displayed
    And user will fill in the name "Vitri"
    And user will fill in the country "Indonesia"
    And user will fill in the city "Medan"
    And user will fill in the credit card ""
    And user will fill in the month "11"
    And user will fill in the year "2025"
    And user will click the Purchase button
    Then a pop-up message "Please fill out Name and Creditcard." will appear

  @web
  Scenario: Test the functionality of the "Place Order" button to place multiple orders
    Given open the website of DemoBlaze
    Then user will see the carousel of the featured products
    And user clicks Login button
    Then the Login form will appear
    And user fills in the username "vitrilukito" in the login form
    And user fills in the password "1234567" in the login form
    And user clicks the Login button
    Then user will see "Welcome" and their username
    And user will click on the title of Samsung galaxy six
    Then user will be directed to Samsung galaxy six details page
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear
    And user will click on the Add to cart button
    Then a pop-up message "Product added" will appear
    And user clicks Cart button
    Then user will see 3 orders list


