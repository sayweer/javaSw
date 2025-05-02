package javaVize;
import java.util.*;
import javax.swing.*;

public class vize1 {
	public static String isimAlma()
	{
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz : ");
		String isim = okuyucu.nextLine();
		okuyucu.close();
		return isim;
	}
	
	public static int yasAlma()
	{
		Scanner okuyucu = new Scanner(System.in);
		int yas;
		while(true)
		{
			try {
				System.out.println("lutfen yasinizi giriniz : ");
				String sayi = okuyucu.nextLine();
				yas = Integer.parseInt(sayi);
				okuyucu.close();
				break;
			}catch(NumberFormatException e)
			{
				System.out.println("lutfen yasinizi kontrol edip tekrar giriniz sizi yonlendiriyorum");
			}
		}
		return yas;
	}
	
	public static String ePostaAlma()
	{
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("lutfen e posta bilginizi tuslayiniz : ");
		String ePosta = okuyucu.nextLine();
		okuyucu.close();
		return ePosta;
	}
	
	public static String kategoriGirisi()
	{
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("lutfen katılmak istediginiz kategoriyi(MOBİL ,WEB ,OYUN ,VB.) giriniz : ");
		String kategori = okuyucu.nextLine();
		okuyucu.close();
		return kategori;
	}

	public static void main(String[] args) {
		String isim = isimAlma();
		int yas = yasAlma();
		String ePosta = ePostaAlma();
		String kategori = kategoriGirisi();
		
		StringBuilder bilgiler = new StringBuilder();
		bilgiler.append("isminiz = ").append(isim).append("\nyasiniz = ").append(yas).append("\n e Postaniz = ").append(ePosta).append("\ngirdiginiz kategori = ").append(kategori);
		
		System.out.println(bilgiler.toString().trim());
		
	}
}
