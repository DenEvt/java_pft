package ru.mt.mb.tests.Tests;

import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.QueueTool;
import org.netbeans.jemmy.operators.*;
import org.netbeans.jemmy.util.NameComponentChooser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindClientTests {

  public JFrameOperator mainFrame;

  @BeforeMethod
  public void setUp() throws Exception {
    new ClassReference("mango.billing.client.Main").startApplication();
    mainFrame = new JFrameOperator();
    login();
  }

  private void login() {
    JDialogOperator dialog = new JDialogOperator();
    new JTextFieldOperator(dialog, new NameComponentChooser("login")).setText("dev");
    new JPasswordFieldOperator(dialog).setText("1");
    new JButtonOperator(dialog, "ОК").clickMouse();
    new JButtonOperator(new JComponentOperator(mainFrame), "Закрыть").clickMouse();
  }

  @Test
  public void testFindClient() {
    gotoMenu("Файл|Найти клиента");
    JComponentOperator findClient = new JComponentOperator(mainFrame);
    new JRadioButtonOperator(findClient, "Счет").clickMouse();
    new JRadioButtonOperator(findClient, "Создания").clickMouse();
    new JCheckBoxOperator(findClient, "Москва").clickMouse();
    new JTextFieldOperator(findClient, new NameComponentChooser("find")).setText("777888");
    new JTextFieldOperator(findClient, 3).setText("333");
    new JButtonOperator(findClient, new NameComponentChooser("findButton")).clickMouse();
  }

  private void gotoMenu(String path) {
    new JMenuBarOperator(mainFrame).pushMenuNoBlock(path);
  }

  @AfterMethod
  public void tearDown() throws Exception {
    gotoMenu("Файл|Выход");
    new JButtonOperator(new JDialogOperator(), "Да").clickMouse();
  }

}
