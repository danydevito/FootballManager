import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

/**
 * Created by daniel on 2017-03-11.
 */
public class LoginFrame extends JFrame implements ActionListener {
    private JFrame frame;
//    private LoginPanel loginPanel;


//    public void setLoginPanel(LoginPanel loginPanel){this.loginPanel=loginPanel;}
    public LoginFrame(){
        super("Logowanie");
        JPanel loginPanel = new LoginPanel();
        add(loginPanel);
        setPreferredSize(new Dimension(600,400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);}

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
