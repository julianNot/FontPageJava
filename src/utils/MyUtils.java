package utils;

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
}
