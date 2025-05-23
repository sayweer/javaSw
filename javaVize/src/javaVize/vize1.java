package javaVize;
import java.util.*;
import javax.swing.*;

public class vize1 {
	public static String isimAlma(Scanner okuyucu)
	{
		System.out.println("lutfen isminizi giriniz : ");
		String isim = okuyucu.nextLine();
		return isim;
	}
	
	public static int yasAlma(Scanner okuyucu)
	{
		int yas;
		while(true)
		{
			try {
				System.out.println("lutfen yasinizi giriniz : ");
				yas = Integer.parseInt(okuyucu.nextLine());
				break;
			}catch(NumberFormatException e)
			{
				System.out.println("lutfen yasinizi kontrol edip tekrar giriniz sizi yonlendiriyorum");
			}
		}
		return yas;
	}
	
	public static String ePostaAlma(Scanner okuyucu)
	{
		System.out.println("lutfen e posta bilginizi tuslayiniz : ");
		String ePosta = okuyucu.nextLine();
		return ePosta;
	}
	
	public static String kategoriGirisi(Scanner okuyucu)
	{
		String kategori;
		while(true)
		{
			System.out.println("lutfen katılmak istediginiz kategoriyi(MOBİL ,WEB ,OYUN ) giriniz : ");
			kategori = okuyucu.nextLine();
			
			switch(kategori.toLowerCase()) {
			case "mobil":
			case "web":
			case "oyun":
			{
				return kategori;
			}
			default:
			{
				System.out.println("bulunmayan bir kategoriyi tusladiniz tekrar denemeniz icin sizi yonlendiriyorum!!!");
			}
			break;
				
		}
			
	}
}

	public static void main(String[] args) {
		Scanner okuyucu = new Scanner(System.in);
		String isim = isimAlma(okuyucu);
		int yas = yasAlma(okuyucu);
		String ePosta = ePostaAlma(okuyucu);
		String kategori = kategoriGirisi(okuyucu);
		
		StringBuilder bilgiler = new StringBuilder();
		bilgiler.append("isminiz = ").append(isim).append("\nyasiniz = ").append(yas).append("\ne Postaniz = ").append(ePosta).append("\ngirdiginiz kategori = ").append(kategori);
		
		System.out.println(bilgiler.toString().trim());
		
		String[][] takimOyunculariVePuanlari = {{isim,""},{"ahmet",""}, {"mehmet" ,""}};
		
		int[] notlar = new int[3];
		for(int i = 0 ; i < takimOyunculariVePuanlari.length ; i++)
		{
 			notlar[i] = (int)(Math.random()*101);
		}
		
		for(int i = 0 ; i < takimOyunculariVePuanlari.length ; i++)
		{
			takimOyunculariVePuanlari[i][1] = String.valueOf(notlar[i]);
		}
		
		for(int i = 0 ; i < takimOyunculariVePuanlari.length ; i ++)
		{
			System.out.printf("%s' in notu = %s\n",takimOyunculariVePuanlari[i][0],takimOyunculariVePuanlari[i][1]);
		}
		
		for (int i = 0 ; i < takimOyunculariVePuanlari.length ; i++)
		{
			String oyuncuIsim = takimOyunculariVePuanlari[i][0];
			int oyuncuNot = Integer.parseInt(takimOyunculariVePuanlari[i][1]);
			String durum = (oyuncuNot >= 65) ? "Basarili" : "Gelistirilmeli";
			
			System.out.printf("%s ------  %d  -------  %s\n",oyuncuIsim ,oyuncuNot ,durum);
		}
		
	}
}
