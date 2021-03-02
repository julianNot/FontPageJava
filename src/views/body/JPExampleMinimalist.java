package views.body;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPExampleMinimalist extends JPanel {

    public JPExampleMinimalist(){
        setLayout(new BorderLayout());
        setAlignmentX(CENTER_ALIGNMENT);
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {
        addJLabelExample();
    }

    private void addJLabelExample() {

        JLabel jlExampleMinimalist = new JLabel();
        jlExampleMinimalist.setHorizontalTextPosition(JLabel.CENTER);
        jlExampleMinimalist.setVerticalAlignment(JLabel.BOTTOM);
        jlExampleMinimalist.setPreferredSize(new Dimension(1366,523));
        jlExampleMinimalist.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.BANNER_MINIMALIST)));
        jlExampleMinimalist.setBorder(null);
        add(jlExampleMinimalist,BorderLayout.CENTER);
    }
}
