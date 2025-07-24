package Stepdefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.*;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StepDefinition {
    WebDriver driver;

    @Given("User launches the browser")
    public void user_launches_the_browser() throws InterruptedException {
        driver = DriverFactory.getDriver();
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
        driver = DriverFactory.getDriver();
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
        driver = DriverFactory.getDriver();
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

    @When("User navigate to replace window")
    public void User_navigate_to_replace_window() throws InterruptedException {
        WebElement replaceWindow = driver.findElement(By.xpath("//button[@onclick='newWindowSelf()']"));
        replaceWindow.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
    }

    @When("user enter new window")
    public void user_enter_new_window() throws InterruptedException {
        WebElement newWindow = driver.findElement(By.xpath("//button[@onclick='newWindow()']"));
        newWindow.click();
        String parentWindow = driver.getWindowHandle();
        driver.switchTo().window(parentWindow);

    }

    @When("User enter Hover button")
    public void User_enter_Hover_button() throws InterruptedException {
        WebElement hover = driver.findElement(By.xpath("//a[text()='Hover']"));
        hover.click();
        WebElement hoverTarget = driver.findElement(By.id("mouse_over"));
        Actions action = new Actions(driver);
        action.moveToElement(hoverTarget).perform();
        Thread.sleep(2000);
    }

    @When("Count number of rows and columns")
    public void count_number_of_rows_and_columns() throws InterruptedException {
        WebElement tables = driver.findElement(By.xpath("//a[text()='Tables']"));
        tables.click();
        Thread.sleep(3000);
        WebElement table = driver.findElement(By.xpath("//figure[@class='wp-block-table']//table"));
        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
        List<WebElement> columns = table.findElements(By.xpath(".//tbody/tr[1]/td"));
        System.out.println("Number of rows: " + rows.size());
        System.out.println("Number of columns: " + columns.size());
        Thread.sleep(3000);
    }

    @When("Extract all data from the table")
    public void extract_all_data_from_the_table() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement table = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//figure[@class='wp-block-table']//table")));

        // Find all rows
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows) {
            // Find all cells (both th and td for header and data)
            List<WebElement> cells = row.findElements(By.xpath("./th | ./td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + " | ");
            }
            System.out.println(); // New line after each row
        }
    }

    @When("user searches for {string} in the table")
    public void user_searches_for_keyword_in_table(String keyword) {
        WebElement table = driver.findElement(By.xpath("//figure[@class='wp-block-table']//table"));
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        boolean found = false;

        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.xpath("./th | ./td"));
            for (WebElement cell : cells) {
                if (cell.getText().toLowerCase().contains(keyword.toLowerCase())) {
                    found = true;
                    System.out.println("✅ Found '" + keyword + "' in table cell: " + cell.getText());
                }
            }
        }

        if (!found) {
            throw new AssertionError("❌ Keyword '" + keyword + "' not found in any table cell.");
        }
    }

    @And("Verify the table headers")
    public void verify_the_table_headers() {
        // Locate the table
        WebElement table = driver.findElement(By.xpath("//figure[@class='wp-block-table']//table"));

        // Locate header row (assumes headers are in the first row of the table)
        List<WebElement> headers = table.findElements(By.xpath(".//thead/tr/th"));

        // Expected headers - update this list as per your table
        List<String> expectedHeaders = Arrays.asList("Product", "Price", "Quantity");

        // Actual headers from the web table
        List<String> actualHeaders = headers.stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        // Compare expected vs actual
        if (actualHeaders.equals(expectedHeaders)) {
            System.out.println("✅ Table headers are correct: " + actualHeaders);
        } else {
            System.out.println("❌ Table headers mismatch!");
            System.out.println("Expected: " + expectedHeaders);
            System.out.println("Actual: " + actualHeaders);
        }
    }

    @Given("User launches the new testing browser scroll end")
    public void User_launches_the_new_testing_browser_scroll_end() throws InterruptedException {
        driver = DriverFactory.getDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement Accordions = driver.findElement(By.xpath("//a[@class = 'wp-block-button__link wp-element-button'][text()='Accordions']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Accordions);
        Thread.sleep(2000);
    }

    @When("user enter Accordions")
    public void user_enter_Accordions() throws InterruptedException {
        WebElement Accordions = driver.findElement(By.xpath("//a[@class = 'wp-block-button__link wp-element-button'][text()='Accordions']"));
        Accordions.click();
        Thread.sleep(3000);
    }

    @When("user click on accordions")
    public void user_click_on_accordions() throws InterruptedException {
        WebElement Accord = driver.findElement(By.xpath("//summary[@class = 'wp-block-coblocks-accordion-item__title']"));
        Accord.click();
        Thread.sleep(3000);
    }

    @When("able to see {string}")
    public void able_to_see(String expectedText) throws InterruptedException {
        String actualResult = driver.findElement(By.xpath("//div[@class = 'wp-block-coblocks-accordion-item__content']")).getText();
        Assert.assertEquals(actualResult, expectedText);
        Thread.sleep(2000);
        driver.quit();
    }

    @Given("User launches the new testing browser scroll BI")
    public void User_launches_the_new_testing_browser_scroll_BI() throws InterruptedException {
        driver = DriverFactory.getDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement BL = driver.findElement(By.xpath("//a[@class = 'wp-block-button__link wp-element-button'][text()='Broken Links']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behaviour:'smooth', block:'center'});", BL);
        Thread.sleep(2000);
    }

    @When("User click on broken link")
    public void User_click_on_broken_link() throws InterruptedException {
        WebElement brokelink = driver.findElement(By.xpath("//a[text() = 'Broken Links']"));
        brokelink.click();
        WebElement blink = driver.findElement(By.xpath("//a[text() = 'broken link']"));
        blink.click();
        Thread.sleep(2000);
    }

    @Then("User checks all links for broken ones")
    public void user_checks_all_links_for_broken_ones() throws Exception {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("🔗 Total links found: " + links.size());

        for (WebElement link : links) {
            String url = link.getAttribute("href");

            if (url == null || url.isEmpty()) {
                System.out.println("⚠️ Skipping empty or null href");
                continue;
            }

            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("HEAD");
                connection.connect();
                int responseCode = connection.getResponseCode();

                if (responseCode >= 400) {
                    System.out.println("❌ Broken Link: " + url + " | Status Code: " + responseCode);
                } else {
                    System.out.println("✅ Valid Link: " + url + " | Status Code: " + responseCode);
                }

            } catch (Exception e) {
                System.out.println("❌ Error with URL: " + url + " | " + e.getMessage());
            }
        }
    }

    @When("User click on broken image")
    public void User_click_on_broken_image() throws InterruptedException {
        WebElement brokenimage = driver.findElement(By.xpath("//a[text()='Broken Images']"));
        brokenimage.click();

    }

    @Then("User verifies all images for broken ones")
    public void user_verifies_all_images_for_broken_ones() throws Exception {
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("🖼️ Total Images Found: " + images.size());

        for (WebElement img : images) {
            String imageURL = img.getAttribute("src");

            if (imageURL == null || imageURL.isEmpty()) {
                System.out.println("⚠️ Skipping image with empty src attribute");
                continue;
            }

            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(imageURL).openConnection();
                connection.setRequestMethod("GET");
                connection.connect();
                int statusCode = connection.getResponseCode();

                if (statusCode >= 400) {
                    System.out.println("❌ Broken Image: " + imageURL + " | Status Code: " + statusCode);
                } else {
                    System.out.println("✅ Valid Image: " + imageURL + " | Status Code: " + statusCode);
                }
            } catch (Exception e) {
                System.out.println("❌ Exception on Image: " + imageURL + " | " + e.getMessage());
            }
        }
    }

    @Given("User launches the new testing browser scroll Ads")
    public void User_launches_the_new_testing_browser_scroll_Ads() throws InterruptedException {
        driver = DriverFactory.getDriver();
        driver.get("https://practice-automation.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        WebElement Ads = driver.findElement(By.xpath("//a[@class = 'wp-block-button__link wp-element-button'][text()='Ads']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behaviour:'smooth', block:'center'});", Ads);
        Thread.sleep(2000);
    }

    @When("User click on ads")
    public void User_click_on_ads() throws InterruptedException {
        WebElement ads = driver.findElement(By.xpath("//a[@class = 'wp-block-button__link wp-element-button'][text()='Ads']"));
        ads.click();
        Thread.sleep(2000);
    }

    @Then("Ads page should be displayed")
    public void ads_page_should_be_displayed() throws InterruptedException {
        WebDriverWait wait;
        // Wait for URL to change or for page to load
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // ✅ initialize here too
        wait.until(ExpectedConditions.urlContains("ads"));

        // Print confirmation (no assertion)
        System.out.println("Navigated to Ads page. Current URL: " + driver.getCurrentUrl());

        // Optional: wait for an element like a heading
        WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        System.out.println("Page heading: " + heading.getText());

        // Close browser
        Thread.sleep(3000);


    }

    @When("User click on Gesture")
    public void User_click_on_Gesture() throws InterruptedException {
        WebElement gesture = driver.findElement(By.xpath("//a[@class = 'wp-block-button__link wp-element-button'][text()='Gestures']"));
        gesture.click();
        Thread.sleep(3000);
    }

    @When("user perform drag and drop")
    public void user_perform_drag_and_drop() throws InterruptedException {
        WebElement drag = driver.findElement(By.id("moveMeHeader"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(drag, 50, 50).perform();
        Thread.sleep(1000);
    }

    @When("place in target place")
    public void place_in_target_place() throws InterruptedException {
        WebElement dragm = driver.findElement(By.id("dragMe"));
        WebElement dropm = driver.findElement(By.id("div2"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragm, dropm).perform();
        Thread.sleep(2000);
    }

    @When("drag the map anywhere")
    public void drag_the_map_anywhere() throws InterruptedException {
        WebElement map = driver.findElement(By.xpath("//div[@class='mk-map-node-element']"));

        // Scroll into view if needed
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", map);

        Actions action = new Actions(driver);
        action.clickAndHold(map)
                .moveByOffset(100, 50)
                .release()
                .perform();

        Thread.sleep(4000); // or use WebDriverWait if needed
    }

    @When("User click on File download option")
    public void User_click_on_File_download_option() throws InterruptedException {
        WebElement downld = driver.findElement(By.xpath("//a[@class = 'wp-block-button__link wp-element-button'][text()='File Download']"));
        downld.click();
        WebElement clic = driver.findElement(By.xpath("//a[@class='wpdm-download-link download-on-click btn btn-primary ']"));

        Actions action = new Actions(driver);
        action.moveToElement(clic).click().perform();

        WebElement clicpas = driver.findElement(By.xpath("//a[@class='wpdm-download-link wpdm-download-locked btn btn-primary ']"));
        Actions naction = new Actions(driver);
        naction.moveToElement(clicpas).click().perform();
        Thread.sleep(3000);
        driver.switchTo().frame("wpdm-lock-frame");
        WebElement password = driver.findElement(By.id("password_686e412ae2856_921"));
        password.sendKeys("automateNow");
        Thread.sleep(3000);
        WebElement submit = driver.findElement(By.id("wpdm_submit_686e412ae2856_921"));
        submit.click();

    }

    @When("User click on upload file option")
    public void User_click_on_upload_file_option() throws InterruptedException, AWTException {
        WebElement uploadf = driver.findElement(By.xpath("//a[@class = 'wp-block-button__link wp-element-button'][text()='File Upload']"));
        uploadf.click();
        WebElement uploading = driver.findElement(By.id("file-upload"));

        Actions action = new Actions(driver);
        action.moveToElement(uploading).click().perform();

        StringSelection ss = new StringSelection("C:\\Users\\Karthik\\Desktop\\testing.txt");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        Robot robot = new Robot();
        robot.delay(2000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyRelease(KeyEvent.VK_V);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(2000);
        WebElement upload = driver.findElement(By.id("upload-btn"));
        upload.click();
        Thread.sleep(2000);

    }

    @When("User triggers the loading spinner")
    public void user_triggers_spinner() {
        WebElement loadButton = driver.findElement(By.xpath("//a[@class = 'wp-block-button__link wp-element-button'][text()='Spinners']"));
        loadButton.click();
    }

    @Then("Spinner should be displayed")
    public void spinner_should_be_displayed() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By spinnerLocator = By.xpath("//*[contains(@class,'spinner') or contains(@id,'spinner')]");

        WebElement spinner = wait.until(ExpectedConditions.visibilityOfElementLocated(spinnerLocator));
        Assert.assertTrue(spinner.isDisplayed());
    }
    @Then("Spinner should disappear after loading completes")
    public void spinner_should_disappear_after_loading() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("spinner")));
        System.out.println("✅ Spinner disappeared after loading.");
    }

    @When("user click on Get Started in iframe")
    public void user_click_on_Get_Started_in_iframe() throws InterruptedException {
        WebElement iframeMenu = driver.findElement(By.xpath("//a[text()='Iframes']"));
        iframeMenu.click();
        Thread.sleep(2000);


        driver.switchTo().frame("iframe-1");

        WebElement start = driver.findElement(By.xpath("//a[@class='getStarted_Sjon']"));
        start.click();
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        WebElement meto= driver.findElement(By.xpath("//p[normalize-space()='Me too!']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behaviour:'smooth', block:'center'});",meto);
        Thread.sleep(5000);


        driver.switchTo().frame("iframe-2");
        WebElement seleni = driver.findElement(By.id("dev-partners"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({behaviour:'smooth', block:'center'});",seleni);
        Thread.sleep(5000);
        WebElement selenium = driver.findElement(By.xpath("//img[@alt='BrowserStack']"));
        selenium.click();




    }


}







