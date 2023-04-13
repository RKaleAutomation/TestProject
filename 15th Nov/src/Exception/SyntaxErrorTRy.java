package Exception;

public class SyntaxErrorTRy {
public static void main(String[] args) {
	int a=20;
	int b=0;
	int c=0;
	int d[]= {12,23,44,45,54,16};
	
	System.out.println("Before try block code started");
	
	try {
		System.out.println("try block risky code");
		c=a/b;
		System.out.println(d[3]); //event (exception) generated
	}
	catch(ArithmeticException e) {
		b=2;
		c=a/b;
		System.out.println("alternative code od arithmetic");
	}
	finally {
		System.out.println("Finally block executed");
	}
	
	System.out.println(c);  //normal flow
}}
//catch block is not required another catch block under this excection 
//show the syntax error

//try block is not required another try  catch block
//not show error but not required in the block
 
