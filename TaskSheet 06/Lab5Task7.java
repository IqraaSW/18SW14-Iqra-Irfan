import java.util.Scanner;
public class Lab5Task7{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
String split[]=s.split(",");
System.out.println(" Student 1 " );
System.out.println("Name:"+ split[0]);
System.out.println("Program:"+ split[1]);
System.out.println("Age:"+ split[2]);
System.out.println(" Student 2 " );
System.out.println("Name:"+ split[3]);
System.out.println("Program:"+ split[4]);
System.out.println("Age:"+ split[5]);
}
}
