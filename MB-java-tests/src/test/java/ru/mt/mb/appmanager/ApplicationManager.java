package ru.mt.mb.appmanager;

import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.accessibility.AccessibleNameChooser;
import org.netbeans.jemmy.operators.JButtonOperator;
import org.netbeans.jemmy.operators.JDialogOperator;
import org.netbeans.jemmy.operators.JFrameOperator;

import java.lang.reflect.InvocationTargetException;

public class ApplicationManager {

  public JFrameOperator mainFrame;
  private SessionHelper sessionHelper;
  private FindClientHelper findClientHelper;
  private MenuHelper menuHelper;

  public void init() throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException {
    new ClassReference("mango.billing.client.Main").startApplication();
    mainFrame = new JFrameOperator();
    menuHelper = new MenuHelper(mainFrame);
    findClientHelper = new FindClientHelper(mainFrame);
    sessionHelper = new SessionHelper(mainFrame);
    sessionHelper.login("dev", "1");
  }

  public void stop() {
    menuHelper.gotoExit();
    sessionHelper.btn("Да");
//    new JButtonOperator(new JDialogOperator(), new AccessibleNameChooser("Да")).clickMouse();
  }

  public MenuHelper getMenuHelper() {
    return menuHelper;
  }

  public FindClientHelper getFindClientHelper() {
    return findClientHelper;
  }

  public SessionHelper getSessionHelper() {
    return sessionHelper;
  }
}
