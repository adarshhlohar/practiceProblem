package FileHandling;

import java.io.*;

public class CopyFile {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Adarsh\\Downloads\\Language\\PracticeNewTopics\\src\\main\\java\\FileHandling\\cat.txt");
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\Adarsh\\Downloads\\Language\\PracticeNewTopics\\src\\main\\java\\FileHandling\\mat.txt");
		int data;
		while ((data = fis.read()) != -1) {
			fos.write(data);
		}
		System.out.println("copied successfully!!!");
		fis.close();
		fos.close();
	}
}