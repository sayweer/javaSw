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
		System.out.println("lutfen katılmak istediginiz kategoriyi(MOBİL ,WEB ,OYUN ,VB.) giriniz : ");
		String kategori = okuyucu.nextLine();
		return kategori;
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
		
	}
}
