import Task3.A;
class B extends A{
	void dataValues(){
	System.out.println("B's Value");
	}
}
public class MainClass{
public static void main(String args[]){
	B b= new B();
	b.dataValues(); // it will gives us an Error
}
}