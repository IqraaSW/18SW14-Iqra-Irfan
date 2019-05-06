class StringClass{
String name,dept;
int age;
public void showDetails(){
System.out.println("Name:"+ name);
System.out.println("Department:"+ dept);
System.out.println("Age:"+ age);
}
}
class NewString{
public static void main(String [] args){
StringClass st1,st2;
st1=new StringClass();
st2=new StringClass();
st1.name="Ali";
st1.dept="BE-Software";
st1.age=18;
st1.showDetails();
st2.name="Aisha";
st2.dept="BE-Electronics";
st2.age=19;
st2.showDetails();
}
}










