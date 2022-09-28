package stringsDemo;

import java.lang.invoke.StringConcatException;

public class Main {

	public static void main(String[] args){
		String mesaj = "the weather is nice today";

		System.out.println(mesaj);
		System.out.println("eleman sayısı:" + mesaj.length());
		System.out.println("6. eleman :" + mesaj.charAt(5));
		System.out.println(mesaj.concat(" yaaaaaayy"));
		
		String mesaj2 = mesaj.concat(" yaaaaaay");
		
		System.out.println(mesaj2);
		System.out.println(mesaj.startsWith("t"));
		System.out.println(mesaj.endsWith("y"));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
	}

}
