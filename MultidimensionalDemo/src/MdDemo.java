
public class MdDemo {

	public static void main(String[] args) {
		String[][] cities = new String [3][3];
		cities[0][0] = "New York";
		cities[0][1] = "California";
		cities[0][2] = "Los Angeles";
		cities[1][0] = "İstanbul";
		cities[1][1] = "Hatay";
		cities[1][2] = "Ankara";
		cities[2][0] = "München";
		cities[2][1] = "Dortmund";
		cities[2][2] = "Frankfurt";
		
        for(int i = 0; i<=2; i++) {
        	System.out.println("---------------------");
        	for(int j = 0; j<=2; j++) {
        	System.out.println(cities[i][j]);}
        	
        }
	}

	}
