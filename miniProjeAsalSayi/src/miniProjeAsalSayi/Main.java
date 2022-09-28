package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {

		/*int number = 1;
		boolean isPrime = true;
		if (number == 1) {
			System.out.println("your number is not a prime number");
			return;
		} 
		if(number<1) {
		  System.out.println("Invalid Number");
		  isPrime = false;}
		for(int i=2; i<number; i++ ) {
		  if (number % i == 0) {
			  isPrime = false;
		System.out.println("your number is not a prime number :)");
		}

		 
		}
		if(isPrime) 
		{System.out.println("your number is a prime number :)");}
		}
	}
*/


        int number = 43;
        int asalMi=1;
        for (int sayac = 2; sayac < number; sayac++) {
            int remainder = number % sayac;
            if (remainder == 0) {
               asalMi = 0;
            }
        }
        if (asalMi ==0){
            System.out.println("Sayı asal değil.");
        }
        if (asalMi ==1){
            System.out.println("Sayı asal.");
        }

    }
}



