import java.util.Scanner;

/*
Accept charecter from user.if charecter is small then display the curresponding capital charecterand if it is capital display 
the curresponding small .in other cases display as it is
*/
class StringX
{
    void Display(String str)
    {
        char ch[] = str.toCharArray();
        if(ch[0] >= 'A' && ch[0] <= 'Z')
        {
            System.out.println((char)(ch[0]+32));
        }
        else if(ch[0] >= 'a' && ch[0] <= 'z')
        {
            System.out.println((char)(ch[0]-32));
        }
        else
        {
            System.out.println(ch[0]);
        }

    }
}
public class program34_2 {
    public static void main(String A[])
    {
        Scanner scanobj = new Scanner(System.in);
        System.out.println("Enter Charecter : ");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();
        strobj.Display(sobj);
    }
}
