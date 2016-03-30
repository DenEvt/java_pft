package ru.mt.mb.appmanager;

import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.operators.*;

import java.lang.reflect.InvocationTargetException;

public class ApplicationManager {

  private SessionHelper sessionHelper;
  private FindClientHelper findClientHelper;
  private MenuHelper menuHelper;

  public JFrameOperator mainFrame;

  public void init() throws InvocationTargetException, NoSuchMethodException, ClassNotFoundException  {
    new ClassReference("mango.billing.client.Main").startApplication();
    mainFrame = new JFrameOperator();
    menuHelper = new MenuHelper(mainFrame);
    sessionHelper = new SessionHelper(mainFrame);
    findClientHelper = new FindClientHelper(mainFrame);
    sessionHelper.login("dev", "1");
  }

  public void stop() {
    menuHelper.gotoExit();
//    getSessionHelper().btn("Да");
    sessionHelper.btn("Да");
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
