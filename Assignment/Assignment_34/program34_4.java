/*
Accept character from user and check whether it is spacial symbol or not (!,@,#,$,%,^,&,*)
*/
import java.util.*;
class StringX
{
    boolean ChkSymbol(String str)
    {
        char ch[] = str.toCharArray();
        if(ch[0] >= '!' && ch[0] <= '*')
        {
            return true;
        }
        return false;
    }
}
public class program34_4 {
    public static void main(String A[])
    {
        boolean bRet = false;
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter character : ");
        String sobj = scanobj.nextLine();
        StringX strobj =new StringX();
        bRet = strobj.ChkSymbol(sobj);
        if(bRet == true)
            System.out.println("it is spacial Symbol");
        else
            System.out.print("It is not an Spacial Symbol");
    }
}
