package views.header;

import javax.swing.*;
import java.awt.*;

public class JPContainerHeader extends JPanel {

    private JPButtonsHeaderUP jpbHeaderUp;
    private JPButtonsHeaderDown jpbHeaderDown;

    public JPContainerHeader(){
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.white);
        initComponents();
    }

    private void initComponents() {
        jpbHeaderUp = new JPButtonsHeaderUP();
        this.add(jpbHeaderUp);

        jpbHeaderDown = new JPButtonsHeaderDown();
        this.add(jpbHeaderDown);
    }


}
