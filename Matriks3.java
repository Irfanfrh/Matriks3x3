import java.util.Scanner;
public class Matriks3 {

    public static void main(String[] args) {
        {
                     int A[][] = {{1,2,3},{4,5,6},{7,8,9}};
                     int B[][] = {{16,17,18},{13,14,15},{10,11,12}};
                     int C[][];
                     int i,j,k;
                     C = new int [3][3];
                     System.out.println("Matrix A");
                     for (i=0; i<=2;i++)
                     {
                      for (j=0; j<=2;j++)
                      {
                      System.out.print(A[i][j]+" ");
                      }
                     System.out.println();
                     }
     System.out.println("Matrix B");
                     for (i=0; i<=2;i++)
                     {
                      for (j=0; j<=2;j++)
      {
                      System.out.print(B[i][j]+" ");
                      }
                     System.out.println();
                     }
     System.out.println("Matrix A X Matrix B ");
     for (i=0; i<=2;i++)
                     {
                      for (j=0; j<=2;j++)
                      {
                      C[i][j]=0;
                      for(k=0;k<=2;k++)
                      {
                      C[i][j]=C[i][j]+A[i][k]*B[k][j];
                      }
                      System.out.print(C[i][j]+" ");
                      }
                     System.out.println();
     }
           }
       }

    
}