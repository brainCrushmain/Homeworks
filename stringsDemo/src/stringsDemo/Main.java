package stringsDemo;

import java.lang.invoke.StringConcatException;

public class Main {

	public static void main(String[] args){
		String mesaj = "     The weather is nice today    ";

		System.out.println(mesaj);
		/*
		 * System.out.println("eleman sayısı:" + mesaj.length());
		 * System.out.println("6. eleman :" + mesaj.charAt(5));
		 * System.out.println(mesaj.concat(" yaaaaaayy"));
		 * 
		 * String mesaj2 = mesaj.concat(" yaaaaaay");
		 * 
		 * System.out.println(mesaj2); System.out.println(mesaj.startsWith("t"));
		 * System.out.println(mesaj.endsWith("y")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf("a"));
		 * System.out.println(mesaj2.lastIndexOf("y"));
		 */
		
		 System.out.println(mesaj.replace(' ', '*'));
		 String newMessage = mesaj.replace(' ', '*'); //belirli karakteri belirli karakterle replace yapmak :)
		 System.out.println(newMessage);
		 System.out.println(mesaj.substring(6));      //belirli sıradaki karakteri yazdırmak
		 System.out.println(mesaj.substring(16, 19)); //belirli aralıktaki kısmı yazdırmak
		 System.out.println(mesaj.replaceAll("we", "fe"));     //string cinsinden (birden fazla karakteri) değiştirmek.
		 
		 for (String kelime : mesaj.split(" ")) {
			 System.out.println(kelime);}
			 
	     System.out.println(mesaj.toLowerCase());
	     System.out.println(mesaj.toUpperCase());
	     System.out.println(mesaj.trim());
		 }
		 }
		 
		 

