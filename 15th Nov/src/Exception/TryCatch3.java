package Exception;

public class TryCatch3 {
	public static void main(String[] args) {
		int a=20;
		int b=0;
		int c=0;
		int d[]= {12,23,44,45,54,16};
		
		System.out.println("Before try block code started");
		
		try {
			System.out.println("try block risky code");
			c=a/b;
			System.out.println(d[6]); //event (exception) generated
		}
		catch(ArithmeticException e) {
			b=2;
			c=a/b;
			System.out.println("alternative code od arithmetic");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("alternative code of array");
			System.out.println(d[3]);
			try {
				System.out.println("try block risky code");
				c=a/b;
				System.out.println(d[6]); //event (exception) generated
			}
			catch(ArithmeticException Arithmetic) {
				b=2;
				c=a/b;
				System.out.println("alternative code od arithmetic");
			}}
		System.out.println(c);  //normal flow
	}}
//2nd no catch required  try or catch block under the catch method

//In case of finally block
// exception generated and not get handleld
//try block and finally block

//exception generated and get  handleld
//try block and catch block ,finally block and normal flow

//exception not generated 
//try,finally block and normal flow
