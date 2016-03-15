package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation () {
        app.getNavigationHelper().initContactPage();
        fillContactForm();
        submitContactCreation();
    }

    private void submitContactCreation() {
        wd.findElement(By.name("submit")).click();
    }

}
