package ru.stqa.pft.addressbook;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SimbirSoftTest2  {
    private WebDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        JavascriptExecutor js = (JavascriptExecutor) driver;
    }

    @Test
    public void testUntitledTestCase() throws Exception {
        gotoPaage();
        fillForm();
        Result();
    }

    private void Result() throws InterruptedException {
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div")).click();
        Thread.sleep(3000);
        driver.close();
    }

    private void fillForm() {
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div")).click();
        driver.findElement(By.xpath("//div[@id='rso']/div/div/div/div/div/div/div[3]/div/table[2]/tbody/tr[5]/td/div/div")).click();
    }

    private void gotoPaage() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("\u041A\u0430\u043B\u044C\u043A\u0443\u043B\u044F\u0442\u043E\u0440");
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @AfterClass
    private void tearDown() {
        driver.quit();

    }

}
