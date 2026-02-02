/*
        Write java program to accept directory name from user
        and display all names of files from that directory which are regular files.        
*/
import java.io.*;
import java.util.*;

public class program58_1 {
    public static void main(String A[])
    {
        int i = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter File name ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isDirectory())
        {
            File Arr[] = fobj.listFiles();
            for(i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile() == true)
                {
                        System.out.println(Arr[i].getName());
                }
            }  
        }
        else
        {
            System.out.println("File not exist");
        }
        sobj.close();
    
    }
}

