class Print{
public void Method(int n, char c){
System.out.print("To print something");
}
public void Method(char c, int n){
System.out.print("\n having different parameters");
}
}
class MainPrint{
public static void main(String args[]){
Print p=new Print();
p.Method(2,'*');
p.Method('*',7);
}
}