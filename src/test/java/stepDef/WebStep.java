package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.WebPage;

import java.time.Duration;

import static helper.WebUtility.driver;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class WebStep {

    WebPage webPage;

    public WebStep(){
        this.webPage = new WebPage();
    }

    @Given("open the website of DemoBlaze")
    public void openTheWebsiteOfDemoBlaze() {
        webPage.websiteOfDemoBlaze();
    }

    @And("user clicks Phones category")
    public void userClicksPhonesCategory() {
        webPage.clickPhones();
    }

    @Then("all phones will be displayed")
    public void allPhonesWillBeDisplayed() throws InterruptedException {
        webPage.allPhonesDisplayed();
        Thread.sleep(2000);
    }

    @And("user clicks Laptops category")
    public void userClicksLaptopsCategory() {
        webPage.clickLaptops();
    }

    @Then("all laptops will be displayed")
    public void allLaptopsWillBeDisplayed() {
        webPage.allLaptopsDisplayed();
    }

    @And("user clicks Monitors category")
    public void userClicksMonitorsCategory() {
        webPage.clickMonitors();
    }

    @Then("all monitors will be displayed")
    public void allMonitorsWillBeDisplayed() {
        webPage.allMonitorsDisplayed();
    }

    @Then("user will see the carousel of the featured products")
    public void userWillSeeTheCarouselOfTheFeaturedProducts() throws InterruptedException {
        webPage.slideFeaturedProducts();
        Thread.sleep(2000);
    }

    @And("user will click on the previous button of the carousel")
    public void userWillClickOnThePreviousButtonOfTheCarousel() {
        webPage.previousButton();
    }

    @Then("user will be directed to the previous slide")
    public void userWillBeDirectedToThePreviousSlide() {
        webPage.previousSlide();
    }

    @And("user will click on the next button of the carousel")
    public void userWillClickOnTheNextButtonOfTheCarousel() {
        webPage.nextButton();
    }

    @Then("user will be directed to the next slide")
    public void userWillBeDirectedToTheNextSlide() throws InterruptedException {
        webPage.nextSlide();
        Thread.sleep(5000);
    }

    @And("user clicks Contact button")
    public void userClicksContactButton() {
        webPage.clickContact();
    }

    @Then("the contact form will appear")
    public void theContactFormWillAppear() {
        webPage.contactForm();
    }

    @And("user clicks About us button")
    public void userClicksAboutUsButton() {
        webPage.clickAbout();
    }

    @Then("a short introduction video will be displayed")
    public void aShortIntroductionVideoWillBeDisplayed() {
        webPage.introVideo();
    }

    @And("user clicks Cart button")
    public void userClicksCartButton() {
        webPage.clickCart();
    }

    @Then("the cart list will be displayed")
    public void theCartListWillBeDisplayed() {
        webPage.cartList();
    }

    @And("user clicks Login button")
    public void userClicksLoginButton() throws InterruptedException {
        webPage.clickLogin();
        Thread.sleep(2000);
    }

    @Then("the Login form will appear")
    public void theLoginFormWillAppear() {
        webPage.loginForm();
    }

    @And("user clicks Signup button")
    public void userClicksSignupButton() {
        webPage.clickSignup();
    }

    @Then("the Signup form will appear")
    public void theSignupFormWillAppear() {
        webPage.signupForm();
    }

    @And("user will click on the previous page button")
    public void userWillClickOnThePreviousPageButton() {
        webPage.previousPageButton();
    }

    @Then("user will be directed to the previous product page")
    public void userWillBeDirectedToThePreviousProductPage() {
        webPage.previousProductPage();
    }

    @And("user will click on the next page button")
    public void userWillClickOnTheNextPageButton() {
        webPage.nextPageButton();
    }

    @Then("user will be directed to the next product page")
    public void userWillBeDirectedToTheNextProductPage() {
        webPage.nextProductPage();
    }


    @And("user will click on the title of Nokia lumia")
    public void userWillClickOnTheTitleOfNokiaLumia() {
        webPage.nokiaLumiaTitle();
    }


    @Then("user will be directed to Nokia lumia details page")
    public void userWillBeDirectedToNokiaLumiaDetailsPage() {
        webPage.nokiaLumiaDetails();
    }


    @And("user will click on the title of Samsung galaxy six")
    public void userWillClickOnTheTitleOfSamsungGalaxySix() {
        webPage.samsungGalaxySixTitle();
    }

    @Then("user will be directed to Samsung galaxy six details page")
    public void userWillBeDirectedToSamsungGalaxySixDetailsPage() {
        webPage.galaxySixDetails();
    }

    @And("user will click on the title of Nexus six")
    public void userWillClickOnTheTitleOfNexusSix() {
        webPage.nexusSixTitle();
    }

    @Then("user will be directed to Nexus six details page")
    public void userWillBeDirectedToNexusSixDetailsPage() {
        webPage.nexusSixDetails();
    }

    @And("user will click on the title of Samsung galaxy seven")
    public void userWillClickOnTheTitleOfSamsungGalaxySeven() {
        webPage.galaxySevenTitle();
    }

    @Then("user will be directed to Samsung galaxy seven details page")
    public void userWillBeDirectedToSamsungGalaxySevenDetailsPage() {
        webPage.galaxySevenDetails();
    }

    @And("user will click on the title of Iphone six")
    public void userWillClickOnTheTitleOfIphoneSix() {
        webPage.iphoneSixTitle();
    }

    @Then("user will be directed to Iphone six details page")
    public void userWillBeDirectedToIphoneSixDetailsPage() {
        webPage.iphoneSixDetails();
    }

    @And("user will click on the Add to cart button")
    public void userWillClickOnTheAddToCartButton() {
        webPage.addToCartButton();
    }

    @Then("a pop-up message {string} will appear")
    public void aPopUpMessageWillAppear(String popupMessage) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        String alertText = alert.getText();
        assertThat(alertText, containsString(popupMessage));
        alert.accept();
        Thread.sleep(3000);
    }

    @And("user will fill in the Contact Email {string}")
    public void userWillFillInTheContactEmail(String email) throws InterruptedException {
        webPage.contactEmail(email);
        Thread.sleep(1000);
    }

    @And("user will fill in the Contact Name {string}")
    public void userWillFillInTheContactName(String name) throws InterruptedException {
        webPage.contactName(name);
        Thread.sleep(1000);
    }

    @And("user will fill in the Message {string}")
    public void userWillFillInTheMessage(String message) throws InterruptedException {
        webPage.message(message);
        Thread.sleep(1000);
    }

    @And("user will click the Send Message button")
    public void userWillClickTheSendMessageButton() throws InterruptedException {
        webPage.sendMessageButton();
        Thread.sleep(1000);
    }

    @And("user will click the Close button")
    public void userWillClickTheCloseButton() {
        webPage.closeButton();
    }

    @Then("user will be back to the Homepage")
    public void userWillBeBackToTheHomepage() throws InterruptedException {
        webPage.slideFeaturedProducts();
        Thread.sleep(2000);
    }

    @And("user will click the Place Order button")
    public void userWillClickThePlaceOrderButton() throws InterruptedException {
        webPage.placeOrderButton();
        Thread.sleep(2000);
    }

    @Then("the place order form will be displayed")
    public void thePlaceOrderFormWillBeDisplayed() {
        webPage.orderForm();
    }

    @And("user will fill in the name {string}")
    public void userWillFillInTheName(String orderName) throws InterruptedException {
        webPage.orderName(orderName);
        Thread.sleep(1000);
    }

    @And("user will fill in the country {string}")
    public void userWillFillInTheCountry(String orderCountry) throws InterruptedException {
        webPage.orderCountry(orderCountry);
        Thread.sleep(1000);
    }

    @And("user will fill in the city {string}")
    public void userWillFillInTheCity(String orderCity) throws InterruptedException {
        webPage.orderCity(orderCity);
        Thread.sleep(1000);
    }

    @And("user will fill in the credit card {string}")
    public void userWillFillInTheCreditCard(String creditCard) throws InterruptedException {
        webPage.creditCard(creditCard);
        Thread.sleep(1000);
    }

    @And("user will fill in the month {string}")
    public void userWillFillInTheMonth(String month) throws InterruptedException {
        webPage.monthOrder(month);
        Thread.sleep(1000);
    }

    @And("user will fill in the year {string}")
    public void userWillFillInTheYear(String year) throws InterruptedException {
        webPage.yearOrder(year);
        Thread.sleep(1000);
    }

    @And("user will click the Purchase button")
    public void userWillClickThePurchaseButton() throws InterruptedException {
        webPage.purchaseButton();
        Thread.sleep(1000);
    }

    @Then("the successful purchase confirmation details will be displayed")
    public void theSuccessfulPurchaseConfirmationDetailsWillBeDisplayed() {
        webPage.purchaseConfirmation();
    }

    @And("user will click the Close button in the Place Order form")
    public void userWillClickTheCloseButtonInThePlaceOrderForm() {
        webPage.closeOrderButton();
    }

    @Then("user will be redirected to the Cart page")
    public void userWillBeRedirectedToTheCartPage() {
        webPage.cartList();
    }

    @And("user fills in the username {string}")
    public void userFillsInTheUsername(String usernameField) {
        webPage.usernameField(usernameField);
    }

    @And("user fills in the password {string}")
    public void userFillsInThePassword(String passwordField) {
        webPage.passwordField(passwordField);
    }

    @And("user clicks the Sign up button")
    public void userClicksTheSignUpButton() {
        webPage.signUpButton();
    }

    @And("user clicks the Close button")
    public void userClicksTheCloseButton() {
        webPage.closeSignup();
    }

    @And("user clicks the Login button")
    public void userClicksTheLoginButton() throws InterruptedException {
        webPage.loginButton();
    }

    @Then("user will see {string} and their username")
    public void userWillSeeAndTheirUsername(String welcome) throws InterruptedException {
        webPage.welcomeUsername();
        Thread.sleep(4000);
    }

    @And("user fills in the username {string} in the login form")
    public void userFillsInTheUsernameInTheLoginForm(String usernameLogin) {
        webPage.usernameLogin(usernameLogin);
    }

    @And("user fills in the password {string} in the login form")
    public void userFillsInThePasswordInTheLoginForm(String passwordLogin) {
        webPage.passwordLogin(passwordLogin);
    }

    @And("user clicks the Logout button")
    public void userClicksTheLogoutButton() {
        webPage.logoutButton();
    }

    @And("user will click the Delete button in the Place Order form")
    public void userWillClickTheDeleteButtonInThePlaceOrderForm() {
        webPage.deleteButton();
    }

    @Then("the deleted item will be gone")
    public void theDeletedItemWillBeGone() {
        webPage.deletedItem();
    }

    @Then("user will see {int} orders list")
    public void userWillSeeOrdersList(int orderNumber) {
        webPage.orderNumber();
    }
}
