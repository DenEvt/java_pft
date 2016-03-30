package ru.mt.mb.appmanager;

import org.netbeans.jemmy.accessibility.AccessibleNameChooser;
import org.netbeans.jemmy.operators.*;
import org.netbeans.jemmy.util.NameComponentChooser;

public class SessionHelper {

  private JFrameOperator mainFrame;
  private JDialogOperator dialog;
  private FindClientHelper findClientHelper;

  public SessionHelper(JFrameOperator mainFrame) {
    this.mainFrame = mainFrame;
    dialog = new JDialogOperator();   //mainFrame
    findClientHelper = new FindClientHelper(mainFrame);
  }

  public void login(String login, String password) {
    textField(dialog, "login", login);
    passwordField(dialog, "password", password);
    btn("ОК");
    findClientHelper.btn2("Закрыть");                // поиск по аксесбл нейм
//  findClientHelper.btn("Закрыть");                 // поиск по нейму
  }

  public void btn(String name) {
    new JButtonOperator(dialog, new AccessibleNameChooser(name)).clickMouse();
  }

  public void textField(JDialogOperator frame, String login, String text) {
    new JTextFieldOperator(frame, new NameComponentChooser(login)).setText(text);
  }

  public void passwordField(JDialogOperator frame, String password, String text) {
    new JPasswordFieldOperator(frame, new NameComponentChooser(password)).setText(text);
  }

}
