package views.body;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPExampleGoogle extends JPanel {

    public JPExampleGoogle(){
        setLayout(new BorderLayout());
        setAlignmentX(CENTER_ALIGNMENT);
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {
        addJLabelExample();
    }

    private void addJLabelExample() {
        JLabel jlExampleGmail = new JLabel();
        jlExampleGmail.setHorizontalTextPosition(JLabel.CENTER);
        jlExampleGmail.setVerticalAlignment(JLabel.BOTTOM);
        //jlExampleGmail.setPreferredSize(new Dimension(1366,603));
        jlExampleGmail.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.BANNER_GOOGLE)));
        jlExampleGmail.setBorder(null);
        add(jlExampleGmail,BorderLayout.PAGE_START);
    }
}
