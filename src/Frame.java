import javax.swing.*;
import java.awt.*;
import java.net.MalformedURLException;

/**
 * Created by daniel on 2017-03-11.
 */
public class Frame extends JFrame {
    public Frame() throws MalformedURLException {
        super("Manager v0.1");
        JPanel panel =new MyPanel();
        add(panel);
        setPreferredSize(new Dimension(600,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }
}
