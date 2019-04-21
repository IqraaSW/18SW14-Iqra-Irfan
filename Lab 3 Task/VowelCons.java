import java.util.Scanner;
public class VowelCons{
public static void main(String args[]){
char c;
Scanner s=new Scanner(System.in);
System.out.println("Enter any character:");
c=s.next().charAt(0);
switch(c){
case 'a':
System.out.println("It's vowel");
break;
case 'e':
System.out.println("It's vowel");
break;
case 'i':
System.out.println("It's vowel");
break;
case 'o':
System.out.println("It's vowel");
break;
case 'u':
System.out.println("It's vowel");
break;
case 'A':
System.out.println("It's vowel");
break;
case 'E':
System.out.println("It's vowel");
break;
case 'I':
System.out.println("It's vowel");
break;
case 'O':
System.out.println("It's vowel");
break;
case 'U':
System.out.println("It's vowel");
break;
default:
System.out.println("It's consonant");
}
}
}

