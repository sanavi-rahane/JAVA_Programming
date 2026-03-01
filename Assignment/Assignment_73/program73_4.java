/*
write a program which accept matrix and check whether the matrix is identity matrix or not

Identity matrix is a sequare matrix with 1's along the diagonal from 
upper left to lower right and 0's in all other positions.
If it satisfies the structure as expalined before then the matrix is called as indentity matrix

Input :
 1  0  0  0
 0  1  0  0
 0  0  1  0
 0  0  0  1

 output :
 ture
*/
package Assignment_73;
import java.util.*;
class Matrix
{
    public 
    boolean CheckIdentityMatrix(int Matrix[][], int r,int c)
    {
        int i = 0, j = 0;
        boolean Identiy = true;
        for(i = 0; i < r; i++)
        {
            for(j = 0; j < c; j++)
            {
                if(i == j)
                {
                    if(Matrix[i][j] != 1) Identiy = false;
                }
                else
                {
                     if(Matrix[i][j] != 0) Identiy = false;
                }
            }
        }
       return Identiy;
    } 
}

public class program73_4 {
    
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
        
    
        System.out.println("\t"+(mobj.CheckIdentityMatrix(Arr, Row, Col) ? "It is Identity matrix": "Not Identity Matrix"));
        
        sobj.close();
    }
}


