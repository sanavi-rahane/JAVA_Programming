/*
Accept division of student from user and depends on division display exam timing .
There are 4 division in school  as A,B,C,D .Exam of division A at 7 AM,
B At 8.30 Am,c At 9.30 Am, D at 10.30 Am
*/
import java.util.*;
class StringX
{
     void DisplaySchedule(String str)
     {
        char ch[] = str.toCharArray();
        if(ch[0] == 'A' || ch[0] == 'a')
        {
            System.out.println("Your exam at 7 AM");
        }
        else if(ch[0] == 'B' || ch[0] == 'b')
        {
            System.out.println("Your exam at 8.30 AM");
        }
        else if(ch[0] == 'C' || ch[0] == 'c')
        {
            System.out.println("Your exam at 9.20 AM");
        }
        else if(ch[0] == 'D' || ch[0] == 'd')
        {
            System.out.println("Your exam at 10.30 AM");
        }
     }
}
public class program33_5 {
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter Your Division :");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.DisplaySchedule(sobj);
        
    }
}
