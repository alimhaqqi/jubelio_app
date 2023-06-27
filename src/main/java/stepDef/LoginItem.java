package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import config.env_target;
import java.time.Duration;

public class LoginItem extends env_target{
    @Given("User is on jubelio homepage")
    public void userIsOnJubelioHomepage() {
        System.setProperty("webdriver.chrome.driver","src\\main\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(jubelioLink);
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Login')]"))
        );
    }

    @When("User input email and password")
    public void userInputEmailAndPassword() {
        driver.findElement(By.name("email")).sendKeys("qa.rakamin.jubelio@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Jubelio123!");
    }

    @And("User click login button")
    public void userClickLoginButton() {
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }

    @Then("User verify login result")
    public void userVerifyLoginResult() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page-wrapper']/div[2]/div/div/div[1]/h1"))
        );
        driver.quit();
    }

    @When("User input valid email and invalid password")
    public void userInputValidEmailAndInvalidPassword() {
        driver.findElement(By.name("email")).sendKeys("qa.rakamin.jubelio@gmail.com");
        driver.findElement(By.name("password")).sendKeys("jubelio123");
    }

    @Then("User get error message")
    public void userGetErrorMessage() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Password atau email anda salah')]"))
        );
        driver.quit();
    }

    @Then("User verify jubelio dashboard")
    public void userVerifyJubelioDashboard() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page-wrapper']/div[2]/div/div/div[1]/h1"))
        );
    }

    @When("User click item menu")
    public void userClickItemMenu() {
        WebElement element = driver.findElement(By.xpath("//*[@id='wrapper']/nav/div/div/ul/li[2]/a"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }

    @And("User click stock menu")
    public void userClickStockMenu() {
        WebElement element = driver.findElement(By.xpath("//*[@href='/home/inventory']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }

    @Then("User verify stock page")
    public void userVerifyStockPage() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Available')]"))
        );
    }

    @When("User input item")
    public void userInputItem() {
        driver.findElement(By.xpath("//*[@class='form-control']")).sendKeys("Erigo Clothes");
    }

    @And("User click search button")
    public void userClickSearchButton() {
        WebElement element = driver.findElement(By.xpath("//*[@class='glyphicon glyphicon-search']"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }

    @Then("User verify choosen item")
    public void userVerifyChoosenItem() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/div/span[contains(text(),'1')]"))
        );
    }

    @When("User choose item")
    public void userChooseItem() {
        WebElement element = driver.findElement(By.xpath("//*[@id='page-wrapper']/div[3]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div/div/div[2]/div/div/div[2]/div[1]/div/div[6]/div/div/span/div"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }

    @And("User click stock adjustment")
    public void userClickStockAdjustment() {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Penyesuaian Persediaan')]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }

    @Then("User verify stock adjustment page")
    public void userVerifyStockAdjustmentPage() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Note: Harga Pokok hanya bisa diubah untuk penyesuaian (+)')]"))
        );
    }

    @When("User input qty stock")
    public void userInputQtyStock(){
        //must fix
        driver.findElement(By.xpath("//input[@placeholder='Scan']")).sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.SPACE);
        driver.findElement(By.xpath("//input[contains(@class,'editor-main')]")).sendKeys("10");
    }

    @And("User click save button")
    public void userClickSaveButton() {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Simpan')]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }

    @Then("User verify save result")
    public void userVerifySaveResult() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Data berhasil disimpan')]"))
        );
        driver.quit();
    }

    @When("User directly click save button")
    public void userDirectlyClickSaveButton() {
        WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Simpan')]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].click()", element);
    }

    @Then("User get error message for save result")
    public void userGetErrorMessageForSaveResult() {
        Duration duration = Duration.ofSeconds(10);
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Qty adjustment tidak boleh yang kosong')]"))
        );
        driver.quit();
    }
}