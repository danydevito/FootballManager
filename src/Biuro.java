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
public class Biuro extends JPanel implements ActionListener {
    private JButton finanse;
    private JButton transfery;
    private BufferedImage image;

    public Biuro() throws MalformedURLException {
        super();
        URL imagFile = new URL("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcQ-cUpK79utlURnGbj-a6V5Fjg7OD8Wm7taJgiRwYsf-HIB3xCEuA");
        try{
            image = ImageIO.read(imagFile);
        }catch (IOException e){
            System.err.println("Błąd odczytu obrazka...");
        }
        Dimension d = new Dimension(image.getWidth(),image.getHeight());
        setPreferredSize(d);
        finanse=new JButton("FINANSE"); finanse.addActionListener(this); add(finanse);
        transfery=new JButton("TRANSFERY"); transfery.addActionListener(this); add(transfery);

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
