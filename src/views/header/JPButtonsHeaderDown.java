package views.header;

import presenter.EVENTS;
import presenter.Presenter;
import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPButtonsHeaderDown extends JPanel {

    private JPModelButtons jbShowPanelReconocimiento, jbShowDialogLogIn, jbShowPanelMinimalist, jbShowDialogPassword, jbShowPanelIberia;
    private Presenter myPresenter;

    public JPButtonsHeaderDown(Presenter presenter){
        myPresenter = presenter;
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setAlignmentX(LEFT_ALIGNMENT);
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {
        addButtonDown();
    }

    private void addButtonDown() {

        jbShowPanelReconocimiento = new JPModelButtons(ConstantGUI.TEXT_SIXTH_BUTTON, ConstantGUI.BUTTON_RECONOCIMIENTO);
        add(jbShowPanelReconocimiento);

        jbShowDialogLogIn = new JPModelButtons(ConstantGUI.TEXT_SEVENTH_BUTTON, ConstantGUI.BUTTON_FLEXIBILIDAD_USO);
        add(jbShowDialogLogIn);

        jbShowPanelMinimalist = new JPModelButtons(ConstantGUI.TEXT_EIGHTH_BUTTON, ConstantGUI.BUTTON_ESTETICA);
        add(jbShowPanelMinimalist);

        jbShowDialogPassword = new JPModelButtons(ConstantGUI.TEXT_NINTH_BUTTON, ConstantGUI.BUTTON_ADVERTENCIA);
        jbShowDialogPassword.addActionListener(myPresenter);
        jbShowDialogPassword.setActionCommand(EVENTS.C_RECUPERAR_ERRORES.toString());
        add(jbShowDialogPassword);

        jbShowPanelIberia = new JPModelButtons(ConstantGUI.TEXT_TENTH_BUTTON, ConstantGUI.BUTTON_DOCUMENTACION);
        jbShowPanelIberia.addActionListener(myPresenter);
        jbShowPanelIberia.setActionCommand(EVENTS.C_DOCUMENTACION.toString());
        add(jbShowPanelIberia);

    }
}
