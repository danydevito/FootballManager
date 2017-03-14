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
public class Kadra extends JPanel implements ActionListener {
    private JButton kontrakty;
    private JButton stats;
    private BufferedImage image;

    public Kadra() throws MalformedURLException {
        super();
        URL imagFile = new URL("http://legia.com/uploads/files/3-beznazwy-21408040603.jpg");
        try{
            image = ImageIO.read(imagFile);
        }catch (IOException e){
            System.err.println("Błąd odczytu obrazka...");
        }
        Dimension d = new Dimension(image.getWidth(),image.getHeight());
        setPreferredSize(d);
        kontrakty=new JButton("KONTRAKTY"); kontrakty.addActionListener(this); add(kontrakty);
        stats=new JButton("STATYSTYKI"); stats.addActionListener(this); add(stats);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(image,50,50,this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
