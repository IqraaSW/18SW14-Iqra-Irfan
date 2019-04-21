import java.util.Scanner;
public class ResultMarkSheet{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Obtained Marks of C++:");
int num1=sc.nextInt();
System.out.println("Obtained Marks of Data Structure:");
int num2=sc.nextInt();
System.out.println("Obtained Marks of Operating System:");
int num3=sc.nextInt();
int ObtainedMarks=num1+num2+num3;
int TotalMarks=300;
System.out.println("Total Marks:"+ TotalMarks);
System.out.println("Obtained Marks:"+ ObtainedMarks);
float per=(ObtainedMarks*100)/300;
char p='%';
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

