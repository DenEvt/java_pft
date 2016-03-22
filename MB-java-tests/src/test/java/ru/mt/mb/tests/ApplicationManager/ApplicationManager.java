package ru.mt.mb.tests.ApplicationManager;

import org.netbeans.jemmy.ClassReference;
import org.netbeans.jemmy.operators.*;
import org.netbeans.jemmy.util.NameComponentChooser;

public class ApplicationManager {

    public JFrameOperator mainFrame;

    public void run() {
        if (mainFrame == null) {
            try {
                new ClassReference("mango.billing.client.Main").startApplication();
                mainFrame = new JFrameOperator();
                JDialogOperator dialog = new JDialogOperator();
                JTextFieldOperator login = new JTextFieldOperator(dialog, new NameComponentChooser("login"));
                login.setText("dev");
                JPasswordFieldOperator password = new JPasswordFieldOperator(dialog);
                password.setText("1");
                new JButtonOperator(dialog, "ОК").clickMouse();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {

    }

}
