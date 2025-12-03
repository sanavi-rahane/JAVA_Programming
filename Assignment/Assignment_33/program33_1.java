/*
Accept character user and check whether it is alphabet or not(A-Z a-z)
INPUT : F
OUTPUT :true

INPUT : &
OUTPUT : false

 */

// package Assignment_33;

import java.util.*;
class StringX
{
    boolean CheckChar(String str)
    {
        char ch[] =str.toCharArray();
        if((ch[0] >= 'A' && ch[0] <= 'Z') || (ch[0] >= 'a' && ch[0] <= 'z'))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class program33_1 {

    public static void main(String A[])
    {
        String sValue = "\0";
        boolean bRet = false;
        
        System.out.println("Enter charecter");
        Scanner sobj = new Scanner(System.in);

        sValue = sobj.nextLine();

        StringX strobj = new StringX();
        bRet = strobj.CheckChar(sValue);

        System.out.println(bRet);


    } 
}
