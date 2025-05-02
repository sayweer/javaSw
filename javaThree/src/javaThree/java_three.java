package javaThree;
import java.util.*;
import javax.swing.*;
public class java_three {
	
	
	public static String metinDuzenle(String metin)
	{
		String[] kelimeler = metin.split(" ");
		
		StringBuilder duzenlenmisMetin = new StringBuilder();
		
		for(String kelime:kelimeler)
		{
			if(!kelime.isEmpty())
			{
				duzenlenmisMetin.append(Character.toUpperCase(kelime.charAt(0)))
				.append(kelime.substring(1).toLowerCase())
				.append(" ");
			}
		}
		return duzenlenmisMetin.toString().trim();
		
	}

	public static void main(String[] args) {
		
		Scanner okuyucu = new Scanner(System.in);
		String metin;
		//System.out.println("duzeltmek istediginiz metni giriniz = ");
		//metin = okuyucu.nextLine();
		metin = JOptionPane.showInputDialog("duzeltmek istediginiz dosyayi giriniz ");
		
		JOptionPane.showMessageDialog(null ,metinDuzenle(metin));
		//System.out.println(duzenliMetin.toString().trim());
		okuyucu.close();
	}

}