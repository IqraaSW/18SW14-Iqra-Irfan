class BioData{
String name;
String dept;
String rollno;
}
class StdMarks{
int laag;
int dcld;
int oop;
int result;
double percent;
}
class Result{
	BioData b;
	StdMarks s;
Result(BioData b1, StdMarks s1){
	b=b1;
	s=s1;
}
public void createResult()
{
System.out.println("Name:"+ b.name);
System.out.println("Department:"+ b.dept);
System.out.println("Roll no:"+ b.rollno);
System.out.println();
System.out.println("Oop:"+ s.oop);
System.out.println("Laag:"+ s.laag);
System.out.println("Dcld:"+ s.dcld);
System.out.println("Total Marks:"+ (s.laag+s.dcld+s.oop));
System.out.println("Percentage:"+ (s.laag+s.dcld+s.oop)*100.0/300.0);
}
}
class UseStudentData{
	public static void main(String args[]){
		BioData b=new BioData();
		StdMarks s=new StdMarks();
		b.name="Iqra";
		b.dept="Software";
		b.rollno="18SW14";
		s.oop=90;
		s.dcld=98;
		s.laag=99;
		Result r=new Result(b,s);
		r.createResult();
	}
}
