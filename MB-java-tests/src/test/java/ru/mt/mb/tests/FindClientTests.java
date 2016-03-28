package ru.mt.mb.tests;

import org.netbeans.jemmy.operators.JComponentOperator;
import org.testng.annotations.Test;

public class FindClientTests extends TestBase {

  @Test
  public void testFindClient() {
    app.getMenuHelper().gotoFindClient();
    JComponentOperator findClient = new JComponentOperator(app.mainFrame);
    app.rBtn(findClient, "Счет");
    app.chkBox(findClient, "Москва");
    app.textField(findClient, "find", "777777");
    app.btnC(findClient, "findButton");
  }

}
