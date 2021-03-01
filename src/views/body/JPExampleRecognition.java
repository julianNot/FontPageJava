package views.body;

import utils.MyUtils;
import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPExampleRecognition extends JPanel {

    public JPExampleRecognition() {
        setLayout(new BorderLayout());
        setAlignmentX(CENTER_ALIGNMENT);
        setBackground(Color.WHITE);
        initComponents();
    }

    private void initComponents() {
        addPageStart();
        //addCenter();
    }

    private void addPageStart() {
        JPanel jpPageStart = new JPanel();
        jpPageStart.setLayout(new BoxLayout(jpPageStart, BoxLayout.X_AXIS));
        jpPageStart.setBackground(Color.decode("#FFFFFF"));


        JButton jbHealth= new JButton();
        ImageIcon temp = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_HEALTH)).getImage());
        MyUtils.setMainElementsButton(jbHealth,temp,0,150,0,160);
        jbHealth.setText(ConstantGUI.TEXT_HEALTH);
        jbHealth.setHorizontalTextPosition( SwingConstants.CENTER );
        jbHealth.setVerticalTextPosition( SwingConstants.BOTTOM );
        jpPageStart.add(jbHealth);

        JButton jbCommunity = new JButton();
        ImageIcon tempCommunity = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_COMMUNITY)).getImage());
        MyUtils.setMainElementsButton(jbCommunity,tempCommunity,0,10,0,10);
        jbCommunity.setText(ConstantGUI.TEXT_COMMUNITY);
        jbCommunity.setHorizontalTextPosition( SwingConstants.CENTER );
        jbCommunity.setVerticalTextPosition( SwingConstants.BOTTOM );
        jpPageStart.add(jbCommunity);

        JButton jSend = new JButton();
        ImageIcon tempSend = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_SEND)).getImage());
        MyUtils.setMainElementsButton(jSend,tempSend,0,150,0,10);
        jSend.setText(ConstantGUI.TEXT_SEND);
        jSend.setHorizontalTextPosition( SwingConstants.CENTER );
        jSend.setVerticalTextPosition( SwingConstants.BOTTOM );
        jpPageStart.add(jSend);

        JButton jService = new JButton();
        ImageIcon tempService = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_SERVICE)).getImage());
        MyUtils.setMainElementsButton(jService,tempService,0,150,0,150);
        jService.setText(ConstantGUI.TEXT_SERVICE);
        jService.setHorizontalTextPosition( SwingConstants.CENTER );
        jService.setVerticalTextPosition( SwingConstants.BOTTOM );
        jpPageStart.add(jService);

        JButton jSettings = new JButton();
        ImageIcon tempSetting = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_SETTINGS)).getImage());
        MyUtils.setMainElementsButton(jSettings,tempSetting,0,30,0,130);
        jSettings.setText(ConstantGUI.TEXT_SETTING);
        jSettings.setHorizontalTextPosition( SwingConstants.CENTER );
        jSettings.setVerticalTextPosition( SwingConstants.BOTTOM );
        jpPageStart.add(jSettings);







        add(jpPageStart);
    }
}
