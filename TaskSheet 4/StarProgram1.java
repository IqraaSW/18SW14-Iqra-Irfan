public class StarProgram1{
public static void main(String args[]){
int i,j,k;
int a=1;
for(i=1;i<=5;i++){
for(j=5;j>=1;j--){
System.out.print(" ");
}
for(k=1;k<=a;k++){
System.out.print("*");
}
a=a+1;
System.out.println();
}
}
}