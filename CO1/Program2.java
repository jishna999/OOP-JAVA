import java.util.Scanner;
class Matrix
{
 int row,col;
 int[][] matrix;
 Matrix(int r,int c)
 {
  row=r;
  col=c;
  matrix = new int[row][col];
 }
 void matrixCreation(Scanner read)
 {
  for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
    {
     matrix[i][j] = read.nextInt();    
    }
  }
 }
}
public class Program
{
 public static void add(Matrix m1,Matrix m2,Matrix result)
 {
  for(int i=0;i<m1.row;i++)
  {
   for(int j=0;j<m2.col;j++)
   {
    result.matrix[i][j] = m1.matrix[i][j] + m2.matrix[i][j];
   }
  }
 }
 public static void display(Matrix result)
 {
  for(int i=0;i<result.row;i++)
  {
   for(int j=0;j<result.col;j++)
   {
    System.out.print("\t"+result.matrix[i][j]+"\t");
   }
   System.out.print("\n");
  }
 }
 public static void main(String[] args)
 {
  int row, col;
  Scanner read=new Scanner(System.in);
  
  System.out.println("Enter the number of rows");
  row = read.nextInt();
  System.out.println("Enter the number of columns:");
  col=read.nextInt();
  Matrix m1= new Matrix(row , col);
  Matrix m2= new Matrix(row , col);
  Matrix result = new Matrix(row , col);
  System.out.println("Enter he elements to first matrix");
  m1.matrixCreation(read);
  System.out.println("Enter elements to second matrix");
  m2.matrixCreation(read);
  add(m1,m2,result);
  display(result);
 }
 }