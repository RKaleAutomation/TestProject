package Collection;

public class ABC  <G>{  //Generic method
	int a;
	G b;
	public static void main(String[] args) {
		ABC x= new ABC();
		
		x.a = 56;
		System.out.println(x.a);
		
		x.b ="Automation";
		System.out.println(x.b);
		
		x.b =234;
		System.out.println(x.b);
		
		x.b =67.89f;
		System.out.println(x.b);
		
		ABC<Integer> y = new ABC<Integer>();
		y.a =78;
		
		y.b=67;
		System.out.println(y.b);
		
		ABC<String> z = new ABC<String>();
		
		z.b="SQL";
		System.out.println(z.b);
		
		
	}

}
