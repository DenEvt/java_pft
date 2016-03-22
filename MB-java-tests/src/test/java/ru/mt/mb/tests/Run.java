package ru.mt.mb.tests;

import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.QueueTool;
import org.netbeans.jemmy.operators.*;
import org.testng.annotations.Test;

import javax.swing.*;

@Test
public class Run {

    private JFrameOperator mainFrame;

    public void getApp() {
        if (mainFrame == null) {
            try {
                new ClassReference("mango.billing.client.Main").startApplication();
                mainFrame = new JFrameOperator(); //"Вход в MangoBilling"
                JDialogOperator dialog = new JDialogOperator();
                JTextFieldOperator login = new JTextFieldOperator(dialog, 1);
                login.clearText();
                login.setText("dev");
                JPasswordFieldOperator password = new JPasswordFieldOperator(dialog);
                password.clearText();
                password.setText("1");
                new JButtonOperator(dialog, "ОК").clickMouse();
                new JRadioButtonOperator(mainFrame, "Счет").clickMouse();
                new JRadioButtonOperator(mainFrame, "Создания").clickMouse();
                JTextFieldOperator find = new JTextFieldOperator(mainFrame, 2);
                find.getAccessibleContext();
                find.clearText();
                find.setText("777");
                new JButtonOperator(mainFrame, "Закрыть").clickMouse();
                new JMenuBarOperator(mainFrame).pushMenuNoBlock("Файл|Найти клиента");
                new QueueTool().waitEmpty(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
