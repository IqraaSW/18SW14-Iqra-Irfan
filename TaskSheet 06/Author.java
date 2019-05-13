class Author{
private String name;
private String email;
private char gender;
public Author(String name, String email, char gender){
this.name=name;
this.email=email;
this.gender=gender;
}
public String getName(){
return name;
}
public void setEmail(String email){
this.email=email;
}
public String getEmail(){
return email;
}
public  char getGender(){
return gender;
}
public String toString(){
return name + "("+   gender +  ") at " +email;
}
}
class MainAuthor{
public static void main(String args[]){
Author a=new Author("James Glosing", "james12@gmail.com", 'm');
a.setEmail("james12@gmail.com");
System.out.println(a);
System.out.println("Name:"+ a.getName());
System.out.println("Email:"+ a.getEmail());
System.out.println("Gender:"+ a.getGender());

}
}