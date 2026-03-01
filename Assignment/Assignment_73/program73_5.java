/*
Write a program which accept matrix and check whether the matrix
is Sparse matrix or not.

Sparse matrix is a matrix with the majority of its elements equal to zero

Input :
1  0  3  0
0  6  0  0
0  0  1  0 
9  0  0  9
Output :
 true
*/
package Assignment_73;
import java.util.*;
class Matrix
{
    public 
    boolean CheckSparseMatrix(int Matrix[][], int r,int c)
    {
        int i = 0, j = 0;
        
        int zeroCount = 0;
        int nonZeroCount = 0;
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                if(Matrix[i][j] == 0) zeroCount++;
                else nonZeroCount++;
            }
        }

       return zeroCount > nonZeroCount;
    } 
}

public class program73_5 {
    
     public static void main(String A[])
    {
        int Row = 4;
        int Col = 4;
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
        
    
        System.out.println("\t"+(mobj.CheckSparseMatrix(Arr, Row, Col) ? "It is Sparse matrix": "Not Sparse Matrix"));
        
        sobj.close();
    }
}


