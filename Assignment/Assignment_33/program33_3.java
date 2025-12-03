/*
Accept charecter from user and check whether it is digit or not (0-9)
 */
import java.util.*;
class StringX
{
    boolean ChkDigit(String str)
    {
        char ch[] = str.toCharArray();
        if(ch[0] >= '0' && ch[0] <= '9')
        {
            return true;
        }
        return false;

    }
}
public class program33_3 {
    public static void main(String A[]) 
    {
        Scanner scanobj =new Scanner(System.in);
        
        System.out.println("Enter charecter : ");
        String sobj = scanobj.nextLine();
        boolean bRet = false;

        StringX strobj = new StringX();
        bRet = strobj.ChkDigit(sobj);

        System.out.println(bRet);

        
    }
}
