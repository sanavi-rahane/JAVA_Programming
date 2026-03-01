/*
Write a program which accept matrix and swap the contents of consecutive rows.
Input :
3  2  5  9
4  3  2  2
8  4  1  9
3  9  7  5
Output :
4  3  2  2
3  2  5  9
3  9  7  5
8  4  1  9
*/

import java.util.*;
class Matrix
{
    public 
    void SwapRows(int Matrix[][], int r,int c)
    {
        int i = 0, j = 0,k = 0;
        for(i = 0; i < r-1; i+= 2)
        {
            k = i+1;
            for(j = 0; j < c; j++)
            {
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[k][j];
                Matrix[k][j] = temp;
            }
        }
       
    }
    void SwapCols(int Matrix[][], int r,int c)
    {
        int i = 0, j = 0,k = 0;
        for(i = 0; i < c-1; i+= 2)
        {
            k = i+1;
            for(j = 0; j < r; j++)
            {
                int temp = Matrix[j][i];
                Matrix[j][i] = Matrix[j][k];
                Matrix[j][k] = temp;
            }
        }
       
    }
    
}
public class program72_5 {
    
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
        System.out.println("After Swaping the consecutative Rows : ");
        mobj.SwapCols(Arr, Row, Col);
        
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
