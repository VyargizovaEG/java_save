package ru.stqa.pft.addressbook.appmanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {

  private GroupsHelper groupsHelper = new GroupsHelper();

  public void init() {
      WebDriverManager.chromedriver().setup();
      groupsHelper.driver = new ChromeDriver();
      groupsHelper.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      JavascriptExecutor js = (JavascriptExecutor) groupsHelper.driver;
    }


  public void stop() {
      groupsHelper.driver.quit();
    }
}
