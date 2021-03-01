package views.body;

import utils.MyUtils;
import views.ConstantGUI;

import javax.swing.*;
import java.awt.*;

public class JDPasswordForm extends JDialog {

    private JPanel jPanelDialogContainer;

    public JDPasswordForm(){
        setSize(700, 263);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setBackground(Color.white);
        setTitle("EJEMPLO FORMULARIO CONTRASEÑA");
        setVisible(true);
        initComponents();
    }

    private void initComponents() {
        jPanelDialogContainer = new JPanel();
        jPanelDialogContainer.setLayout(new BorderLayout());
        initComponentsDialog();
        add(jPanelDialogContainer, BorderLayout.CENTER);
    }

    private void initComponentsDialog() {
        addComponentsNewPassword();
        addComponentsRepitPassword();
        addButton();
    }

    private void addComponentsNewPassword() {
        JPanel jpNewPassword = new JPanel();
        jpNewPassword.setLayout(new BoxLayout(jpNewPassword,BoxLayout.X_AXIS));

        JLabel jlabelNewPassword = new JLabel("Nueva contraseña: * ");
        jlabelNewPassword.setFont(new Font("Arial", Font.BOLD, 15));
        jlabelNewPassword.setForeground(Color.BLACK);
        jlabelNewPassword.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        jpNewPassword.add(jlabelNewPassword);

        JPasswordField jpassword = new JPasswordField();
        jpassword.setMaximumSize( new Dimension( 240, 34 ) );
        jpNewPassword.add(jpassword);

        JLabel warning = new JLabel();
        warning.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.JLABEL_WARNING)).getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH)));
        warning.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        jpNewPassword.add(warning);

        JLabel warningMessage = new JLabel("Introduce una contraseña segura");
        warningMessage.setFont(new Font("Arial", Font.PLAIN,17));
        jpNewPassword.add(warningMessage);

        jPanelDialogContainer.add(jpNewPassword,BorderLayout.PAGE_START);
    }

    private void addButton() {
        JPanel jpButtonAndMessage = new JPanel();
        jpButtonAndMessage.setLayout(new BoxLayout(jpButtonAndMessage, BoxLayout.Y_AXIS));

        JLabel jlabelMessageDown = new JLabel("* Campo obligatorio");
        jlabelMessageDown.setFont(new Font("Arial", Font.PLAIN, 15));
        jlabelMessageDown.setForeground(Color.BLACK);
        jlabelMessageDown.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        jpButtonAndMessage.add(jlabelMessageDown);

        JButton jbToReset = new JButton("RESETEAR CONTRASEÑA");
        jbToReset.setForeground(Color.white);
        jbToReset.setBackground(Color.BLACK);
        jbToReset.setFont(new Font("Arial",Font.BOLD, 18));
        jpButtonAndMessage.add(jbToReset);

        jPanelDialogContainer.add(jpButtonAndMessage,BorderLayout.PAGE_END);

    }

    private void addComponentsRepitPassword() {
        JPanel jpRepitPassword = new JPanel();
        jpRepitPassword.setLayout(new BoxLayout(jpRepitPassword, BoxLayout.X_AXIS));

        JLabel jlabelRepitPassword = new JLabel("Repetir contraseña: * ");
        jlabelRepitPassword.setFont(new Font("Arial", Font.BOLD, 15));
        jlabelRepitPassword.setForeground(Color.BLACK);
        jlabelRepitPassword.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 0));
        jpRepitPassword.add(jlabelRepitPassword);

        JPasswordField jpassword = new JPasswordField();
        jpassword.setMaximumSize( new Dimension( 240, 34 ) );
        jpassword.setAlignmentX(Component.CENTER_ALIGNMENT);
        jpRepitPassword.add(jpassword);

        JLabel warning = new JLabel();
        ImageIcon tempWarning = new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.JLABEL_WARNING)).getImage());
        MyUtils.setTextAndJLabel(warning, ConstantGUI.MESSAGE_REPIT_PASSWORD, tempWarning);
        jpRepitPassword.add(warning);

        jPanelDialogContainer.add(jpRepitPassword,BorderLayout.CENTER);
    }
}
