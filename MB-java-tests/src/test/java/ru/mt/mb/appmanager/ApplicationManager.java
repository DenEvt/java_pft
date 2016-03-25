package ru.mt.mb.appmanager;

import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.operators.*;
import org.netbeans.jemmy.util.NameComponentChooser;

import java.lang.reflect.InvocationTargetException;

public class ApplicationManager {

  public JFrameOperator mainFrame;

  public void init() throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException  {
    new ClassReference("mango.billing.client.Main").startApplication();
    mainFrame = new JFrameOperator();
    login("dev", "1");
  }

  public void login(String login, String password) {
    JDialogOperator dialog = new JDialogOperator();
    textField(dialog, "login", login);
    passwordField(dialog, "password", password);
    btnD(dialog, "ОК");
    btnF(mainFrame, "Закрыть");
  }

  public void btnF(JFrameOperator frame, String namebtnf) {
    new JButtonOperator(frame, namebtnf).clickMouse();
  }

  public void btnD(JDialogOperator dialog, String namebtnd) {
    new JButtonOperator(dialog, namebtnd).clickMouse();
  }

  public void passwordField(JDialogOperator frame, String password, String text) {
    new JPasswordFieldOperator(frame, new NameComponentChooser(password)).setText(text);
  }

  public void btnC(JComponentOperator frame, String name) {
    new JButtonOperator(frame, new NameComponentChooser(name)).clickMouse();
  }

  public void textField(ContainerOperator frame, String name, String text) {
    new JTextFieldOperator(frame, new NameComponentChooser(name)).setText(text);
  }

  public void chkBox(JComponentOperator frame, String name) {
    new JCheckBoxOperator(frame, name).clickMouse();
  }

  public void rBtn(JComponentOperator frame, String name) {
    new JRadioButtonOperator(frame, name).clickMouse();
  }

  public void gotoMenu(JFrameOperator frame, String menupath) {
    new JMenuBarOperator(frame).pushMenuNoBlock(menupath);
  }

  public void stop() {
    gotoMenu(mainFrame, "Файл|Выход");
    btnD(new JDialogOperator(), "Да");
  }
}
