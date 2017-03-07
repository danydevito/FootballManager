import java.io.*;
import java.net.URL;
import java.util.StringTokenizer;

/**
 * Created by daniel on 2017-03-07.
 */
public class URLReader {
    public static void main(String[] args) throws Exception {
        BufferedReader list = new BufferedReader(new FileReader("url.txt"));
        String urlString;
        while ((urlString=list.readLine())!= null){
            readAndSave(new URL(urlString));
        }
        list.close();
        System.exit(0);
    }
    static void readAndSave(URL url)throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        String fname=null;
        StringTokenizer st = new StringTokenizer(url.getFile(), "/");
        System.out.println(url);
        while (st.hasMoreTokens()) fname=st.nextToken();
        if (fname==null){
            fname="index.html";
        }
        BufferedWriter out = new BufferedWriter(new FileWriter(fname));
        String s;
        while ((s=in.readLine())!=null){
            out.write(s);
            out.newLine();
        }
        in.close();
        out.close();
    }
}
