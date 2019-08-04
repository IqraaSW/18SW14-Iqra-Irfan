class MyCalculator{
	long ans=1;
	public long power(int n, int p) throws Exception{
	if(n<0 || p<0){
	throw new Exception("n or p should not be negative");
	}
	else if(n==0 && p==0){
	throw new Exception("n or p should not be zero");
	}
	else{
	for(int i=1;i<=p;i++){
	ans*=n;
	}
	}
	return ans;

	}
}
class Task3Lab9{
	public static void main(String args[]){
	MyCalculator m=new MyCalculator();
	try{
	System.out.println(m.power(4,-2));
	}
	catch(Exception e){
	System.out.println(e);
	}
	}
}