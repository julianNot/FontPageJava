package views;

import views.body.JPContainerBody;
import views.header.JPContainerHeader;

import javax.swing.*;
import java.awt.*;

public class JPMainPanel extends JPanel {

    private JPContainerHeader jpcontainerHeader;
    private JPContainerBody jpcontainerBody;

    public JPMainPanel(){
        setLayout(new BorderLayout());
        setBackground(Color.white);
        initComponents();
    }

    private void initComponents() {
        jpcontainerHeader = new JPContainerHeader();
        add(jpcontainerHeader, BorderLayout.PAGE_START);

        jpcontainerBody = new JPContainerBody();
        add(jpcontainerBody, BorderLayout.CENTER);
    }
}
