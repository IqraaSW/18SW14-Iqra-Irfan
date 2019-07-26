package Task;
interface AdvancedArithmetic{
	int SumOfFactors(int n);
}
public class MyCalculator implements AdvancedArithmetic{
public int SumOfFactors(int n){
int sum=0;
for(int i=1;i<=n;i++){
	if(n%i==0){
	sum+=i;
	}
}
	return sum;
}
}