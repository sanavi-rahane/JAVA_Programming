/* Write aprogram to take file name from user and open that file */
import java.io.*;
import java.util.*;

public class program56_1
{
    public static void main(String[] args)  throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter File name which you want to open :");
        String FileName = sobj.nextLine();

        File fobj = new File(FileName);

        if(fobj.exists())
        {
            FileReader frobj = new FileReader(fobj);
            System.out.println("File gets Succesfully open ");

            //read the content .....
            frobj.close();
        }
        else
        {
            System.out.println("File is not exist");
        }
        sobj.close();
    }
}