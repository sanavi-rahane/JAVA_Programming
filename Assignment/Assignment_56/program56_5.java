/*
        Write a java program to accept directory name from user 
        and display all names of files form that directory.

 */
import java.io.*;
import java.util.*;

public class program56_5 {
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Directory name ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);
        if(fobj.exists() && fobj.isDirectory())
        {
            File fArr[] = fobj.listFiles();
            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println("File Name : "+fArr[i].getName()+"\t"+"File Size : "+fArr[i].length());
            }
        }
        else
        {
            System.out.println("There is no such directory");
        }
        sobj.close();
    }   
}
