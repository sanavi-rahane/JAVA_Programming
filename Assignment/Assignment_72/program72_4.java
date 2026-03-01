/*
    Write a program which accept matrix and display addition of elements from each column
    Input :
    3  2  5  9
    4  3  2  2
    8  4  1  9
    3  9  7  5
    Output :
    18  18  15  25
*/


import java.util.*;
class Matrix
{
    public 
    int[] ColumnAddition(int Matrix[][], int row,int col)
    {
        int Arr[] = new int[col];
        int i = 0,j = 0;
        
        for(i = 0; i < col; i++)
        {
           int Sum = 0;
           for(j = 0; j < row; j++)
           {
                Sum = Sum + Matrix[j][i];
           }
           Arr[i] = Sum;
        }
       return Arr;
    }
    
}
public class program72_4 {
    
     public static void main(String A[])
    {
        int Row = 4;
        int Col = 4;
        int Arr[][] = new int[Row][Col];
        int i = 0, j = 0;
        int iRet[] = new int[Col];
        
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

        iRet = mobj.ColumnAddition(Arr, Row, Col);
        for(i = 0; i < iRet.length; i++)
        {
            System.out.println("Column "+(i+1)+" Addition : "+iRet[i]);
        }

       
        
        sobj.close();
    }
}
