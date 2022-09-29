package sayıBulma;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int [] {1,2,5,7,9,0};
		int lookingFor = 4;
	    boolean varmi = false;
	    
	    for(int number : numbers) {
	    if(lookingFor==number) {
	    	varmi= true;
	    	break;	  
	    }
	    }
	    if(varmi) {
	    	System.out.println("yes,it's here");
	    }else {
	    	System.out.println("nope, it's not in here");
	    }
	    
	}

}
