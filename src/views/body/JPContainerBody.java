package views.body;

import javax.swing.*;
import java.awt.*;

public class JPContainerBody extends JPanel {

    private JDExampleDrive jpDrive;
    private JPExampleLego jpLego;
    private JPExampleProfile jpProfile;

    public JPContainerBody(){
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {

        jpProfile = new JPExampleProfile();
        //this.add(jpProfile, BorderLayout.CENTER);

        //jpDrive = new JPExampleDrive();
        //this.add(jpDrive, BorderLayout.CENTER);

        //jpDrive = new JDExampleDrive();
        //this.add(jpDrive,BorderLayout.CENTER);

        jpLego = new JPExampleLego();
        //this.add(jpLego,BorderLayout.CENTER);


    }

}
