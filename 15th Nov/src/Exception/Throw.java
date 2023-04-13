package Exception;

public class Throw {
	//System.setProperty("webdriver.http.factory", "jdk-http-client");

	static void Test() {
		
		throw new NullPointerException() ;
			
		}
	static void demo() {
		throw new ArithmeticException();
		
			
		}
	public static void main(String[] args) throws InterruptedException {
		//int a=80;
		///int b=0;
		//int c=a/b;
		//System.out.println(c);
		System.out.println("main metod running");
		demo();
		Test();
		Thread.sleep(2000);
		
	}
	}


