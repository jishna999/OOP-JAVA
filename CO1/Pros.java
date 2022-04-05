import java.util.Scanner;
class Real
{
 int real;
 int image;
 void setValue(int real,int image)
 {
  this.real=real;
  this.image=image;
 }
 void add(Real n1,Real n2)
 {
  System.out.println(n1.real+n2.real+"+"+n1.image+n2.image+"i");
 }
}
public class Pros
{
 public static void main(String[] args)
 {
  Scanner read=new Scanner(System.in);
  Real n1=new Real();
  Real n2=new Real();
  n1.setValue(10,7);
  n2.setValue(12,9);
  n2.add(n1,n2);
 }
}