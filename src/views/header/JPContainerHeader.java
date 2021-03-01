package views.header;

import presenter.Presenter;

import javax.swing.*;
import java.awt.*;

public class JPContainerHeader extends JPanel {

    private JPButtonsHeaderUP jpbHeaderUp;
    private JPButtonsHeaderDown jpbHeaderDown;
    private Presenter myPresenter;

    public JPContainerHeader(Presenter presenter){
        myPresenter = presenter;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.white);
        initComponents();
    }

    private void initComponents() {
        jpbHeaderUp = new JPButtonsHeaderUP(myPresenter);
        this.add(jpbHeaderUp);

        jpbHeaderDown = new JPButtonsHeaderDown(myPresenter);
        this.add(jpbHeaderDown);
    }


}
