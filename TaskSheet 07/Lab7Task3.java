class Shape
{
String color;
boolean filled;
Shape()
{
color="red";
filled=true;
}
public Shape(String color,boolean filled)
{
this.color=color;
this.filled=filled;
}
public String getColor()
{
return color;
}
public void setColor(String color)
{
this.color=color;
}
public boolean isFilled()
{
return filled;
}
public void setFilled(boolean filled)
{
this.filled=filled;
}
public String toString()
{
return "Shape[color=" + color + ",filled=" +filled+ "]";
}
}
class Circle extends Shape
{
double radius;
final double PI=3.14;
Circle()
{
radius=1.0;
}
public Circle(double radius)
{
this.radius=radius;
}
public Circle(double radius, String color, boolean filled)
{
this.radius=radius;
this.color=color;
this.filled=filled;
}
public double getRadius()
{
return radius;
}
public void setRadius(double radius)
{
this.radius=radius;
}
public double getArea()
{
return (PI*radius*radius);
}
public double getPerimeter()
{
return (2*PI*radius);
}
public String toString()
{
return "Circle[Shape[radius=" +radius+",color= " +color+ ",filled=" +filled+ "]";
}
}
class Rectangle extends Shape
{
double width;
double length;
final double PI=3.14;
Rectangle()
{
width=1.0;
length=1.0;
}
public Rectangle(double width, double length)
{
this.width=width;
this.length=length;
}
public Rectangle(double width, double length, String color, boolean filled)
{
this.width=width;
this.length=length;
this.color=color;
this.filled=filled;
}
public double getWidth()
{
return width;
}
public void setWidth(double width)
{
this.width=width;
}
public double getLength()
{
return length;
}
public void setLength(double length)
{
this.length=length;
}
public double getArea()
{
return (width*length);
}
public double getPerimeter()
{
return (2*length*width);
}
public String toString()
{
return "Rectangle[Shape[width= " +width+ ",length=" +length+ ",color=" +color+ ",filled=" +filled+ "]";
}
}
class Square extends Rectangle
{
double side;
public Square()
{
side=1.0;
}
public Square(double side)
{
this.side=side;
}
public Square(double side,String color,boolean filled)
{
this.side=side;
this.color=color;
this.filled=filled;
}
public double getSide()
{
return side;
}
public void setSide(double side)
{
this.side=side;
}
public void seiWidth(double side)
{
this.side=side;
}
public void setLength(double side)
{
this.side=side;
}
public String toString()
{
return "Square[Rectangle[side= "+side+ ",color= "+color+ ",filled = "+filled+ "]";
}
}
class Lab7Task3{
public static void main(String args[]){
Shape s1=new Shape("Pink",true);
System.out.println("Shape's details= " +s1.toString());
Circle c1=new Circle(5.0,"Orange",true);
System.out.println("Area of circle= " +c1.getArea());
System.out.println("Perimeter of circle=" +c1.getPerimeter());
Rectangle r1=new Rectangle(5.0,6.0);
System.out.println("Area of rectangle="+ r1.getArea());
Square sq=new Square(3.0);
System.out.println(sq.toString());
}
}



