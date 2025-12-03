/*
Accept character from user and check whether it is smallCase or not(a-z)
 */
import java.util.*;
class StringX{
    boolean ChkSmall(String str)
    {
        char ch[]=str.toCharArray();
        if((ch[0] >= 'a') && (ch[0] <= 'z'))
        {
            return true;
        }
        return false;
    }
}
public class program33_4 {
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter Charecter");

        String sobj = scanobj.nextLine();
        boolean bret = false;

        StringX  strobj = new StringX();  

        bret=strobj.ChkSmall(sobj);
        System.out.println(bret);


    }
}
