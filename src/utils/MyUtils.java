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

    public static void setTextAndIconButtons(JButton button, String text, ImageIcon imageIcon, int top, int left, int bottom, int right){
        button.setText(text);
        button.setForeground(Color.WHITE);
        button.setMaximumSize(new Dimension(380,30));
        button.setBackground(null);
        button.setIcon(imageIcon);
        button.setAlignmentX(Component.LEFT_ALIGNMENT);
        button.setBorder(null);
    }
    
    public static void setTextAndJLabel(JLabel jlabel,String text, ImageIcon logo){
        jlabel.setText(text);
        jlabel.setFont(new Font("Arial", Font.PLAIN, 15));
        jlabel.setForeground(Color.BLACK);
        //jlabel.setMaximumSize(new Dimension(380,30));
        jlabel.setBackground(null);
        jlabel.setIcon(logo);
        //jlabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        jlabel.setBorder(null);
    }
}
