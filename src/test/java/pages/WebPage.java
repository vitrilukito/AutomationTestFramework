package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v127.network.model.Request;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.WebModel.*;
import static helper.WebUtility.driver;

public class WebPage {

    Request req;

    By click_phones = By.xpath("(//a[normalize-space()='Phones'])[1]");
    By click_laptops = By.xpath("(//a[normalize-space()='Laptops'])[1]");
    By click_monitors = By.xpath("(//a[normalize-space()='Monitors'])[1]");
    By carousel_slides = By.xpath("//div[@id='carouselExampleIndicators']");
    By previous_button = By.xpath("//span[@class='carousel-control-prev-icon']");
    By previous_slide = By.xpath("//img[@alt='Third slide']");
    By next_button = By.xpath("//a[@class='carousel-control-next']");
    By next_slide = By.xpath("//img[@alt='First slide']");
    By contact_button = By.xpath("//a[normalize-space()='Contact']");
    By contact_form = By.xpath("(//div[@class='modal-content'])[1]");
    By about_button = By.xpath("//a[normalize-space()='About us']");
    By intro_video = By.xpath("//div[@id='example-video']");
    By cart_button = By.xpath("//a[@id='cartur']");
    By cart_list = By.xpath("//div[@class='table-responsive']");
    By click_login = By.xpath("//a[@id='login2']");
    By login_form = By.xpath("(//div[@class='modal-body'])[3]");
    By click_signup = By.xpath("(//a[normalize-space()='Sign up'])[1]");
    By signup_form = By.xpath("//div[@id='signInModal']//form");
    By previous_page_button = By.xpath("//button[@id='prev2']");
    By next_page_button = By.xpath("//button[@id='next2']");
    By nokia_lumia_title = By.xpath("//a[normalize-space()='Nokia lumia 1520']");
    By galaxy_s6_title = By.xpath("//a[normalize-space()='Samsung galaxy s6']");
    By nexus_6_title = By.xpath("//a[normalize-space()='Nexus 6']");
    By galaxy_s7_title = By.xpath("//a[normalize-space()='Samsung galaxy s7']");
    By iphone_6_title = By.xpath("//a[normalize-space()='Iphone 6 32gb']");
    By add_to_cart = By.xpath("//a[normalize-space()='Add to cart']");
    By contact_email = By.xpath("//input[@id='recipient-email']");
    By contact_name = By.xpath("//input[@id='recipient-name']");
    By message = By.xpath("//textarea[@id='message-text']");
    By send_message = By.xpath("//button[normalize-space()='Send message']");
    By close_button = By.xpath("(//button[@type='button'][normalize-space()='Close'])[1]");
    By place_order = By.xpath("//button[normalize-space()='Place Order']");
    By order_form = By.xpath("//div[@id='orderModal']//div[@class='modal-body']");
    By order_name = By.xpath("//input[@id='name']");
    By order_country = By.xpath("//input[@id='country']");
    By order_city = By.xpath("//input[@id='city']");
    By credit_card = By.xpath("//input[@id='card']");
    By month_order = By.xpath("//input[@id='month']");
    By year_order = By.xpath("//input[@id='year']");
    By purchase_button = By.xpath("//button[normalize-space()='Purchase']");
    By purchase_confirmation = By.xpath("//div[contains(@class,'showSweetAlert visible')]");
    By click_order_button = By.xpath("//div[@id='orderModal']//button[@type='button'][normalize-space()='Close']");
    By username_field = By.xpath("//input[@id='sign-username']");
    By password_field = By.xpath("//input[@id='sign-password']");
    By signup_button = By.xpath("//button[normalize-space()='Sign up']");
    By close_signup = By.xpath("//div[@id='signInModal']//button[@type='button'][normalize-space()='Close']");
    By login_button = By.xpath("//button[normalize-space()='Log in']");
    By welcome_username = By.xpath("//a[@id='nameofuser']");
    By username_login = By.xpath("//input[@id='loginusername']");
    By password_login = By.xpath("//input[@id='loginpassword']");
    By delete_button = By.xpath("//*[@id=\"tbodyid\"]/tr/td[4]/a");
    By deleted_item = By.xpath("(//tbody)[1]");
    By order_number = By.xpath("(//tr[@class='success'])[1]|(//tr[@class='success'])[2]|(//tr[@class='success'])[3]");

    public void websiteOfDemoBlaze() {
        driver.get("https://www.demoblaze.com/index.html");
    }

    public void clickPhones() {
        driver.findElement(click_phones).click();
    }

    public void allPhonesDisplayed() {
        req = allPhonesList();
    }

    public void clickLaptops() {
        driver.findElement(click_laptops).click();
    }

    public void allLaptopsDisplayed() {
        req = allLaptopsList();
    }

    public void clickMonitors() {
        driver.findElement(click_monitors).click();
    }

    public void allMonitorsDisplayed() {
        req = allMonitorsList();
    }

    public void slideFeaturedProducts() {
        driver.findElement(carousel_slides).isDisplayed();
    }

    public void previousButton() {
        driver.findElement(previous_button).click();
    }

    public void previousSlide() {
        driver.findElement(previous_slide).isDisplayed();
    }

    public void nextButton() {
        driver.findElement(next_button).click();
    }

    public void nextSlide() {
        driver.findElement(next_slide).isDisplayed();
    }

    public void clickContact() {
        driver.findElement(contact_button).click();
    }

    public void contactForm() {
        driver.findElement(contact_form).isDisplayed();
    }

    public void clickAbout() {
        driver.findElement(about_button).click();
    }

    public void introVideo() {
        driver.findElement(intro_video).isDisplayed();
    }

    public void clickCart() {
        driver.findElement(cart_button).click();
    }

    public void cartList() {
        driver.findElement(cart_list).isDisplayed();
    }

    public void clickLogin() {
        driver.findElement(click_login).click();
    }

    public void loginForm() {
        driver.findElement(login_form).isDisplayed();
    }

    public void clickSignup() {
        driver.findElement(click_signup).click();
    }

    public void signupForm() {
        driver.findElement(signup_form).isDisplayed();
    }

    public void previousPageButton() {
        driver.findElement(previous_page_button).click();
    }

    public void previousProductPage() {
        req = previousProducts();
    }

    public void nextPageButton() {
        driver.findElement(next_page_button).click();
    }

    public void nextProductPage() {
        req = nextProducts();
    }

    public void nokiaLumiaTitle() {
        driver.findElement(nokia_lumia_title).click();
    }

    public void nokiaLumiaDetails() {
        req = nokiaLumiaDetailsPage();
    }

    public void samsungGalaxySixTitle() {
        driver.findElement(galaxy_s6_title).click();
    }

    public void galaxySixDetails() {
        req = galaxySixDetailsPage();
    }

    public void nexusSixTitle() {
        driver.findElement(nexus_6_title).click();
    }

    public void nexusSixDetails() {
        req = nexusSixDetailsPage();
    }

    public void galaxySevenTitle() {
        driver.findElement(galaxy_s7_title).click();
    }

    public void galaxySevenDetails() {
        req = galaxySevenDetailsPage();
    }

    public void iphoneSixTitle() {
        driver.findElement(iphone_6_title).click();
    }

    public void iphoneSixDetails() {
        req = iphoneSixDetailsPage();
    }

    public void addToCartButton() {
        driver.findElement(add_to_cart).click();
    }

    public void contactEmail(String email) {
        driver.findElement(contact_email).sendKeys(email);
    }

    public void contactName(String name) {
        driver.findElement(contact_name).sendKeys(name);
    }

    public void message(String msg) {
        driver.findElement(message).sendKeys(msg);
    }

    public void sendMessageButton() {
        driver.findElement(send_message).click();
    }

    public void closeButton() {
        driver.findElement(close_button).click();
    }

    public void placeOrderButton() {
        driver.findElement(place_order).click();
    }

    public void orderForm() {
        driver.findElement(order_form).isDisplayed();
    }

    public void orderName(String orderName) {
        driver.findElement(order_name).sendKeys(orderName);
    }

    public void orderCountry(String orderCountry) {
        driver.findElement(order_country).sendKeys(orderCountry);
    }

    public void orderCity(String orderCity) {
        driver.findElement(order_city).sendKeys(orderCity);
    }

    public void creditCard(String creditCardNumber) {
        driver.findElement(credit_card).sendKeys(creditCardNumber);
    }

    public void monthOrder(String month) {
        driver.findElement(month_order).sendKeys(month);
    }

    public void yearOrder(String year) {
        driver.findElement(year_order).sendKeys(year);
    }

    public void purchaseButton() {
        driver.findElement(purchase_button).click();
    }

    public void purchaseConfirmation() {
        driver.findElement(purchase_confirmation).isDisplayed();
    }

    public void closeOrderButton() {
        driver.findElement(click_order_button).click();
    }

    public void usernameField(String usernameField) {
        driver.findElement(username_field).sendKeys(usernameField);
    }

    public void passwordField(String passwordField) {
        driver.findElement(password_field).sendKeys(passwordField);
    }

    public void signUpButton() {
        driver.findElement(signup_button).click();
    }

    public void closeSignup() {
        driver.findElement(close_signup).click();
    }

    public void loginButton() {
        driver.findElement(login_button).click();
    }

    public void welcomeUsername() {
        driver.findElement(welcome_username).isDisplayed();
    }

    public void usernameLogin(String usernameLogin) {
        driver.findElement(username_login).sendKeys(usernameLogin);
    }

    public void passwordLogin(String passwordLogin) {
        driver.findElement(password_login).sendKeys(passwordLogin);
    }

    public void logoutButton() {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(100));
        WebElement logoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='logout2']")));
        logoutButton.click();
    }

    public void deleteButton() {
        driver.findElement(delete_button).click();
    }

    public void deletedItem() {
        driver.findElement(deleted_item).isDisplayed();
    }

    public void orderNumber() {
        driver.findElement(order_number).isDisplayed();
    }
}

