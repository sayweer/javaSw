package javaThree;
import java.util.*;
import javax.swing.*;
public class java_three {

	public static void main(String[] args) {
		
		Scanner okuyucu = new Scanner(System.in);
		String metin;
		//System.out.println("duzeltmek istediginiz metni giriniz = ");
		//metin = okuyucu.nextLine();
		metin = JOptionPane.showInputDialog("duzeltmek istediginiz dosyayi giriniz ");
		
		
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
		
		JOptionPane.showMessageDialog(null, duzenliMetin.toString().trim());
		//System.out.println(duzenliMetin.toString().trim());
		okuyucu.close();
	}

}