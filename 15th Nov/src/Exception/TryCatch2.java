package Exception;

public class TryCatch2 {
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
		}
		System.out.println(c);  //normal flow
	}

}
