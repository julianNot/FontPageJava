package views.header;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPButtonsHeaderDown extends JPanel {

    private JPModelButtons jbSixthButton,jbSeventhButton, jbEighthButton, jbNinthButton,jbTenthButton;

    public JPButtonsHeaderDown(){
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setAlignmentX(LEFT_ALIGNMENT);
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {
        addButtonDown();
    }

    private void addButtonDown() {

        jbSixthButton = new JPModelButtons(ConstantGUI.TEXT_SIXTH_BUTTON, ConstantGUI.BUTTON_RECONOCIMIENTO);
        add(jbSixthButton);

        jbSeventhButton= new JPModelButtons(ConstantGUI.TEXT_SEVENTH_BUTTON, ConstantGUI.BUTTON_FLEXIBILIDAD_USO);
        add(jbSeventhButton);

        jbEighthButton = new JPModelButtons(ConstantGUI.TEXT_EIGHTH_BUTTON, ConstantGUI.BUTTON_ESTETICA);
        add(jbEighthButton);

        jbNinthButton = new JPModelButtons(ConstantGUI.TEXT_NINTH_BUTTON, ConstantGUI.BUTTON_ADVERTENCIA);
        add(jbNinthButton);

        jbTenthButton = new JPModelButtons(ConstantGUI.TEXT_TENTH_BUTTON, ConstantGUI.BUTTON_DOCUMENTACION);
        add(jbTenthButton);

    }
}
