package list5;
import sun.misc.*;
import java.io.*;
public class Base64 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("usage: Base64Demo text");
            System.exit(1);
        }
       public class Base64Encorder {
            String text = args[0];
           Base64 ens = new Base64();
            String encoded = ens.encode(text.getBytes());
            enc=null;
            String decoded = null;
        try
            {
                Base64 dec = new Base64();
                decoded = new String(dec.decodeBuffer(encoded));
                dec = null;
            }
        catch(
            IOException ioe)

            {
                ioe.printStackTrace();
            }
        System.out.println("Закодировано:"+encoded);
        System.out.println("Декодировано:"+decoded);

            encoded =null;
            decoded =null;
        }
    }
}
