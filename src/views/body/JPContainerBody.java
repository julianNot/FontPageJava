package views.body;

import javax.swing.*;
import java.awt.*;

public class JPContainerBody extends JPanel {

    private JDExampleDrive jpDrive;
    private JPExampleLego jpLego;
    private JPExampleProfile jpProfile;
    private JPExampleIberia jpIberia;
    private JPExampleRecognition jpRecognition;
    private  JPExampleGmail jpGmail;
    private JPExampleGoogle jpGoogle;
    private JPAdvancedSettingsExample jpAS;
    private JPExampleMinimalist jpMinimalist;

    public JPContainerBody(){
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {

        jpLego = new JPExampleLego();
        jpProfile = new JPExampleProfile();
        jpIberia = new JPExampleIberia();
        jpGmail = new JPExampleGmail();
        jpGoogle = new JPExampleGoogle();
        jpRecognition = new JPExampleRecognition();
        jpAS = new JPAdvancedSettingsExample();
        jpMinimalist = new JPExampleMinimalist();
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

    public void showPanelGmail(){
        this.removeAll();
        this.repaint();
        this.add(jpGmail,BorderLayout.CENTER);
        revalidate();
    }

    public void showPanelGoogle(){
        this.removeAll();
        this.repaint();
        this.add(jpGoogle,BorderLayout.CENTER);
        revalidate();
    }

    public void showPanelRecognition(){
        this.removeAll();
        this.repaint();
        this.add(jpRecognition,BorderLayout.CENTER);
        revalidate();
    }

    public void showPanelAdvancedSettings(){
        this.removeAll();
        this.repaint();
        this.add(jpAS,BorderLayout.CENTER);
        revalidate();
    }

    public void showPanelMinimalist(){
        this.removeAll();
        this.repaint();
        this.add(jpMinimalist,BorderLayout.CENTER);
        revalidate();
    }

}
