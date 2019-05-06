public class Dog{
String name;
int age;
String breed;
public void setDetails(String name, int age, String breed){
this.name=name;
this.age=age;
this.breed=breed;
}
public void showDetails(){
if(name!=null && breed!=null && age!=0){
System.out.println("Name:"+ name);
System.out.println("Breed:"+ breed);
System.out.println("Age:"+ age);
}
else
{
System.out.println("Details are not available");
}
}
}
class UseDog{
public static void main(String args[]){
Dog d1=new Dog();
d1.setDetails("Beirel",4,"Australia");
d1.showDetails();
}
}
