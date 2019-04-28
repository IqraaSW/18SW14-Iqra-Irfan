import java.util.Scanner;
public class Table{
public static void main(String args[]){
int st;
int e;
int t;
Scanner s=new Scanner(System.in);
System.out.print("Enter Table:");
t=s.nextInt();
System.out.print("Enter starting point:");
st=s.nextInt();
System.out.print("Enter ending point:");
e=s.nextInt();
int result;
for(int i=st;i<=e;i++){
result=t*i;
System.out.println(t+ "x" + i+ "="+ result);
}
}
}