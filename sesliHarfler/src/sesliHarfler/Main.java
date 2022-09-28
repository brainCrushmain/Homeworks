package sesliHarfler;

public class Main {

	public static void main(String[] args) {
	   char harf = 'E' ;
	   char[] kalın = {'A','I','O', 'U', 'a', 'ı', 'o', 'u'};
	   char[] ince = {'E', 'İ', 'Ö', 'Ü', 'e', 'i','ö','ü'};
	   
	   boolean inceHarf = false;
	   boolean kalınHarf = false; 
	   
	   for (char harf1 : kalın) {
		   if(harf1==harf) {
			   kalınHarf=true;
		   }}
	  for (char harf2 : ince) {
		  if(harf2==harf) {
			   inceHarf=true; 
		  }
	  }
	  if(inceHarf) {
		  System.out.println("ince harf");		 
   }
	  if(kalınHarf) {
		  System.out.println("kalın harf");
	  } 
	}
	   
	}


