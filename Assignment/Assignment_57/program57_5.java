/*
      Write a java program to accept directory name form user
      and display all names of files from that directory and size of each file on screen.  
*/
import java.io.*;
import java.util.*;
public class program57_5 {
    public static void main(String A[])
    {
      int i = 0;
      String DirName = null;
      File Arr[] = null;

      System.out.println("Enter Directory name");
      Scanner sobj = new Scanner(System.in);
      DirName = sobj.nextLine();
      File fobj = new File(DirName);
      
      if(fobj.exists() && fobj.isDirectory())
      {
            Arr = fobj.listFiles();
            for(i = 0; i < Arr.length; i++)
            {
                  System.out.println("File Name : "+Arr[i].getName()+"\t"+"File Size : "+Arr[i].length());
            }
      }
      else
      {
            System.out.println("Direcotry not exits");
      }
      sobj.close();
    }
}
