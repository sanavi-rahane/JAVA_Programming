/*
        write a java program to accept directoey name from user
        and write names of all files from that directory into newly created file named as "DirectoryFilelist.txt"        
*/
import java.io.*;
import java.util.*;

public class program58_2 {
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        int i = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Folder name ");
        String FileName = sobj.nextLine();


        File fobj = new File(FileName);

        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Enter File name ");
            String PackFileName = sobj.nextLine();
            File Pfobj = new File(PackFileName);
            if(Pfobj.exists())
            {
                System.out.println("File allready exist");
            }   
            else
            {
                Pfobj.createNewFile();
                FileOutputStream fwobj = new FileOutputStream(Pfobj);

                File Arr[] = fobj.listFiles();
                for(i = 0; i < Arr.length; i++)
                {
                        byte Buffer[] = new byte[100];
                        Buffer = Arr[i].getName().getBytes();
                        //padding

                      //  fwobj.write(Buffer,0, iRet);
                        
                } 
            }
 
        }
        else
        {
            System.out.println("Folder not exist");
        }
        sobj.close();
    
    }
}


