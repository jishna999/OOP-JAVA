import java.util.Scanner;
class cpu
{
 int price;
 
 class Processor
 {
  int no;
  String manuf;
  void addProcessor(Scanner sc)
  {
   
   System.out.println("Enter the number of cores in Processor");
   no = sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the manufacter name:");
   manuf = sc.nextLine();
   
  }
  void display()
  {
   System.out.println("Number of cores in processor"+no);
   System.out.println("Manufacture name:"+manuf);
  } 
 }
 static class Ram
 {
  int mry;
  String manuf;
  void addRam(Scanner sc)
  {
   System.out.println("Enter memory size of RAM");
   mry = sc.nextInt();
   sc.nextLine();
   System.out.println("Enter the manufacture name:");
   manuf = sc.nextLine();
  }
  void display()
  {
   System.out.println("Memory size of RAM:"+mry);
   System.out.println("RAM Manufacter name:"+manuf);
  }
 }
 void showCpu(int price)
 {
   System.out.println("\nCPU Price:"+price);
 }
 
}
class CPU
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the price of the CPU:");
  int price = sc.nextInt();
  cpu c = new cpu();
  cpu.Processor p = c.new Processor();
  cpu.Ram r = new cpu.Ram();
  p.addProcessor(sc);
  r.addRam(sc);
  c.showCpu(price);
  p.display();
  r.display();
 }
}
