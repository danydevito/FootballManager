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
public class Trening extends JPanel implements ActionListener {
    private JButton sztab;
    private JButton ustawienia;
    private BufferedImage image;

    public Trening() throws MalformedURLException {
        super();
        URL imagFile = new URL("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRYw_vo8obPaElX7MHHItJKq8_mRk-4NG9ZG5cFk6BObCWcnDm3");
        try{
            image = ImageIO.read(imagFile);
        }catch (IOException e){
            System.err.println("Błąd odczytu obrazka...");
        }
        Dimension d = new Dimension(image.getWidth(),image.getHeight());
        setPreferredSize(d);
        sztab =new JButton("SZTAB"); sztab.addActionListener(this); add(sztab);
        ustawienia =new JButton("USTAWIENIA"); ustawienia.addActionListener(this); add(ustawienia);

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
