/*
Write a program which accept matrix from user and return addition of diagonal elements.
Input :
3  2  5  9
4  3  2  2
8  4  1  5
3  9  7  5
Output :
12
*/
import java.util.*;
class Addition
{
    public 
    int AddPrimaryDigonal(int Matrix[][],int row,int col)
    {
        int i = 0, j = 0;
        int AddDiagonal = 0;
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                //Pattern for primary diagonal 
                if(i == j) // 
                {
                    AddDiagonal = AddDiagonal + Matrix[i][j];
                }
            }
        }
        return AddDiagonal;
    }
    int AddSecondaryDigonal(int Matrix[][],int row,int col)
    {
        int i = 0, j = 0;
        int AddDiagonal = 0;
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                // pattern for Secondary Diagonal
                if(i + j == row - 1)
                {
                    AddDiagonal = AddDiagonal + Matrix[i][j];
                }
            }
        }
        return AddDiagonal;
    }
    int AddBothDigonal(int Matrix[][],int row,int col)
    {
        int i = 0;
        int PriDiagonal = 0;
        int SecDiagonal = 0;
        for(i = 0; i < row; i++)  
        {
            PriDiagonal = PriDiagonal + Matrix[i][i];
            SecDiagonal = SecDiagonal + Matrix[i][row-1-i];
        }
        return PriDiagonal;
    }// Time Complexity : O(N)
    int TotalSumDiagonal(int Matrix[][], int r,int c)
    {
        int i = 0, totalSum = 0;
        for(i = 0; i < r; i++)
        {
            totalSum = totalSum + Matrix[i][i];
            // only add it if it's NOT the same as the primary element
            // for handling middle element
            if(i != (r-1-i)) 
            {
                totalSum = totalSum + Matrix[i][r-1-i];
            }
        }
        return totalSum;
    }
} 
public class program72_1 {
    public static void main(String A[])
    {
        int Row = 4;
        int Col = 4;
        int Arr[][] = new int[Row][Col];
        int i = 0, j = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Element :");
        for(i = 0; i < Row; i++)
        {
            for(j = 0; j < Col; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
        
        Addition aobj = new Addition();
        
        System.out.println("Addition of Primary Diagonal : "+aobj.AddPrimaryDigonal(Arr, Row, Col));
        System.out.println("Addition of Secondary Diagonal : "+aobj.AddSecondaryDigonal(Arr, Row, Col));
        System.out.println("Total Sum of Diagonal Element : "+aobj.TotalSumDiagonal(Arr, Row, Col));
        sobj.close();
    }
}
