package methods;

import java.security.PublicKey;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}
	
	//methods are written in camelCasing:)
	//bir değişken tanımladığımızda tanımlandığı blokta geçerlidir.
	//if you define a variable, it is only defined in the method that you defined in it.
	
    public static void sayiBulmaca() {
    	
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
	    	System.out.println("yes,it's here:" +lookingFor);
	    }else {
	    	System.out.println("nope, it's not in here:" + lookingFor);
	    }
	    }
    
    public static void displayMessage(int lookingFor) {
		 System.out.println("yes,it's here:" +lookingFor);
	 }}
