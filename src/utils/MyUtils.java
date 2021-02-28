package utils;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class MyUtils {

    public static void setFooterButtonsValues(JButton buttonToChange) {

        buttonToChange.setMaximumSize(new Dimension(169,52));
        buttonToChange.setFont(new Font("Arial", Font.BOLD, 15));
        buttonToChange.setForeground(Color.BLACK);
        buttonToChange.setBackground(null);
        buttonToChange.setBorder(null);
    }

    public static void setMainElementsButton(JButton jButton, ImageIcon imageIcon, int top, int left, int bottom, int right){
        jButton.setBackground(null);
        jButton.setIcon(imageIcon);
        jButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButton.setBorder(null);
        jButton.setBorder(BorderFactory.createEmptyBorder(top,left,bottom,right));
    }
}
