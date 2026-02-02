/*
        Write java program to accept file name from user 
        and check whether thet file is regular file or not
*/
import java.io.*;
import java.util.*;

public class program57_2 {
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter File name ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        if(fobj.exists())
        {
            if(fobj.getName().endsWith(".txt") == true)
            {
                System.out.println("File is reguler File");
            }
        }
        else
        {
            System.out.println("File not exist");
        }
        sobj.close();
    
    }
}
