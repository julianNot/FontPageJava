package views.body;

import utils.MyUtils;
import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JPExampleIberia extends JPanel {

    public JPExampleIberia() {
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
        jpPageStart.setBackground(Color.decode("#c7332d"));
        jpPageStart.setPreferredSize(new Dimension(1349,115));

        JButton jbIconIberiaLogo = new JButton();
        jbIconIberiaLogo.setBackground(null);
        jbIconIberiaLogo.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_IBERIA)).getImage().getScaledInstance(180,40,Image.SCALE_SMOOTH)));
        jbIconIberiaLogo.setAlignmentX(Component.CENTER_ALIGNMENT);
        jbIconIberiaLogo.setBorder(null);
        jbIconIberiaLogo.setBorder(BorderFactory.createEmptyBorder(0,115,0,400));
        jpPageStart.add(jbIconIberiaLogo);

        JButton jbWorld = new JButton();
        ImageIcon tempWorld = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.BUTTON_WORLD)).getImage());
        MyUtils.setTextAndIconButtons(jbWorld, "Colombia-ES", tempWorld, 0,0,0,0);
        jpPageStart.add(jbWorld);

        JButton jbGroup = new JButton();
        ImageIcon tempGroup = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.BUTTON_PERSONAS)).getImage());
        MyUtils.setTextAndIconButtons(jbGroup, "Empresas", tempGroup, 0,0,0,0);
        jpPageStart.add(jbGroup);

        JButton jbHelp = new JButton();
        ImageIcon tempHelp = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.BUTTON_HELP)).getImage());
        MyUtils.setTextAndIconButtons(jbHelp, "Ayuda", tempHelp, 0,0,0,0);
        jpPageStart.add(jbHelp);

        JButton jbUser = new JButton();
        ImageIcon tempUser = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.BUTTON_USER_IBERIA)).getImage());
        MyUtils.setTextAndIconButtons(jbUser, "Acceso / Registro", tempUser, 0,0,0,0);
        jpPageStart.add(jbUser);

        add(jpPageStart,BorderLayout.PAGE_START);

    }

    private void addCenter() {
        JPanel jPanelBodyIberia = new JPanel(new BorderLayout());

        JPanel jpHelpDoc = new JPanel(new GridLayout(1,3));




    }
}
