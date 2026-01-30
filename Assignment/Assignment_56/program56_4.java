/*
        Write a program to accept file name form user 
        and create new file of that name if it is not existing
*/
import java.util.*;
import java.io.*;

public class program56_4 {
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter File name to create a file :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        if(fobj.exists())
        {
            System.out.println("File allready exists");
        }
        else
        {
            fobj.createNewFile();
            System.out.println("File Created Succesfully");
        }
        sobj.close();
    }
}
