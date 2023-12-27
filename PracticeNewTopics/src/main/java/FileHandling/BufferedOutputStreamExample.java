package FileHandling;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("r.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fos);
        String s = "Hello how are you";
        byte[] b = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fos.close();
        System.out.println("Success");
    }
}
