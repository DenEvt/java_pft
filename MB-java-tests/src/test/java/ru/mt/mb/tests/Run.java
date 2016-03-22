package ru.mt.mb.tests;

import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.QueueTool;
import org.netbeans.jemmy.operators.*;
import org.netbeans.jemmy.util.NameComponentChooser;
import org.testng.annotations.Test;

import java.awt.*;

@Test
public class Run {

    private JFrameOperator mainFrame;

    public void getApp() {
        if (mainFrame == null) {
            try {
                new ClassReference("mango.billing.client.Main").startApplication();
                mainFrame = new JFrameOperator(); //"Вход в MangoBilling"
                JDialogOperator dialog = new JDialogOperator();
                JTextFieldOperator login = new JTextFieldOperator(dialog, new  NameComponentChooser("login"));
//                JScrollPaneOperator pane = new JScrollPaneOperator(mainFrame);
                login.clearText();
                login.setText("dev");
                JPasswordFieldOperator password = new JPasswordFieldOperator(dialog);
                password.clearText();
                password.setText("1");
                new JButtonOperator(dialog, "ОК").clickMouse();
                JComponentOperator findClient = new JComponentOperator(mainFrame);
                new JRadioButtonOperator(findClient, "Счет").clickMouse();
                new JRadioButtonOperator(findClient, "Создания").clickMouse();
                new JCheckBoxOperator(findClient, "Москва").push();
                JTextFieldOperator find = new JTextFieldOperator(findClient, new  NameComponentChooser("find"));
                find.clearText();
                find.setText("777888");
                JTextFieldOperator edShowCustCnt = new JTextFieldOperator(findClient, 3);
                edShowCustCnt.clearText();
                edShowCustCnt.setText("333");
                Component tabClient = new JTabbedPaneOperator(findClient).selectPage("Агенты");
//                new JButtonOperator(findClient, "Закрыть").clickMouse();
//                new JMenuBarOperator(findClient).pushMenuNoBlock("Файл|Найти клиента");
                new QueueTool().waitEmpty(4000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
