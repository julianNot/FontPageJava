package views.header;

import presenter.EVENTS;
import presenter.Presenter;
import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPButtonsHeaderUP extends JPanel {

    private Presenter myPresenter;
    private JPModelButtons  jbShowDialogDrive, jbShowPanelLego, jbShowPanelGmail, jbShowPanelProfile, jbShowPanelSearchGoogle;

    public JPButtonsHeaderUP(Presenter presenter){
        myPresenter = presenter;
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setAlignmentX(LEFT_ALIGNMENT);
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(1349,91));
        initComponents();

    }

    private void initComponents() {
        addButtonUP();
        //addButtonDown();
    }

    private void addButtonUP() {
        jbShowDialogDrive = new JPModelButtons(ConstantGUI.TEXT_FIRST_BUTTON, ConstantGUI.BUTTON_VISIBILIDAD);
        jbShowDialogDrive.addActionListener(myPresenter);
        jbShowDialogDrive.setActionCommand(EVENTS.C_BUTTON_VISIBILIDAD.toString());
        add(jbShowDialogDrive);

        jbShowPanelLego = new JPModelButtons(ConstantGUI.TEXT_SECOND_BUTTON, ConstantGUI.BUTTON_CORRESPONDENCIA);
        jbShowPanelLego.addActionListener(myPresenter);
        jbShowPanelLego.setActionCommand(EVENTS.C_BUTTON_RELACION.toString());
        add(jbShowPanelLego);

        jbShowPanelGmail = new JPModelButtons(ConstantGUI.TEXT_THIRD_LIBERTAD_USUARIO, ConstantGUI.BUTTON_LIBERTAD_USUARIO);
        jbShowPanelGmail.addActionListener(myPresenter);
        jbShowPanelGmail.setActionCommand(EVENTS.C_CONTROL_Y_LIBERTAD_USUARIO.toString());
        add(jbShowPanelGmail);

        jbShowPanelProfile = new JPModelButtons(ConstantGUI.TEXT_BUTTON_CONSISTENCIA, ConstantGUI.BUTTON_COHERENCIA);
        jbShowPanelProfile.addActionListener(myPresenter);
        jbShowPanelProfile.setActionCommand(EVENTS.C_BUTTON_CONSISTENCIA.toString());
        add(jbShowPanelProfile);

        jbShowPanelSearchGoogle = new JPModelButtons(ConstantGUI.TEXT_FIFTH_BUTTON, ConstantGUI.BUTTON_PREVENCION_ERRORES);
        jbShowPanelSearchGoogle.addActionListener(myPresenter);
        jbShowPanelSearchGoogle.setActionCommand(EVENTS.C_PREVENCION_ERRORES.toString());
        add(jbShowPanelSearchGoogle);
    }
}
