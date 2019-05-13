class StaticDemo{
String name;
String rollno;
static String dept="Software";
StaticDemo(String name, String rollno){
this.name=name;
this.rollno=rollno;
}
void display(){
System.out.println(name+ "  "+rollno+ "  "+dept);
}
public static void main(String args[]){
StaticDemo s1=new StaticDemo("Iqra","18SW14");
s1.display();
StaticDemo s2=new StaticDemo("Mahrukh","18SW02");
s2.display();
}
}


