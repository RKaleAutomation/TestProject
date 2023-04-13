package Collection;

public class genericABC <G,L> {
	 G b;
	 
	 G Demo(L x) {
		 System.out.println(x);
		 return b;
		  }
	 public static void main(String[] args) {
		genericABC <Integer,String> y = new genericABC<Integer,String>();
		
		y.b =890;
		
		int z= y.Demo("Automation");
		System.out.println();
	}

}
