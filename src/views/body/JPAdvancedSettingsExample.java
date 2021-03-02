package views.body;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPAdvancedSettingsExample extends JPanel{

    public JPAdvancedSettingsExample(){
        setLayout(new BorderLayout());
        setAlignmentX(CENTER_ALIGNMENT);
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {
        addJLabelExample();
    }

    private void addJLabelExample() {
        JLabel jlExampleAS = new JLabel();
        jlExampleAS.setHorizontalTextPosition(JLabel.CENTER);
        jlExampleAS.setVerticalAlignment(JLabel.BOTTOM);
        //jlExampleAS.setPreferredSize(new Dimension(1366,603));
        jlExampleAS.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.BANNER_ADVANCED_SETTINGS)));
        jlExampleAS.setBorder(null);
        add(jlExampleAS,BorderLayout.PAGE_START);
    }
}
