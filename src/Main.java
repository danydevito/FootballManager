import java.awt.*;
import java.net.MalformedURLException;

/**
 * Created by daniel on 2017-03-10.
 */
public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new Frame();
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
