package views.body;

import utils.MyUtils;
import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPExampleLego extends JPanel {

    public JPExampleLego(){
        setLayout(new BorderLayout());
        setAlignmentX(LEFT_ALIGNMENT);
        setBackground(Color.WHITE);
        //setPreferredSize(new Dimension(1349,91));
        initComponents();
    }

    private void initComponents() {
        addPageStart();
        addCenter();
        addPageEnd();
    }

    private void addPageStart() {
        JPanel jpPageStart = new JPanel();
        jpPageStart.setLayout(new BoxLayout(jpPageStart, BoxLayout.X_AXIS));
        jpPageStart.setBackground(Color.decode("#FFFF00"));
        //setPreferredSize(new Dimension(1349,91));

        JLabel jbIconLego = new JLabel();
        jbIconLego.setBackground(null);
        jbIconLego.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_LEGO)).getImage().getScaledInstance(70,70,Image.SCALE_SMOOTH)));
        jbIconLego.setAlignmentX(Component.CENTER_ALIGNMENT);
        jbIconLego.setBorder(null);
        jbIconLego.setBorder(BorderFactory.createEmptyBorder(0,40,0,100));
        jpPageStart.add(jbIconLego);
        add(jpPageStart);

        JButton jbTopics = new JButton(ConstantGUI.TEXT_BUTTON_TEMAS);
        MyUtils.setFooterButtonsValues(jbTopics);
        jpPageStart.add(jbTopics);

        JButton jbInterest = new JButton(ConstantGUI.TEXT_BUTTON_INTERES);
        MyUtils.setFooterButtonsValues(jbInterest);
        jpPageStart.add(jbInterest);

        JButton jbExclusive = new JButton(ConstantGUI.TEXT_BUTTON_EXCLUSIVO);
        MyUtils.setFooterButtonsValues(jbExclusive);
        jpPageStart.add(jbExclusive);

        JButton jbNuevos = new JButton(ConstantGUI.TEXT_BUTTON_NUEVO);
        MyUtils.setFooterButtonsValues(jbNuevos);
        jpPageStart.add(jbNuevos);

        JButton jbAdults = new JButton(ConstantGUI.TEXT_ADULTOS);
        MyUtils.setFooterButtonsValues(jbAdults);
        jpPageStart.add(jbAdults);

        JButton jbOffers = new JButton(ConstantGUI.TEXT_OFERTAS);
        MyUtils.setFooterButtonsValues(jbOffers);
        jpPageStart.add(jbOffers);

        JButton jbDisney = new JButton(ConstantGUI.TEXT_DISNEY);
        MyUtils.setFooterButtonsValues(jbDisney);
        jpPageStart.add(jbDisney);

        JButton buttonLupa = new JButton();
        buttonLupa.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.JBUTTON_LUPA)).getImage().getScaledInstance(22,22,Image.SCALE_SMOOTH)));
        buttonLupa.setBackground(null);
        buttonLupa.setBorder(null);
        buttonLupa.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonLupa.setBorder(BorderFactory.createEmptyBorder(0,150,0,20));
        jpPageStart.add(buttonLupa);

        JButton buttonUser = new JButton();
        buttonUser.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.JBUTTON_USER)).getImage().getScaledInstance(22,22,Image.SCALE_SMOOTH)));
        buttonUser.setBackground(null);
        buttonUser.setBorder(null);
        buttonUser.setBorder(BorderFactory.createEmptyBorder(0,0,0,20));
        buttonUser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jpPageStart.add(buttonUser);

        JButton buttonShopingBall = new JButton();
        buttonShopingBall.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.JBUTTON_SHOPPING_BALL)).getImage().getScaledInstance(22,22,Image.SCALE_SMOOTH)));
        buttonShopingBall.setBackground(null);
        buttonShopingBall.setBorder(null);
        buttonShopingBall.setCursor(new Cursor(Cursor.HAND_CURSOR));
        buttonShopingBall.setBorder(BorderFactory.createEmptyBorder(0,0,0,20));
        jpPageStart.add(buttonShopingBall);


    }

    private void addPageEnd() {
        JPanel jpPageEnd = new JPanel();
    }

    private void addCenter() {
    }


}
