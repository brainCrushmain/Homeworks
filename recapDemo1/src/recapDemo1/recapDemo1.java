package recapDemo1;

public class recapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number1 = 3;
        int number2 = 500;
        int number3 = 40;
        int number4 = 300;
        int number5 = 400;
        int biggestNumber = number1;
        
        if(number2>biggestNumber) {
        	biggestNumber = number2;}
        if(number3>biggestNumber) {
        	biggestNumber = number3;}
        if(number4>biggestNumber) {
        	biggestNumber = number4;}
        if(number5>biggestNumber) {
        	biggestNumber = number5;}
        
        System.out.println(biggestNumber);
       
        	
        }
	}
