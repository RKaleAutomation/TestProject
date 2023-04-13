package Collection;

public class AdvancedforLoop {
	
	public static void main(String[] args) {
		
		int [] number = {12,13,34,66,45};
		int addition = 0;
		
		char [] alphabet = {'a','b','c','d','e'};
		
			//for each loop or advanced for loop
		
		for (int num : number)  {
			System.out.println(num);
		}
		for(int num : number) {
			addition +=num;
		}
		for(char alph : alphabet) {
			System.out.println(alph);
		}
		System.out.println("addition ="+addition);
	}

}
