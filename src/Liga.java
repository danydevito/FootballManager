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
public class Liga extends JPanel implements ActionListener {
    private JButton Strzelcy;
    private JButton Kalendarz;
    private BufferedImage image;

    public Liga() throws MalformedURLException {
        super();
        URL imagFile = new URL("http://gminakonopiska.pl/wp-content/uploads/2015/09/Klasa-Okr%C4%99gowa-gr.-I-Wyniki-aktualna-tabela-pi%C5%82ka-no%C5%BCna-astar.czest_.pl-2015-09-21-09-02-54.png");
        try{
            image = ImageIO.read(imagFile);
        }catch (IOException e){
            System.err.println("Błąd odczytu obrazka...");
        }
        Dimension d = new Dimension(image.getWidth(),image.getHeight());
        setPreferredSize(d);
        Strzelcy =new JButton("STRZELCY"); Strzelcy.addActionListener(this); add(Strzelcy);
        Kalendarz =new JButton("KALENDARZ"); Kalendarz.addActionListener(this); add(Kalendarz);

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
