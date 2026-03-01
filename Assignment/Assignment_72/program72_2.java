/*
    Write a program which accept matrix and one number
    from user and return frequency of that number
    Input :
    2

    3  2  5  9
    4  3  2  2
    8  4  1  9  
    3  9  7  5
    Output : 3
 */
import java.util.*;
class Matrix
{
    public 
    int CheckFrequency(int Matrix[][], int row,int col,int iNO)
    {
        int iCount = 0;
        int i = 0, j = 0;
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                if(Matrix[i][j] == iNO)
                {
                    iCount++;
                }
            }
        }
        return iCount;
    }
    int MaxFrequency(int Matrix[][],int r,int c)
    {
        int iCount = 0;
        return iCount;
    }
}
public class program72_2 {
    
     public static void main(String A[])
    {
        int Row = 4;
        int Col = 4;
        int Arr[][] = new int[Row][Col];
        int i = 0, j = 0;
        int iValue = 0, iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Element :");
        for(i = 0; i < Row; i++)
        {
            for(j = 0; j < Col; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

        System.out.println("Enter number to check its frequency : ");
        iValue = sobj.nextInt();
        
        Matrix mobj = new Matrix();
        if((iRet = mobj.CheckFrequency(Arr, Row, Col, iValue)) == 0)
        {
            System.out.println("Element is not found");
        }
        else
        {
            System.out.println("Element Fount "+iRet+" times");
        }
        sobj.close();
    }
}
