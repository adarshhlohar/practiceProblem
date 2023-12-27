package FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSDemo {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Adarsh\\Downloads\\Language\\PracticeNewTopics\\src\\main\\java\\FileHandling\\bbc.txt");
		fos.write(97);
//		fos.flush();
		System.out.println("data is saved");
		fos.close();
	}

}
