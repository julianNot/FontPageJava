package views.body;

import javax.swing.*;
import java.awt.*;

public class JPContainerBody extends JPanel {

    private JDExampleDrive jpDrive;
    private JPExampleLego jpLego;

    public JPContainerBody(){
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {

        //jpDrive = new JPExampleDrive();
        //this.add(jpDrive, BorderLayout.CENTER);

        //jpDrive = new JDExampleDrive();
        //this.add(jpDrive,BorderLayout.CENTER);

        jpLego = new JPExampleLego();
        this.add(jpLego,BorderLayout.CENTER);


    }

}
