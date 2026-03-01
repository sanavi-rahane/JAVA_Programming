
/*
Write a program which accept matrix from user and display transpose of the matrix.

the Matrix of the given matrix is formed by interchanging the rows ans columns of a matrix
Input : 
3  2  5  9
4  3  2  2
8  4  1  5 
3  9  7  5

output :
3  4  8  3  
2  3  4  9
5  2  1  7
9  2  5  5

*/
package Assignment_73;
import java.util.*;
class Matrix
{
    public 
    void Transpose(int Matrix[][], int r,int c)
    {
        int i = 0, j = 0;
        for(i = 0; i < r; i++)
        {
             
            for(j = i+1; j < c; j++)
            {
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[j][i];
                Matrix[j][i] = temp;
            }
        }
       
    }
    
    
}

public class program73_1 {
    
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
        System.out.println("After Transpose: ");
        mobj.Transpose(Arr, Row, Col);
        
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

