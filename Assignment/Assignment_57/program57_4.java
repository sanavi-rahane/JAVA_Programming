/*
    Write java program to accept file name form user calculate checksum of
    that file and display on screen.
*/
import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class program57_4 {
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter File name ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        if(fobj.exists())
        {
            //logic
            

        }
        else
        {
            System.out.println("File not exist");
        }
        sobj.close();
    
    }
}
