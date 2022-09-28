package perfektNummer;

public class Main {

	public static void main(String[] args) {
		int number = 10;
		int total = 0;
		
		for(int i = 1; i < number; i++) {
			if(number % i ==0) {
			total = total +i;
		}}
	    if(total == number) {
	    	if(number<=0) {System.out.println("invalid number");
	    	}else {System.out.println("das is eine perfekt nummer!");
	    	}
	    }
	    else {
	    	System.out.println("das ist keine perfekt nummer");
	    }
	   
	}}
