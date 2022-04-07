import java.util.Scanner;
class MatrixS
{
 
 public static void main(String[] args)
{
 int row,col,i,j,f=1;
 int[][] matrix;
 Scanner read=new Scanner(System.in);
 System.out.println("Enter the rows:");
 row=read.nextInt();
 System.out.println("Enter the columns:");
 col=read.nextInt();
 matrix=new int[row][col];
 System.out.println("Enter the elements:");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
   matrix[i][j]=read.nextInt();
  }
 }
 System.out.println("Matrix");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
   System.out.print("\t"+matrix[i][j]);
  }
 System.out.print("\n");
 }
 System.out.println("Symmetric matrix:");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
   System.out.print(matrix[j][i]+"\t");
  }
  System.out.print("\n");
 }
System.out.println("Resultant Matrix:");
 for(i=0;i<row;i++)
 {
  for(j=0;j<col;j++)
  {
   if(matrix[i][j] != matrix[j][i])
   {
    f=0;
    break;
   }
  }
 }
if(f==1)
 System.out.println("Symmetric");
else
 System.out.println("Non Symmetric");
}
}