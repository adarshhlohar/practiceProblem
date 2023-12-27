package FileHandling;

import java.io.*;

public class DeleteOperation {
public static void main(String[] args)
{
try
{
File f= new File("C:\\\\Users\\\\Admin\\\\IdeaProjects\\\\Learning\\\\test.txt"); //file to be delete if(f.delete()) //returns Boolean value {
System.out.println(f.getName() + " deleted"); //getting and printing the file name }

// else
// {
// System.out.println("failed"); throw new Exception("file is allready deleted");
// }
}
catch(Exception e)
{
System.out.println(e);
}
}
}