package views.body;

import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JDExampleDrive extends JDialog {

    private JPanel jPanelDialogContainer;
    
    public JDExampleDrive(){
        setSize(588, 263);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setTitle("EJEMPLO VENTANA EMERGENTE DRIVE");
        setVisible(true);
        initComponents();
    }

    private void initComponents() {

        jPanelDialogContainer = new JPanel();
        jPanelDialogContainer.setLayout(new BorderLayout());
        addTitleWindow();
        add(jPanelDialogContainer, BorderLayout.CENTER);



    }

    private void addTitleWindow() {

        JPanel jpTitle = new JPanel();
        jpTitle.setLayout(new FlowLayout());
        jpTitle.setPreferredSize(new Dimension(588, 75));
        jpTitle.setBackground(Color.BLACK);

        JLabel jlTitle = new JLabel("Subiendo 1 elemento");
        jlTitle.setForeground(Color.white);
        jlTitle.setBorder(BorderFactory.createEmptyBorder(20,0,0,220));
        jlTitle.setHorizontalTextPosition(JLabel.LEFT);
        jlTitle.setFont(new Font("Arial", Font.PLAIN,20));

        JButton jbDownArrow = new JButton();
        jbDownArrow.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.FLECHA_ABAJO)).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH)));
        jbDownArrow.setBackground(null);
        jbDownArrow.setBorder(BorderFactory.createEmptyBorder(20,0,0,40));

        JButton jbClose = new JButton();
        jbClose.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.EQUIS_DRIVE)).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH)));
        jbClose.setBackground(null);
        jbClose.setBorder(BorderFactory.createEmptyBorder(20,20,0,0));

        jpTitle.add(jlTitle);
        jpTitle.add(jbDownArrow);
        jpTitle.add(jbClose);
        jPanelDialogContainer.add(jpTitle, BorderLayout.PAGE_START);

        //Panel mensaje del medio y boton cancelar
        JPanel jpMessageMiddle = new JPanel();
        jpMessageMiddle.setLayout(new BoxLayout(jpMessageMiddle, BoxLayout.X_AXIS));
        jpMessageMiddle.setPreferredSize(new Dimension(588, 38));
        jpMessageMiddle.setBackground(Color.decode("#f2f2f2"));

        JLabel jlMessageMiddle = new JLabel("Queda menos de un minuto");
        jlMessageMiddle.setForeground(Color.BLACK);
        jlMessageMiddle.setBorder(BorderFactory.createEmptyBorder(5,30,0,30));
        jlMessageMiddle.setFont(new Font("Arial", Font.PLAIN,18));

        JButton jbCancel = new JButton("CANCELAR");
        jbCancel.setFont(new Font("Arial", Font.PLAIN,18));
        jbCancel.setBackground(null);
        jbCancel.setForeground(Color.decode("#0590fa"));
        jbCancel.setBorder(BorderFactory.createEmptyBorder(5,160,0,0));

        //Panel archivo y carga
        JPanel jpLoading = new JPanel();
        jpLoading.setLayout(new BoxLayout(jpLoading, BoxLayout.X_AXIS));
        jpLoading.setPreferredSize(new Dimension(588, 95));
        jpLoading.setBackground(Color.white);

        JLabel jlImageRed = new JLabel();
        jlImageRed.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.IMAGEN_DRIVE)).getImage().getScaledInstance(35,35,Image.SCALE_SMOOTH)));
        jlImageRed.setBorder(BorderFactory.createEmptyBorder(5,38,0,15));
        jpLoading.add(jlImageRed);

        JLabel jlMessageImg = new JLabel("3.png");
        jlMessageImg.setFont(new Font("Arial", Font.PLAIN,18));
        jlMessageImg.setBorder(BorderFactory.createEmptyBorder(0,0,0,190));
        jlMessageImg.setForeground(Color.BLACK);
        jpLoading.add(jlMessageImg);

        JLabel jlCirculoCarga = new JLabel();
        jlCirculoCarga.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.CIRCLE_LOADING)).getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH)));
        jlCirculoCarga.setBorder(BorderFactory.createEmptyBorder(5,170,0,10));
        jpLoading.add(jlCirculoCarga);






        jpMessageMiddle.add(jlMessageMiddle);
        jpMessageMiddle.add(jbCancel);
        jPanelDialogContainer.add(jpMessageMiddle,BorderLayout.CENTER);
        jPanelDialogContainer.add(jpLoading,BorderLayout.PAGE_END);




    }

}
