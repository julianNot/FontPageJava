package views.body;

import utils.MyUtils;
import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPExampleProfile extends JPanel {

    public JPExampleProfile() {
        setLayout(new BorderLayout());
        setAlignmentX(LEFT_ALIGNMENT);
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {
        addPageStart();
        addCenter();
        //addPageEnd();
    }

    /**
     * Metodo encargado de agregar el encabezado
     */
    private void addPageStart() {
        JPanel jpPageStart = new JPanel();
        jpPageStart.setLayout(new BoxLayout(jpPageStart, BoxLayout.X_AXIS));
        jpPageStart.setBackground(Color.decode("#FFFFFF"));


        JButton jbIconProfile = new JButton();
        ImageIcon temp = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_PROFILE)).getImage());
        MyUtils.setMainElementsButton(jbIconProfile,temp,0,180,0,150);
        jpPageStart.add(jbIconProfile);

        JButton jbWeCreates = new JButton(ConstantGUI.TEXT_BUTTON_WE_CREATE);
        MyUtils.setFooterButtonsValues(jbWeCreates);
        jpPageStart.add(jbWeCreates);

        JButton jbWeEssence = new JButton(ConstantGUI.TEXT_BUTTON_ESSENCE);
        MyUtils.setFooterButtonsValues(jbWeEssence);
        jpPageStart.add(jbWeEssence);

        JButton jbpPeople = new JButton(ConstantGUI.TEXT_BUTTON_PEOPLES);
        MyUtils.setFooterButtonsValues(jbpPeople);
        jpPageStart.add(jbpPeople);

        JButton jbWeBlog = new JButton(ConstantGUI.TEXT_BUTTON_BLOG);
        MyUtils.setFooterButtonsValues(jbWeBlog);
        jpPageStart.add(jbWeBlog);

        JButton jbBurger = new JButton();
        ImageIcon tempBurger = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_BURGER)).getImage());
        MyUtils.setMainElementsButton(jbBurger,tempBurger,0,30,0,100);
        jpPageStart.add(jbBurger);

        add(jpPageStart);
    }

    private void addCenter() {
        
    }

}
