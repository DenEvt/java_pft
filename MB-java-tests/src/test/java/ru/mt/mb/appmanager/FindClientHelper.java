package ru.mt.mb.appmanager;

import org.netbeans.jemmy.operators.*;
import org.netbeans.jemmy.util.NameComponentChooser;

public class FindClientHelper {

  private JFrameOperator mainFrame;
  private JComponentOperator findClient;

  public FindClientHelper(JFrameOperator mainFrame) {
    this.mainFrame = mainFrame;
    findClient = new JComponentOperator(mainFrame);
  }

  public void btn(String name) {
    new JButtonOperator(findClient, new NameComponentChooser(name)).clickMouse();
  }

  public void btn2(String name) {
    new JButtonOperator(findClient,name).clickMouse();
  }

  public void textField(String name, String text) {
    new JTextFieldOperator(findClient, new NameComponentChooser(name)).setText(text);
  }

  public void chkBox(String name) {
    new JCheckBoxOperator(findClient, name).clickMouse();
  }

  public void rBtn(String name) {
    new JRadioButtonOperator(findClient, name).clickMouse();
  }

}
