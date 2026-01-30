/*
        Write a program to accept the name of a file form user and open that file 
        and display the ocntent on a screen
 */
import java.io.*;
import java.util.*;
public class program56_2 {
    public static void main(String[] args) throws Exception
    {
        int iRet = 0;
        byte Buffer[] = new byte[100];

        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter File Name : ");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);
        String str = null;
        if(fobj.exists())
        {
            FileInputStream fiobj = new FileInputStream(fobj);

            while ((iRet = fiobj.read(Buffer)) != -1) 
            {
                str = new String(Buffer);
                // System.out.println(new String(Buffer));
                System.out.println(str);
                str = null;
            }
            fiobj.close();  
            
        }
        else
        {
            System.out.println("File not Exist ");
        }
        sobj.close();
    }
}
