/*
Accept character from user and display its ASCII value in decimal,octal,and hexadecimal fromat
 */
import java.util.*;
class StringX
{
    void Display(String str)
    {
        char ch[] = str.toCharArray();
        int decimal = (int)(ch[0]);
        int rem = 0;
        int Octal[]  ;
        System.out.println("ASCII value : "+decimal);

        System.out.println("Octal Value : ");
        int iCnt = 0;
        while (decimal != 0) {
            rem = decimal % 8;
            decimal = decimal / 8;
            Octal[iCnt] = rem;
            iCnt++;
        }
        for(iCnt = Octal.length;iCnt >= 0;iCnt--)
        {
            System.out.println(Octal[iCnt]);
        }
        

    }
}
public class program34_5 {
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter character : ");
        String sobj = scanobj.nextLine();
        StringX strobj = new StringX();
        strobj.Display(sobj);
    }
}
