package views;

import presenter.Presenter;
import views.body.JPContainerBody;
import views.header.JPContainerHeader;

import javax.swing.*;
import java.awt.*;

public class JPMainPanel extends JPanel {

    private JPContainerHeader jpcontainerHeader;
    private JPContainerBody jpcontainerBody;
    private Presenter myPresenter;

    public JPMainPanel(Presenter presenter){
        myPresenter = presenter;
        setLayout(new BorderLayout());
        setBackground(Color.white);
        initComponents();
    }

    private void initComponents() {
        jpcontainerHeader = new JPContainerHeader(myPresenter);
        add(jpcontainerHeader, BorderLayout.PAGE_START);

        jpcontainerBody = new JPContainerBody();
        add(jpcontainerBody, BorderLayout.CENTER);
    }

    public void showPanelLego(){
        jpcontainerBody.showPanelLego();

    }
    public void showPanelProfile(){
        jpcontainerBody.showPanelProfile();

    }
    public void showPanelIberia(){
        jpcontainerBody.showPanelIberia();

    }

    public void showPanelGmail(){
        jpcontainerBody.showPanelGmail();
    }
    public void showPanelGoogle(){
       jpcontainerBody.showPanelGoogle();
    }
    public void showPanelRecognition(){
        jpcontainerBody.showPanelRecognition();
    }
    public void showPanelAdvancedSettings(){
        jpcontainerBody.showPanelAdvancedSettings();
    }
    public void showPanelMinimalist(){
        jpcontainerBody.showPanelMinimalist();
    }
}
