class Person{
protected String name;
protected String address;
public Person(String name,String address){
this.name=name;
this.address=address;
}
public String getName(){
return name;
}
public String getAddress(){
return address;
}
public void setAddress(String address){
this.address=address;
}
public String toString(){
return "Person[name=" +name+", address=" +address +"]";
}
}
class Student extends Person{
protected String program;
protected int year;
protected double fee;
public Student(String name,String address,String program,int year,double fee){
super(name,address);
//this.name=name;
//this.address=address;
this.program=program;
this.year=year;
this.fee=fee;
}
public String getProgram(){
return program;
}
public void setProgram(String program){
this.program=program;
}
public int getYear(){
return year;
}
public void setYear(int year){
this.year=year;
}
public double getFee(){
return fee;
}
public void setFee(double fee){
this.fee=fee;
}
public String toString(){
return "Student[Person[name=" +name+",address "+ address+",program=" +program + ",year=" +year +"fee=" +fee+ "]";
}
}
class Staff extends Person{
protected String school;
protected double pay;
public Staff(String name,String address,String school,double pay){
super(name,address);
//this.name=name;
//this.address=address;
this.school=school;
this.pay=pay;
}
public String getSchool(){
return school;
}
public void setSchool(String school){
this.school=school;
}
public double getPay(){
return pay;
}
public double setPay(double pay){
this.pay=pay;
}
public String toString(){
return "Staff[Person[name=" +name+",address="+address+",school="+school+",pay="+pay+"]";
}
}
class Lab7Task2{
public static void main(String args[]){
Person p=new Person("Iqra","House #03 Qasimabad");
Student s=new Student("Iqra","House #03 Qasimabad","Software",2018,5000.0);
Staff st=new Staff("Iqra","House #03 Qaismabad","Bahria Foundation",3500.0);
System.out.println(p.toString());
System.out.println(s.toString());
System.out.println(st.toString());
}
}


