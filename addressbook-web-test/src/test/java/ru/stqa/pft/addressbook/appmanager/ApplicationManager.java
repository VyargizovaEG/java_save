package ru.stqa.pft.addressbook.appmanager;

import static org.openqa.selenium.remote.BrowserType.*;

public class ApplicationManager {
    GroupsHelper groupsHelper;



    public ApplicationManager(GroupsHelper groupsHelper) {

        this.groupsHelper = groupsHelper;
    }

    public void setUP() {
        String browser = FIREFOX;
        if (browser == FIREFOX) {
            groupsHelper = new GroupsHelper();
        } else if (browser == CHROME) {
            groupsHelper = new GroupsHelper();
        } else if (browser == OPERA) {
            groupsHelper = new GroupsHelper();
        }
    }



}
