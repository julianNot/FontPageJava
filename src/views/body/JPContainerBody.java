package views.body;

import javax.swing.*;
import java.awt.*;

public class JPContainerBody extends JPanel {

    private JDExampleDrive jpDrive;
    private JPExampleLego jpLego;
    private JPExampleProfile jpProfile;

    private JPExampleIberia jpIberia;

    private JPExampleRecognition jpRecognition;

    public JPContainerBody(){
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {

        jpLego = new JPExampleLego();
        jpProfile = new JPExampleProfile();

        jpIberia = new JPExampleIberia();
    }

        //this.add(jpProfile, BorderLayout.CENTER);

    public void showPanelLego(){
        this.removeAll();
        this.repaint();
        this.add(jpLego,BorderLayout.CENTER);
        revalidate();
    }

    public void showPanelProfile(){
        this.removeAll();
        this.repaint();
        this.add(jpProfile,BorderLayout.CENTER);
        revalidate();
    }

    public void showPanelIberia(){
        this.removeAll();
        this.repaint();
        this.add(jpIberia,BorderLayout.CENTER);
        revalidate();
    }

}
