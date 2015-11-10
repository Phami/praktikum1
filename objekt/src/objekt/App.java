package objekt;

public class App {

	public static void main(String[] args) {

		Banana banana1 = new Banana();
		Banana banana2 = new Banana();
		
		
		
		banana1.color = "yellow";
		banana1.weight = 150;
		
		banana2.color = "green";
		banana2.weight = 100;
			
		
		
		System.out.println("banana1's color: " + banana1.getColor());
		System.out.println("banana1's color: " + banana1.getWeight());
		
		System.out.println("+++++++++++++");
		
		System.out.println("banana2's color: " + banana2.getColor());
		System.out.println("banana2's color: " + banana2.getWeight());
	}

}
