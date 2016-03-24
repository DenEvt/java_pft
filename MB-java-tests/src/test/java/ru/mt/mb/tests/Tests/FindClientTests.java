package ru.mt.mb.tests.Tests;

import org.netbeans.jemmy.ClassReference;
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
    login("dev", "1");
  }

  private void login(String login, String password) {
    JDialogOperator dialog = new JDialogOperator();
    textField(dialog, "login", login);
    passwordField(dialog, "password", password);
    btnD(dialog, "ОК");
    btnF(mainFrame, "Закрыть");
  }

  private void btnF(JFrameOperator frame, String namebtnf) {
    new JButtonOperator(frame, namebtnf).clickMouse();
  }

  private void btnD(JDialogOperator dialog, String namebtnd) {
    new JButtonOperator(dialog, namebtnd).clickMouse();
  }

  private void passwordField(JDialogOperator frame, String password, String text) {
    new JPasswordFieldOperator(frame, new NameComponentChooser(password)).setText(text);
  }

  @Test
  public void testFindClient() {
    gotoMenu(mainFrame, "Файл|Найти клиента");
    JComponentOperator findClient = new JComponentOperator(mainFrame);
    rBtn(findClient, "Счет");
    chkBox(findClient, "Москва");
    textField(findClient, "find", "777777");
    btnC(findClient, "findButton");
  }

  private void btnC(JComponentOperator frame, String name) {
    new JButtonOperator(frame, new NameComponentChooser(name)).clickMouse();
  }

  private void textField(ContainerOperator frame, String name, String text) {
    new JTextFieldOperator(frame, new NameComponentChooser(name)).setText(text);
  }

  private void chkBox(JComponentOperator frame, String name) {
    new JCheckBoxOperator(frame, name).clickMouse();
  }

  private void rBtn(JComponentOperator frame, String name) {
    new JRadioButtonOperator(frame, name).clickMouse();
  }

  private void gotoMenu(JFrameOperator frame, String menupath) {
    new JMenuBarOperator(frame).pushMenuNoBlock(menupath);
  }

  @AfterMethod
  public void tearDown() throws Exception {
    gotoMenu(mainFrame, "Файл|Выход");
    btnD(new JDialogOperator(), "Да");
  }

}
