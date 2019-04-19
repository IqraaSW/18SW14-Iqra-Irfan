public class Factorial{
public static void main(String args[]){
long n,fact=1;
n=Long.parseLong(args[0]);
for(int i=1;i<=n;i++){
fact=fact*i;
}
System.out.println("Factorial of number is:"+ fact);
}
}