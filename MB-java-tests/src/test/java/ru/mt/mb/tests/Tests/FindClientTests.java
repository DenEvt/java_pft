package ru.mt.mb.tests.Tests;

import org.netbeans.jemmy.QueueTool;
import org.netbeans.jemmy.operators.*;
import org.netbeans.jemmy.util.NameComponentChooser;
import org.testng.annotations.Test;

public class FindClientTests extends TestBase {

  private JFrameOperator mainFrame;
  
  @Test
  public void testFindClient() {
    JComponentOperator findClient = new JComponentOperator(mainFrame);
    new JRadioButtonOperator(findClient, "Счет").clickMouse();
    new JRadioButtonOperator(findClient, "Создания").clickMouse();
    new JCheckBoxOperator(findClient, "Москва").push();
    JTextFieldOperator find = new JTextFieldOperator(findClient, new NameComponentChooser("find"));
    find.clearText();
    find.setText("777888");
    JTextFieldOperator edShowCustCnt = new JTextFieldOperator(findClient, 3);
    edShowCustCnt.clearText();
    edShowCustCnt.setText("333");
    new JTabbedPaneOperator(findClient).selectPage("Агенты");
//                new JButtonOperator(findClient, "Закрыть").clickMouse();
//                new JMenuBarOperator(findClient).pushMenuNoBlock("Файл|Найти клиента");
    new QueueTool().waitEmpty(4000);
  }



}
