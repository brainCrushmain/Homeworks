import javax.swing.tree.AbstractLayoutCache;

public class Switchh {

	public static void main(String[] args) {
		char grade = 'G';
		switch (grade) {

		case 'A':
			System.out.println("Congrats:you passed with an A !");
            break;
		case 'B':
			System.out.println("Nice, B");
			break;
		case 'C':
			System.out.println("Not Bad, C");
			break;
		case 'F':
			System.out.println("Woops, awful");

			break;
		default:
			System.out.println("Unvalid Character");
		}

	}

}
