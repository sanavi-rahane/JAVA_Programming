/*
Write a program which accept matrix from user 
and reverse the contents of each row 

Input : 
3  2  5  9
4  3  2  2
8  4  1  5 
3  9  7  5

output :
9  5  2  3
2  2  3  4 
9  1  4  8
5  7  9  3

*/
package Assignment_73;
import java.util.*;
class Matrix
{
    public 
    void ReverseRow(int Matrix[][], int r,int c)
    {
        int i = 0, j = 0,k = 0;
        for(i = 0; i < r; i++)
        {
             
            for(j = 0,k = c-1; (k > j) ; j++,k--)
            {
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[i][k];
                Matrix[i][k] = temp;
            }
        }
       
    }
    
}

public class program73_2 {
    
     public static void main(String A[])
    {
        int Row = 3;
        int Col = 3;
        int Arr[][] = new int[Row][Col];
        int i = 0, j = 0;
      
        Matrix mobj = new Matrix();
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Element :");
        for(i = 0; i < Row; i++)
        {
            for(j = 0; j < Col; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        for(i = 0; i < Row; i++)
        {
            for(j = 0; j < Col; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();

        }
        System.out.println("After Reversing Row: ");
        mobj.ReverseRow(Arr, Row, Col);
        
        for(i = 0; i < Row; i++)
        {
            for(j = 0; j < Col; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();

        }
        
        sobj.close();
    }
}

