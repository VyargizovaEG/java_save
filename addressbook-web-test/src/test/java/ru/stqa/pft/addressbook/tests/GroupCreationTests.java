package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;


public class GroupCreationTests {

  private final ApplicationManager app = new ApplicationManager();

  @BeforeClass
  public void setUp() throws Exception {
    app.init();
  }

  @AfterClass
  private void tearDown() {
    app.stop();

  }


}
