public class BitwiseOperators{
public static void main(String args[]){
int a=3;
int b=5;
int c=0;
c=a&b;
System.out.println("The value of c for AND c=" +c);
a=3;
b=5;
c=a|b;
System.out.println("The value of c for OR c=" +c);
a=3;
b=5;
c=a^b;
System.out.println("The value of c for ^ c=" +c);
a=3;
c=a<<2;
System.out.println("The value of c for Left Shift Side c=" +c);
c=a>>3;
System.out.println("The value of c for Right shift Side c=" +c);
}
}
