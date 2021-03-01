package views;

import presenter.Presenter;

import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.*;

public class JFrameMainWindow extends JFrame {

    private JPMainPanel jpMainPanel;
    private Presenter myPresenter;

    public JFrameMainWindow(Presenter presenter){
        myPresenter = presenter;
        setExtendedState(MAXIMIZED_BOTH);
        setIconImage(new ImageIcon(getClass().getResource(ConstantGUI.ICON_FRONT_PAGE)).getImage());
        setTitle(ConstantGUI.TITLE_FRONT_PAGE);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    private void initComponents() {
        jpMainPanel = new JPMainPanel(myPresenter);
        JScrollPane jsPMainPanel = new JScrollPane();
        jsPMainPanel.setViewportView(jpMainPanel);
        jsPMainPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(jsPMainPanel);
    }

    public void showPanelLego(){
        jpMainPanel.showPanelLego();

    }
    public void showPanelProfile(){
        jpMainPanel.showPanelProfile();

    }
    public void showPanelIberia(){
        jpMainPanel.showPanelIberia();

    }
}
