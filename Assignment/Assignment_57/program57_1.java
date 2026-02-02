/*
    Write java program to accept two file names from user and
    open first file and create new file (Second name)
    and copy the data from first file into newly created file     
*/
import java.io.*;
import java.util.*;

public class program57_1 {
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        String FileNameSrc = null;
        String FileNameDest = null;
        String Data = null;
        File fSrcobj = null;
        byte Buffer[] = new byte[1024];
        Scanner sobj = null;
        

        sobj = new Scanner(System.in);
        System.out.println("Enter Source File name ");
        FileNameSrc = sobj.nextLine();

        fSrcobj = new File(FileNameSrc);


        if(fSrcobj.exists())
        {
            FileInputStream  fiobj = new FileInputStream(fSrcobj);

            System.out.println("Enter Destination file Name ");
            FileNameDest = sobj.nextLine();

            File fDestobj = new File(FileNameDest);
            fDestobj.createNewFile();

            FileOutputStream fwobj = new FileOutputStream(fDestobj);


            while ((iRet = fiobj.read(Buffer) )!= -1) 
            {
                fwobj.write(Buffer,0,iRet);
                System.out.println(new String(Buffer));
            }
            System.out.print("File Copy Succesfully");
            fiobj.close();
            fwobj.close();
            
        }
        else
        {
            System.out.println("Source file not exists");
        }
        sobj.close();
    }
}
