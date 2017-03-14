import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by daniel on 2017-03-11.
 */
public class Frame extends JFrame implements ActionListener {
    private JButton biuro;
    private JButton kadra;
    private JButton liga;
    private JButton trening;
    private BufferedImage image;
//    private LoginFrame listener;

    JPanel office = new Biuro();
    JPanel team = new Kadra();
    JPanel league = new Liga();
    JPanel training = new Trening();
    LoginPanel loginPanel = new LoginPanel();

        public Frame() throws MalformedURLException {
        super("Manager v0.1");
        Icon club = new ImageIcon("images/arsenal.gif");
        URL imagFile = new URL("http://www.senior.pl/Pilka-nozna-pomaga-walczyc-z-cukrzyca_img51b1170c77d31.jpg");
        try{
            image = ImageIO.read(imagFile);
        }catch (IOException e){
            System.err.println("Błąd odczytu obrazka...");
        }
        Dimension d = new Dimension(image.getWidth(),image.getHeight());
        setPreferredSize(d);
        setPreferredSize(new Dimension(600,400));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

           String  title = loginPanel.getName();

        add(emblem(title,club,Color.white,Color.red,CENTER_ALIGNMENT,TOP_ALIGNMENT));
        biuro=new JButton("BIURO"); biuro.addActionListener(this); add(biuro);
        kadra=new JButton("KADRA"); kadra.addActionListener(this); add(kadra);
        liga=new JButton("LIGA"); liga.addActionListener(this); add(liga);
        trening=new JButton("TRENING"); trening.addActionListener(this); add(trening);

        pack();
        setVisible(true);

    }

    public JLabel emblem(String title, Icon icon, Color fc, Color bc, float halign, float valign) {
        JLabel l=new JLabel(title);
        l.setFont(new Font("Dialog",Font.ITALIC, 24));
        l.setOpaque(true);
        l.setIcon(icon);
        l.setBackground(bc);
        l.setForeground(fc);
        l.setHorizontalAlignment((int)halign);
        l.setVerticalAlignment((int) valign);
        return l;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source==biuro) {remove(team);remove(training);remove(league);add(office); this.revalidate();this.repaint();}
        if (source==kadra) {remove(office);remove(training);remove(league);;add(team);this.revalidate();this.repaint();}
        if (source==trening) {remove(team);remove(office);remove(league);;add(training);this.revalidate();this.repaint();}
        if (source==liga) {remove(team);remove(training);remove(office);add(league);this.revalidate();this.repaint();}
    }
}
