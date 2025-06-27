package StepDefinition;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class stepdefinition {
    WebDriver driver;

    @Given("User launches the browser")
    public void user_launches_the_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/C:/Browse driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }

    @When("User enter username and Password")
    public void user_enter_username_and_password() {
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Password123");

    }

    @When("User enter incorrect username and Password")
    public void user_enter_incorrect_username_and_password() {
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");
        WebElement Password = driver.findElement(By.id("password"));
        Password.sendKeys("Password23");

    }

    @When("User enter submit button")
    public void user_enter_submit_button() throws InterruptedException {
        WebElement Submit = driver.findElement(By.id("submit"));
        Submit.click();
        Thread.sleep(2000);
    }

    @Then("Product page should be logged in")
    public void Product_page_should_be_logged_in() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "https://practicetestautomation.com/logged-in-successfully/";
        Assert.assertEquals(actualTitle, expectedTitle, "https://practicetestautomation.com/logged-in-successfully/");
        System.out.println("Done");
        driver.quit();
    }

    @Then("User getting error {string}")
    public void User_getting_error(String expectedError) {
        String actualError = driver.findElement(By.id("error")).getText();
        Assert.assertEquals(expectedError, actualError);
        driver.quit();
    }

    @Given("User launches the new testing browser")
    public void User_launches_the_new_testing_browser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/C:/Browse driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @When("User navigate to Java script delay button")
    public void User_navigate_to_Java_script_delay_button() throws InterruptedException {
        WebElement javaScriptDelay = driver.findElement(By.xpath("//*[@id=\"post-36\"]/div/div[2]/div/div[1]/div[1]/div/a"));
        javaScriptDelay.click();
        Thread.sleep(2000);
    }

    @When("User able to click on Start button")
    public void User_able_to_click_on_Start_button() throws InterruptedException {
        WebElement startButton = driver.findElement(By.id("start"));
        startButton.click();
        Thread.sleep(9000);
    }


    @Then("Count down should complete {string}")
    public void count_down_should_complete(String expectedText) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Boolean textAppeared = wait.until(ExpectedConditions.textToBe(By.id("delay"), expectedText));
        Assert.assertTrue("Liftoff!", textAppeared);
    }

    @When("User enter Form field")
    public void User_enter_Form_field() {
        WebElement formField = driver.findElement(By.xpath("//*[@id=\"post-36\"]/div/div[2]/div/div[2]/div[1]/div/a"));
        formField.click();
    }

    @And("User able to enter all details")
    public void User_able_to_enter_all_details() throws InterruptedException {
        WebElement name = driver.findElement(By.id("name-input"));
        name.sendKeys("Usha");
        WebElement passWord = driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[2]/input"));
        passWord.sendKeys("usha123");
        driver.findElement(By.id("drink2")).click();
        driver.findElement(By.id("drink3")).click();
        driver.findElement(By.id("color1")).click();
        WebElement likeAutomation = driver.findElement(By.id("automation"));
        Select select = new Select(likeAutomation);
        select.selectByVisibleText("Yes");
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("xyz@gmail.com");
        WebElement message = driver.findElement(By.id("message"));
        message.sendKeys("acnhk");
    }

    @And("User able to submit the form")
    public void user_able_to_submit_the_form() throws InterruptedException {
        WebElement submit = driver.findElement(By.id("submit-btn"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(submit)).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert text: " + alert.getText());
        alert.accept();
        Thread.sleep(5000);
    }

    @When("User enter popups button")
    public void user_enter_popups_button() {
        WebElement popups = driver.findElement(By.xpath("//*[@id=\"post-36\"]/div/div[2]/div/div[3]/div[1]/div/a"));
        popups.click();
    }

    @When("user enter alert popup")
    public void user_enter_alert_popup() throws InterruptedException {
        WebElement alertPopup = driver.findElement(By.id("alert"));
        alertPopup.click();
        Alert alert = driver.switchTo().alert();
        System.out.println("alert test:" + alert.getText());
        alert.accept();
        Thread.sleep(5000);
    }

    @When("user enter confirm popup")
    public void user_enter_confirm_popup() throws InterruptedException {
        WebElement confirmPopup = driver.findElement(By.id("confirm"));
        confirmPopup.click();
        Alert confirm = driver.switchTo().alert();
        confirm.accept();
        Thread.sleep(8000);
    }

    @When("user enter prompt popup")
    public void user_enter_prompt_popup() throws InterruptedException {
        WebElement promptPopup = driver.findElement(By.id("prompt"));
        promptPopup.click();
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("usha");
        Thread.sleep(8000);
        prompt.accept();
        Thread.sleep(5000);
    }

    @Given("User launches the new testing browser scroll")
    public void User_launches_the_new_testing_browser_scroll() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/C:/Browse driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement sliders = driver.findElement(By.xpath("//a[@class='wp-block-button__link wp-element-button'][text()='Sliders']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behavior:'smooth', block:'center'});", sliders);
        Thread.sleep(1000);

    }

    @When("User enter sliders button")
    public void user_enter_sliders_button() throws InterruptedException {
        WebElement slide = driver.findElement(By.xpath("//a[@class='wp-block-button__link wp-element-button'][text()='Sliders']"));
        slide.click();
        WebElement slider = driver.findElement(By.xpath("//input[@type='range']"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, 0, 50).perform();
        Thread.sleep(3000);
    }

    @When("User enter last year date")
    public void User_enter_last_year_date() throws InterruptedException {
        WebElement calen = driver.findElement(By.xpath("//a[@class='wp-block-button__link wp-element-button'][text()='Calendars']"));
        calen.click();
        WebElement datInput = driver.findElement(By.xpath("//input[@name='g1065-2-1-selectorenteradate']"));
        datInput.click();
        for (int i = 0; i < 12; i++) {
            WebElement prearrow = driver.findElement(By.xpath("//a[@data-handler='prev']"));
            prearrow.click();
            Thread.sleep(3000);
        }
        WebElement lastYear = driver.findElement(By.xpath("//a[text()='30']"));
        lastYear.click();
        Thread.sleep(3000);
        WebElement submitbutton = driver.findElement(By.xpath("//button[@class='pushbutton-wide']"));
        submitbutton.click();
    }

    @When("User enter Modals button")
    public void User_enter_Modals_button() throws InterruptedException {
        WebElement modals = driver.findElement(By.xpath("//a[@class='wp-block-button__link wp-element-button'][text()='Modals']"));
        modals.click();
        WebElement simpleModal = driver.findElement(By.id("simpleModal"));
        simpleModal.click();
        Thread.sleep(5000);
        WebElement closethe = driver.findElement(By.xpath("//*[@id=\"popmake-1318\"]/button"));
        closethe.click();
        Thread.sleep(3000);
    }
    @When("user enter form modal")
    public void user_enter_form_modal() throws InterruptedException {
        WebElement formModals = driver.findElement(By.id("formModal"));
        formModals.click();
        WebElement Name = driver.findElement(By.id("g1051-name"));
        Name.sendKeys("Usha");
        WebElement Email = driver.findElement(By.id("g1051-email"));
        Email.sendKeys("xyz@gmail.com");
        WebElement msg = driver.findElement(By.id("contact-form-comment-g1051-message"));
        msg.sendKeys("fine");
        WebElement submit = driver.findElement(By.xpath("//button[@class='pushbutton-wide']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        Thread.sleep(2000);
        submit.click();
        Thread.sleep(2000);
    }
    @When("User enter window operations")
    public void User_enter_window_operations() throws InterruptedException {
        WebElement windowOperation = driver.findElement(By.xpath("//a[text()='Window Operations']"));
        windowOperation.click();
        WebElement newTab = driver.findElement(By.xpath("//button[@onclick='newTab()']"));
        newTab.click();
        Thread.sleep(2000);
        String originalWindow = driver.getWindowHandle();

        // Get all window handles
        Set<String> allWindows = driver.getWindowHandles();

        // Switch to new tab
        for (String window : allWindows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
        driver.close();
        driver.switchTo().window(originalWindow);
    }
    @When ("User navigate to replace window")
    public void User_navigate_to_replace_window() throws InterruptedException {
        WebElement replaceWindow = driver.findElement(By.xpath("//button[@onclick='newWindowSelf()']"));
        replaceWindow.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
    }
    @When ("user enter new window")
    public void user_enter_new_window() throws InterruptedException {
        WebElement newWindow = driver.findElement(By.xpath("//button[@onclick='newWindow()']"));
        newWindow.click();
        String parentWindow = driver.getWindowHandle();
        driver.switchTo().window(parentWindow);

    }
    @When ("User enter Hover button")
    public void User_enter_Hover_button() throws InterruptedException {
        WebElement hover = driver.findElement(By.xpath("//a[text()='Hover']"));
        hover.click();
        WebElement hoverTarget=driver.findElement(By.id("mouse_over"));
        Actions action = new Actions(driver);
        action.moveToElement(hoverTarget).perform();
        Thread.sleep(2000);

    }


}
