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
public class MyPanel extends JPanel implements ActionListener{
    private JButton biuro;
    private JButton kadra;
    private JButton liga;
    private JButton trening;
    private BufferedImage image;

    public MyPanel() throws MalformedURLException{
        super();
        URL imagFile = new URL("http://www.senior.pl/Pilka-nozna-pomaga-walczyc-z-cukrzyca_img51b1170c77d31.jpg");
        try{
            image = ImageIO.read(imagFile);
        }catch (IOException e){
            System.err.println("Błąd odczytu obrazka...");
        }
        Dimension d = new Dimension(image.getWidth(),image.getHeight());
        setPreferredSize(d);

        biuro=new JButton("BIURO"); biuro.addActionListener(this); add(biuro);
        kadra=new JButton("KADRA"); kadra.addActionListener(this); add(kadra);
        liga=new JButton("LIGA"); liga.addActionListener(this); add(liga);
        trening=new JButton("TRENING"); trening.addActionListener(this); add(trening);

    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(image,300,100,this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
