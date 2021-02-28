package views.header;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPModelButtons extends JButton {

    public JPModelButtons(String text, String Icon) {
        setText(text);
        setForeground(Color.BLACK);
        setMaximumSize(new Dimension(460, 80));
        setBackground(null);
        setIcon(new ImageIcon(new ImageIcon(getClass().getResource(Icon)).getImage().getScaledInstance(40, 40, Image.SCALE_SMOOTH)));
        setAlignmentX(Component.LEFT_ALIGNMENT);
        setBorder(null);
        setFont(new Font("Arial", Font.PLAIN,18));
    }
}
