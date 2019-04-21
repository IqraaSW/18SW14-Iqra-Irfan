public class MarkSheet{
public static void main(String args[]){

int a,b,c;
a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);
c=Integer.parseInt(args[2]);
int d=a+b+c;
int TotalMarks=300;
char p='%';
System.out.println("Obtained Marks of C++:"+ a);
System.out.println("Obtained Marks of Data Structure:"+ b);
System.out.println("Obtained Marks of Operating Systems:"+ c);
float per= (d*100)/300;
System.out.println("Percentage:"+ per+p);
if(per>90){
System.out.println("Grade: A");
}
else if(per<=90 && per>=80){
System.out.println("Grade: B");
}
else if(per<=79 && per>=70){
System.out.println("Grade: C");
}
else if(per<=69 && per>=60){
System.out.println("Grade: D");
}
else if(per<60){
System.out.println("Grade: FAIL");
}
}
}