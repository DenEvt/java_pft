package ru.mt.mb.tests;

import org.testng.annotations.Test;

public class FindClientTests extends TestBase {

  @Test
  public void testFindClient() {
    app.getMenuHelper().gotoFindClient();
    app.getFindClientHelper().rBtn("Счет");
    app.getFindClientHelper().chkBox("Москва");
    app.getFindClientHelper().textField("find", "777777");
    app.getFindClientHelper().btn("findButton");
    app.getFindClientHelper().btn2("Закрыть");
  }

}
