/*
Accept charecter from user. If it is capital then display all the characters from the input characters till Z.
if input character is small then print all the characters in reverce order till a In other Cases return directely
*/
import java.util.*;
class StringX
{
    void Display(String str)
    {
        int iCnt = 0;
        char ch[] = str.toCharArray();
        if(ch[0] >= 'A' && ch[0] <= 'Z')
        {
            int i =(int)(ch[0]); //65

            while (i <= (int)('Z')) {
                System.out.print(ch[0]+"\t");
                i++;    //66
                ch[0]=(char)(i);  
            }

        }
        else if(ch[0] >= 'a' && ch[0] <= 'z')
        {
            int i =(int)(ch[0]); 

            while (i >= (int)('a')) {
                System.out.print(ch[0]+"\t");
                i--;    
                ch[0]=(char)(i);  
            }
        }
    }
}
public class program34_3 {
    public static void main(String A[])
    {
        String sobj = null;
        System.out.println("Enter character : ");
        Scanner scanobj = new Scanner(System.in);
        sobj =scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.Display(sobj);
    }
}
