public class SearchVal{
public static void main(String args[]){
int a;
a=Integer.parseInt(args[0]);
int[]num={1,2,3,4,5};
Boolean found=false;
for(int n:num){
if(n==a){
found=true;
break;
}
}
if(found)
System.out.println(a + "  is found");
else
System.out.println( a + "is not found");
for(int i=0;i<num.length;i++){
if(num[i]==a){
System.out.println("Position of " + a + " is " + i);
break;
}
}
}

}