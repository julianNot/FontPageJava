package presenter;

import views.JFrameMainWindow;
import views.body.JDExampleDrive;
import views.body.JDPasswordForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presenter implements ActionListener {

    private JFrameMainWindow mainWindow;

    public Presenter(){
        mainWindow = new JFrameMainWindow(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (EVENTS.valueOf(e.getActionCommand())){
            case C_BUTTON_VISIBILIDAD:
                new JDExampleDrive();
                break;
            case C_BUTTON_RELACION:
                mainWindow.showPanelLego();
                break;
            case C_BUTTON_CONSISTENCIA:
                mainWindow.showPanelProfile();
                break;
            case C_DOCUMENTACION:
                mainWindow.showPanelIberia();
                break;
            case C_RECUPERAR_ERRORES:
                new JDPasswordForm();
                break;
        }
    }
}
