package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyDynamicFile {
    public static void main(String[] args) throws IOException,FileNotFoundException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source the file  name");
        String src = sc.next();

        System.out.println("Enter the name destination file");
        String dsn = sc.next(); 
        FileInputStream fis = new FileInputStream(src);

        FileOutputStream fos = new FileOutputStream(dsn);
        int data;
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }
        System.out.println("Copied successfully!!!");
        fis.close();
        fos.close();
    }
}
