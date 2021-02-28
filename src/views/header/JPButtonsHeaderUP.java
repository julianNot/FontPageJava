package views.header;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPButtonsHeaderUP extends JPanel {

    private JPModelButtons jbFirstButton, jbSecondButton, jbThirdButton, jbFourthButton, jbFifthButton,
            jbSixthButton,jbSeventhButton, jbEighthButton, jbNinthButton,jbTenthButton;

    public JPButtonsHeaderUP(){
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        setAlignmentX(LEFT_ALIGNMENT);
        setBackground(Color.WHITE);
        initComponents();

    }

    private void initComponents() {
        addButtonUP();
        //addButtonDown();
    }

    private void addButtonUP() {
        jbFifthButton = new JPModelButtons(ConstantGUI.TEXT_FIRST_BUTTON, ConstantGUI.BUTTON_VISIBILIDAD);
        add(jbFifthButton);

        jbSecondButton= new JPModelButtons(ConstantGUI.TEXT_SECOND_BUTTON, ConstantGUI.BUTTON_CORRESPONDENCIA);
        add(jbSecondButton);

        jbThirdButton = new JPModelButtons(ConstantGUI.TEXT_THIRD_BUTTON, ConstantGUI.BUTTON_LIBERTAD_USUARIO);
        add(jbThirdButton);

        jbFourthButton = new JPModelButtons(ConstantGUI.TEXT_FOURTH_BUTTON, ConstantGUI.BUTTON_PREVENCION_ERRORES);
        add(jbFourthButton);

        jbFifthButton = new JPModelButtons(ConstantGUI.TEXT_FIFTH_BUTTON, ConstantGUI.BUTTON_COHERENCIA);
        add(jbFifthButton);
    }
}
