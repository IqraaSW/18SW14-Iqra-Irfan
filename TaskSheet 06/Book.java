class Book{
private String name;
private Author author;
private double price;
private int qty;
public Book(String name, Author author, double price, int qty){
this.name=name;
this.author=author;
this.price=price;
this.qty=qty;
}
public String getName(){
return name;
}
public Author getAuthor(){
return author;
}
public double getPrice(){
return price;
}
public void setPrice(double price){
this.price=price;
}
public int getqty(){
return qty;
}
public void setqty(int qty){
this.qty=qty;
}
public String toString(){
return "'" + name + "' by " + author;
}
}
class NewBook{
public static void main(String args[]){
Author a1=new Author("James Gosling","james14@gmail.com",'m');
System.out.println(a1);
Book dummyBook=new Book("Java Oop",a1,199.0,12);
System.out.println(dummyBook);
dummyBook.setPrice(199.0);
dummyBook.setqty(12);
System.out.println(dummyBook);
System.out.println("Book Name:"+ dummyBook.getName());
System.out.println("Price:"+ dummyBook.getPrice());
System.out.println("Quantity:"+ dummyBook.getqty());
System.out.println("Author:"+ dummyBook.getAuthor());
System.out.println("Author's name:"+ dummyBook.getAuthor().getname());
System.out.println("Author's email:"+ dummyBook.getAuthor().getemail());
System.out.println("Author's gender:"+ dummyBook.getAuthor().getgender());
Book moredummyBook=new Book("Java Language", new Author("James Gosling","james14@gmail.com",'m'),19.97,8);
System.out.println(moredummyBook);
}
}

