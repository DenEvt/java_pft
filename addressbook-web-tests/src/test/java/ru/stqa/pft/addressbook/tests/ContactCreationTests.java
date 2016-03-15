package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation () {
        app.getNavigationHelper().initContactPage();
        app.getContactHelper().fillContactForm(new ContactData("des", "kad", "evt", "gnoom", "OOO", "horns", "moscow", "11111", "22222", "333333", "444444"));
        app.getContactHelper().submitContactCreation();
    }

}
