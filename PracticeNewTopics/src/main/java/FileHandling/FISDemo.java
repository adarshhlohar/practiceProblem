package FileHandling;
import java.io.*;

public class FISDemo {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Adarsh\\Downloads\\Language\\PracticeNewTopics\\src\\main\\java\\FileHandling\\abc.txt");
//		int  data = fis.read();
//		int  data1 = fis.read();
//		int  data2 = fis.read();
//		System.out.println("data " + data + " data " + (char)data);
//		System.out.println("data1 " + data1 + " data1 " + (char)data1 );
//		System.out.println("data " + data2 + " data2 " + (char)data2);
		
		int data;
		while((data = fis.read()) != -1 ) {
			System.out.println("data " + data + "\t" + (char)data );
		}
		fis.close();
	}
}
