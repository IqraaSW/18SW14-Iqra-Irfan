import java.util.Scanner;
public class SumInteger{
public static void main(String args[]){
int x,n;
int a=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter number:");
n=sc.nextInt();
sc.close();
for(x=1;x<=n;x++){
a=a+n;
}
System.out.println("Sum of first"+ n  + "natural number is:"+ a);
}
}

