/*
    Write a program which accept matrix and return largest number from both the diagonals
    Input :
    3  2  5  9
    4  3  2  2
    8  4  1  9
    3  9  7  5
    Output : 9
 */

import java.util.*;
class Matrix
{
    public 
    int LargestFromDiagonal(int Matrix[][], int row,int col)
    {
        int Max = 0;
        int i = 0;
        Max = Matrix[i][i];
        for(i = 0; i < row; i++)
        {
           // for primary diagonal
            if(Max < Matrix[i][i])
            {
                Max = Matrix[i][i];
            }
                       
            // for secondary diagonal
                    // 4 - i - 1
           
                if(Max < Matrix[i][row-i-1])
                {
                    Max = Matrix[i][row-i-1];
                }
            
            
        }
        return Max;
    }
    int SmallestFromDiagonal(int Matrix[][],int r,int c)
    {
        int Min = 0;
        int i = 0;
        Min = Matrix[i][i];
        for(i = 0; i < r; i++)
        {
           // for primary diagonal
            if(Min > Matrix[i][i])
            {
                Min = Matrix[i][i];
            }
                       
            // for secondary diagonal
                    // 4 - i - 1
            
                if(Min > Matrix[i][r-i-1])
                {
                    Min = Matrix[i][r-i-1];
                }
            
            
        }
        return Min;
    }

}
public class program72_3 {
    
     public static void main(String A[])
    {
        int Row = 3;
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

        System.out.println("Largest Element from Diagonal : "+mobj.LargestFromDiagonal(Arr, Row, Col));
         System.out.println("Smallest Element from Diagonal : "+mobj.SmallestFromDiagonal(Arr, Row, Col));

       
       
        sobj.close();
    }
}
