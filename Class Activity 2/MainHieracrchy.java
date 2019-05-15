class Person{
String name;
String occupation;
public void showMsg(){
name="Iqra";
occupation="Student";
System.out.println("Name:"+ name);
System.out.println("Occupation:"+ occupation);
}
}
class Student extends Person{
String rollno;
String dept;
int age;
String university;
public void showMsg(){
rollno="18SW14";
dept="Software";
age=18;
university="Mehran University";
System.out.println("Roll number:"+ rollno);
System.out.println("Department:"+ dept);
System.out.println("Age:"+ age);
System.out.println("University:"+ university);
}
}
class Employee extends Person{
int salary;
public void showMsg(){
salary=40000;
System.out.println("Salary:"+ salary);
}
}
class Undergraduate extends Student{
String dept;
String degree;
public void showMsg(){
dept="Software";
this.degree="null";
System.out.println("Department:"+ dept);
System.out.println("Degree:"+ degree);
}
}
class Graduate extends Student{
String degree;
public void showMsg(){
degree="Bachelor of Engineering";
System.out.println("Degree:"+ degree);
}
}
class Faculty extends Employee{
String UserAccount;
public void showMsg(){
this.UserAccount="Iqra21@gmail.com";
System.out.println("User Account:"+ UserAccount);
}
}
class Staff extends Employee{
int Seats;
public void showMsg(){
Seats=24;
System.out.println("Staff Seats:"+ Seats);
}
}
class Masters extends Graduate{
String dept;
String msc;
String degree;
public void showMsg(){
dept="Software Engineering";
msc="Software";
degree="Masters";
System.out.println("Department:"+ dept);
System.out.println("Msc:"+ msc);
System.out.println("Degree:"+ degree);
}
}
class Doctoral extends Graduate{
String phd;
public void showMsg(){
phd="Phd in Maths";
System.out.println("Phd:"+ phd);
}
}
class NonDegree extends Graduate{
String n;
public void showMsg(){
n="No any degree";
System.out.println("Non Degree:"+ n);
}
}
class MainHieracrchy{
public static void main(String args[]){
Person p=new Person();
Student std=new Student();
Employee e=new Employee();
Undergraduate u=new Undergraduate();
Graduate g=new Graduate();
Faculty f=new Faculty();
Staff s=new Staff();
Masters m=new Masters();
NonDegree n=new NonDegree();
Doctoral d=new Doctoral();
p.showMsg();
std.showMsg();
e.showMsg();
u.showMsg();
g.showMsg();
f.showMsg();
s.showMsg();
m.showMsg();
n.showMsg();
d.showMsg();
}
}













