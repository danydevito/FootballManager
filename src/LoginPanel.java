import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;

/**
 * Created by daniel on 2017-03-11.
 */
public class LoginPanel extends JPanel implements ActionListener{
    private JTextField nameField;
    private JButton loginButton;
//    private LoginFrame listener;
    public String name;

    public LoginPanel(){
        super();
//        setLayout(new CardLayout(10,20));
//        this.listener=listener;
//        this.listener.setLoginPanel(this);
        JPanel inputPanel = new JPanel();
        add(inputPanel);
        inputPanel.setLayout(new FlowLayout());
        nameField=new JTextField(20);
        inputPanel.add(nameField);
        nameField.setLocation(100,150);
        String[] kluby={"Arsenal Londyn","AS Monaco","Real Madryt","Benfica Lizbona","Juventus Turyn","Bayern Monachium","Wisła Kraków","-- nowy --"};
        String ans =(String) JOptionPane.showInputDialog(null,null,"Wybierz klub z listy",JOptionPane.QUESTION_MESSAGE,new ImageIcon("images/pilka.gif"),kluby,kluby[0]);

        if (ans.equals("-- nowy --")){
            inputPanel.add(new JLabel("Aby utworzyć klub wpisz jego nazwę w powyższym okienku i zatwierdź klikając OK"));
        }else {nameField.setText(ans);}

        loginButton=new JButton("OK");
        inputPanel.add(loginButton);
        loginButton.addActionListener(this);
        name=nameField.getText();

        setName(name);
        getName();
        System.out.println(name);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source==loginButton){
            EventQueue.invokeLater(new Runnable() {
                @Override
                public void run() {
                    try {
                        new Frame();
                    } catch (MalformedURLException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        }
    }

}
