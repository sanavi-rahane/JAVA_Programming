/*
Accept character from user and check whether it is capital or not(A-Z)
 */
import java.util.*;
class StringX{
    boolean ChkCapital(String str)
    {
        char ch[]=str.toCharArray();
        if((ch[0] >= 'A') && (ch[0] <= 'Z'))
        {
            return true;
        }
        return false;
    }
}
public class program33_2 {
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter Charecter");
        String sobj = scanobj.nextLine();
        boolean bret = false;
        StringX  strobj = new StringX();  
        bret=strobj.ChkCapital(sobj);
        System.out.println(bret);


    }
}
