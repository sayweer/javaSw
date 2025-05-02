package javaThree;
import java.util.*;
public class java_three {

	public static void main(String[] args) {
		
		Scanner okuyucu = new Scanner(System.in);
		String metin;
		System.out.println("duzeltmek istediginiz metni giriniz = ");
		metin = okuyucu.nextLine();
		
		String[] kelimeler = metin.split(" ");
		StringBuilder duzenliMetin = new StringBuilder();
		
		for(String kelime:kelimeler)
		{
			if(!kelime.isEmpty())
			{
				duzenliMetin.append(Character.toUpperCase(kelime.charAt(0)))
				.append(kelime.substring(1).toLowerCase())
				.append(" ");
			}
		}
		System.out.println(duzenliMetin.toString().trim());
		okuyucu.close();
	}

}