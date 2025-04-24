
package javaOne;

import java.util.*;



public class java_two {
	
	public static int intDegerAlanaKadarGirdiAlma(Scanner okuyucu)
	{
		int sayi;
		
		while(true) {
			try {
				sayi = Integer.parseInt(okuyucu.nextLine());
				break;
			}catch(NumberFormatException e){
				System.out.println("hatali bir tuslama yaptiniz. lutfen kontrol edip sayi tuslayiniz. tuslama icin sizi yonlendiriyorum.");
			}
		}
		
		return sayi;
	}
	
	public static double ortalamaHesaplama(ogrenci[] dizi)
	{
		double toplam = 0;
		
		for(int i = 0 ; i < dizi.length ; i++)
		{
			toplam += dizi[i].not;
		}
		return toplam / dizi.length;
	}

	public static void main(String[] args) {

		Scanner okuyucu = new Scanner(System.in);
		System.out.println("lutfen hitap edebilmemiz icin isminizi giriniz");
		String isim = okuyucu.nextLine();
		System.out.println("kullanici ismi basariyla girildi!!!");
		System.out.printf("%s ,lutfen notlarini gireceginiz ders sayisini giriniz : \n",isim);
		int dersSayisi = intDegerAlanaKadarGirdiAlma(okuyucu);
		
		ogrenci[] notlar = new ogrenci[dersSayisi];
		
		for(int i = 0 ; i < dersSayisi ; i++)
		{
			ogrenci ogrencio = new ogrenci();
			System.out.printf("%s ,lutfen notunu gireceginiz ogrencinin ismini giriniz = \n",isim);
			ogrencio.isim = okuyucu.nextLine();
			System.out.println("isim ekleme islemi basarili!!");
			System.out.printf("%s ,%s. isimli ogrencinin notunu giriniz = \n",isim,ogrencio.isim);
			while(true)
			{
				ogrencio.not = intDegerAlanaKadarGirdiAlma(okuyucu);
				
				if(ogrencio.not <= 100 && ogrencio.not >= 0)
				{
					System.out.println("not girisi basarili!!!");
					break;
				}
				else
					System.out.printf("%s ,lutfen gecerli bir not degeri giriniz (0 ila 100 arasında) = ",isim);
			}
		}
		
		System.out.printf("%s ,girilen notlarin ortalamasi = %.2f\n",isim,ortalamaHesaplama(notlar));
		
		okuyucu.close();
		
	}

}
