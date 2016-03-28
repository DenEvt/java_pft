package ru.mt.mb.appmanager;

import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.JMenuBarOperator;

public class MenuHelper {

  private JFrameOperator mainFrame;

  public MenuHelper(JFrameOperator mainFrame) {
    this.mainFrame = mainFrame;
  }

  public void gotoFindClient() {
    new JMenuBarOperator(mainFrame).pushMenuNoBlock("Файл|Найти клиента");
  }

  public void gotoExit() {
    new JMenuBarOperator(mainFrame).pushMenuNoBlock("Файл|Выход");
  }
}
