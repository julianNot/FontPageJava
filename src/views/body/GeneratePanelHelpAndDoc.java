package views.body;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class GeneratePanelHelpAndDoc {

    public JPanel generatePanel(String title, String image,String Text){

        JPanel generatePanel = new JPanel();
        generatePanel.setPreferredSize(new Dimension(350,160));
        generatePanel.setLayout(new BoxLayout(generatePanel, BoxLayout.Y_AXIS));
        generatePanel.setBackground(Color.WHITE);
        //generatePanel.setBorder(BorderFactory.createMatteBorder(20, 40, 20, 40, Color.decode(ConstantGUI.BACKGROUND_PORTAFOLIO)));
        
        JLabel jlTitle = new JLabel();
        jlTitle.setFont(new Font("Arial", Font.PLAIN, 18));
        jlTitle.setForeground(Color.BLACK);
        jlTitle.setBorder(BorderFactory.createEmptyBorder(30,90,20,0));
        jlTitle.setOpaque(false);
        generatePanel.add(jlTitle);
        
        
        return generatePanel;
    }
}
