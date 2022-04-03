
class Product
{
 String pcode;
 String pname;
 double price;
 void setValue(String pcode,String pname,double price)
 {
  this.pname=pname;
  this.pcode=pcode;
  this.price=price;
 }
 String lowestPrice(Product p1,Product p2,Product p3)
 {
  if((p1.price<p2.price) && (p1.price<p3.price))
   {
    return p1.pname;
   }
  else if((p2.price<p1.price) && (p2.price<p3.price))
   {
    return p2.pname;
   }
  else
   {
    return p3.pname;
   }
 }
}
class Pro
{
 public static void main(String[] args)
 {
  Product p1=new Product();
  Product p2=new Product();
  Product p3=new Product();
  p1.setValue("P101","Jishna",2000);
  p2.setValue("P102","Jasmin",1000);
  p3.setValue("P103","Jithesh",1500);
  String lowest;
  lowest =p1.lowestPrice(p2,p3,p1);
  System.out.println("Lowest ="+lowest);
 }
}
