class StudentClass{
String name;
String university;
int age;
String address;
String semester;
String rollno;
String department;
public void setDetails(int a, String n, String s, String r, String ad, String d, String university){
name=n;
department=d;
semestar=s;
address=ad;
rollno=r;
age=a;
university=u;
}
public void getDetails(){
System.out.println("**********Student Data**********");
System.out.println("NAME:"+ name);
System.out.println("DEPARTMENT:"+ department);
System.out.println("Semester:"+ semester);
System.out.println("Roll No:"+ rollno);
System.out.println("University:"+ university);
System.out.println("Age:"+ age);
System.out.println("Address:"+ address);
}
}
public class Studentt{
public static void main(String args[]){
StudentClass std=new StudentClass();
std.setDetails("Iqra", "Mehran University, Jamshoro", 18,"2nd Semester", "18SW14","Software Engineering");
std.getDetails();
}
}

