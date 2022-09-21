package reCapDemo2;

public class reCapDemo2 {

	public static void main(String[] args) {
		double[] myList = {3.4, 5.6, 9.6, 0.8};
		double total = 0;
		double max = myList[0];
		for (double number:myList) {
		if (number>max) {
			max = number;
				}	
		 total = total + number;
		 System.out.println(number);
		 }
        
		System.out.println("toplam =  " + total);
        System.out.println("biggest number:" + max);
	
	}
}
