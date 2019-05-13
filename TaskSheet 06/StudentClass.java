class StudentClass{
String name;
int age;
String address;
StudentClass(){
this.name="unknown";
this.age=0;
this.address="not available";
}
public void setInfo(String name, int age){
System.out.println(this.name=name);
System.out.println(this.age=age);
}
public void setInfo(String name,int age, String address){
System.out.println(this.name=name);
System.out.println(this.age=age);
System.out.println(this.address=address+"\n");
}
}
class Lab6Task5{
public static void main(String args[]){
StudentClass [] s=new StudentClass[10];
s[0]=new StudentClass();
s[0].setInfo("Iqra",19,"Qasimabad House#10");

s[1]=new StudentClass();
s[1].setInfo("Mahrukh",19,"Latifabad");

s[2]=new StudentClass();
s[2].setInfo("Rabia",18,"Latifabad near Baig Mart");

s[3]=new StudentClass();
s[3].setInfo("Shiza",20,"Qaismabad near Raani Bagh");

s[4]=new StudentClass();
s[4].setInfo("Jharna",19,"Market");

s[5]=new StudentClass();
s[5].setInfo("Fahad",19,"Qaismabad");

s[6]=new StudentClass();
s[6].setInfo("Unza",19,"Mirpurkhaas");

s[7]=new StudentClass();
s[7].setInfo("Amna",19,"Hala");

s[8]=new StudentClass();
s[8].setInfo("Areej",19,"Hyderabad");

s[9]=new StudentClass();
s[9].setInfo("Fatima",16,"Wapda Colony, Jamshoro");

s[10]=new StudentClass();
s[10].setInfo("Fizza",17,"Jamshoro");
}
}


























