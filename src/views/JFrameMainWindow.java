package views;

import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JFrameMainWindow extends JFrame {

    private JPMainPanel jpMainPanel;

    public JFrameMainWindow(){
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource(ConstantGUI.ICON_FRONT_PAGE)).getImage());
        setTitle(ConstantGUI.TITLE_FRONT_PAGE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        jpMainPanel = new JPMainPanel();
        JScrollPane jsPMainPanel = new JScrollPane();
        jsPMainPanel.setViewportView(jpMainPanel);
        jsPMainPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(jsPMainPanel);
    }
}
