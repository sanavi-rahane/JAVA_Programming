/*
     Write java program to accept directory name from user
     and create that directory   
*/
import java.io.*;
import java.util.*;

public class program57_3 {
    public static void main(String A[]) throws Exception
    {
          Scanner sobj = new Scanner(System.in);
          System.out.println("Enter Directory name to create");
          String DirName = sobj.nextLine();
         
          File fobj = new File(DirName);
          if(fobj.exists())
          {
               fobj.createNewFile();
               System.out.println("Directory created Succesfully");
          }
          else
          {
              
               System.out.println("Directory allready exist");
          }
          sobj.close();
    }
}
