public class Starline{
public static void main(String args[]){
int i,j,x;
int y=1;
for(i=1;i<=5;i++){
for(j=5;j>=i;j--){
System.out.print(" ");
}
for(x=1;x<=y;x++){
System.out.print("*");
}
y=y+2;
System.out.println();
}
}
}