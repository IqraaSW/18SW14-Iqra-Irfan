class MarkSheet{
int laag;
int dcld;
int oop;
int result;
double percent;
public void totalmarks(){
result=laag+dcld+oop;
System.out.println("Result:"+ result);
}
public void percentage(){
percent=(result*100)/300;
char p='%';
System.out.println("Percentage:"+ percent+p);
}
public void grade(){
if(percent>90)
System.out.println("Grade: A");
else if(percent<=90 && percent>=80)
System.out.println("Grade: B");
else if(percent<=79 && percent>=70)
System.out.println("Grade: C");
else if(percent<=69 && percent>=60)
System.out.println("Grade: D");
else if (percent<60)
System.out.println("FAIL");
}
}

class Mark{
public static void main(String args[]){
MarkSheet m=new MarkSheet();
m.laag=98;
m.dcld=92;
m.oop=95;
m.totalmarks();
m.percentage();
m.grade();
}
}