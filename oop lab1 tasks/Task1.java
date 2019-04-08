public class Task1{
public static void main(String args[])
{
String Name="Iqra";
String RollNumber="18SW14";
int TotalMarks=700;
float ObtainedMarks=644;
float percentage=(ObtainedMarks/TotalMarks)*100;
char Grade='A';
Boolean status=true;

char p='%';

System.out.println("My name is:"+ Name);
System.out.println("My rollnumber is:"+ RollNumber);
System.out.println("Total Marks:"+ TotalMarks);
System.out.println("Obtained Marks:"+ ObtainedMarks);
System.out.println("Percentage:"+ percentage+p);
System.out.println("Grade:"+ Grade);
System.out.println("Status:PASS"+ status);
}
}