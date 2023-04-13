package Exception;

public class TryCatch {
public static void main(String[] args) {
		
		int a= 20;
		int b=0;
		int c= 0;
		
		try {
			System.out.println("Risky code");
			c=a/b;
		}
		catch(ArithmeticException e) {
			b=2;
			c=a/b;
			System.out.println("alternative code");
		}
		System.out.println(c);
	}
//exception generated and not get handleld
// try block executed

//exception generated and get handleld
//try or catch block and normal flow

// exception not generated 
//try and normal flow


}
