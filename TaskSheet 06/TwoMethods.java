class TwoMethods{
void AreaofSquare(double a){
double area;
area=a*a;
System.out.println("Area of square:"+ area);
}
void AreaofRectangle(double length, double width){
double result;
result=length*width;
System.out.println("Area of rectangle:"+ result);
}
}
class Lab6Task4{
public static void main(String args[]){
TwoMethods t=new TwoMethods();
t.AreaofSquare(2.0);
t.AreaofRectangle(4.0,2.0);
}
}






