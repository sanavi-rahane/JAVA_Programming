/*
        Write a program to accept file name from user 
        and open that file in write mode and write some data at the end of file 
*/
import java.io.*;
import java.util.*;

public class program56_3 {
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter File name :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        if(fobj.exists())
        {
           
            //file open in write mode                         // append parameter in true the the file open in write mode and data is written at the end of file 
            FileOutputStream fwobj = new FileOutputStream(fobj,true);
            

            System.out.println("Enter data to write in file");
            String data = sobj.nextLine();

            byte Arr[] = data.getBytes();
            fwobj.write(Arr);
            System.out.println("Data added Succefully");
            fwobj.close();

        }
        else
        {
            System.out.println("File Not Exist");
        }
        sobj.close();
    }
}
