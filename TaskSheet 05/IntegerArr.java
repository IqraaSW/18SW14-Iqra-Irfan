import java.util.Scanner;
public class IntegerArr{
Scanner s=new Scanner(System.in);
int arr[]=new int[5];
public void setarr(){
System.out.println("Enter array elements:");
for(int i=0;i<=4;i++){
arr[i]=s.nextInt();
}
}
public void getarr(){
for(int j=0;j<=4;j++){
if(arr[j]%2==0){
System.out.println("Even Numbers:"+ arr[j]);
}
if(arr[j]%2!=0){
System.out.println("Odd Numbers:"+ arr[j]);
}
}
}
public static void main(String [] args){
	IntegerArr I1=new IntegerArr();
	I1.setarr();
	I1.getarr();
}
}
