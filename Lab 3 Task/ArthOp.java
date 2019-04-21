import java.util.Scanner;
public class ArthOp{
public static void main(String args[]){
int a,b,x;
char c;
Scanner s=new Scanner(System.in);
System.out.print("Enter 1st number:");
a=s.nextInt();
System.out.println("Enter 2nd number:");
b=s.nextInt();
System.out.println("Enter any operator (+,-,/,*):");
c=s.next().charAt(0);

if(c=='+'){
x=a+b;
System.out.println("Addition:"+ x);
}
else if(c=='-'){
x=a-b;
System.out.println("Subtraction:"+ x);
}
else if(c=='*'){
x=a*b;
System.out.println("Multiplication:"+ x);
}
else if(c=='/'){
x=a/b;
System.out.println("Division:"+ x);
}
else
{
System.out.println("Invalid choice");
}
}
}