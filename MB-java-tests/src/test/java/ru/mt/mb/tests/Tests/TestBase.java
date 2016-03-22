package ru.mt.mb.tests.Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.mt.mb.tests.ApplicationManager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() {
        app.run();
    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
