import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.io.File;
class read {
 public static void main(String[] args) {
 String var = "";
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter the text to create file : type exit to stop"
);
 while (!var.endsWith("exit\n"))
 var = var + scan.nextLine()+"\n";
 try {
 File file = new File("output.txt");
 FileWriter fw = new FileWriter(file);
 fw.write(var);
 fw.close();
 System.out.println("Reading File content");
 FileReader fr = new FileReader("output.txt");
 String str = "";
 int i;
 while ((i = fr.read()) != -1) {
 // Storing every character in the string
 str += (char) i;
 }
 System.out.println(str);
 fr.close();
 } catch (IOException e) {
 System.out.println("There are some exception");
 }
 }
}
