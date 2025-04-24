
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
	
	public static double ortalamaHesaplama(int[] dizi)
	{
		double toplam = 0;
		
		for(int i = 0 ; i < dizi.length ; i++)
		{
			toplam += dizi[i];
		}
		return toplam / dizi.length;
	}

	public static void main(String[] args) {

		Scanner okuyucu = new Scanner(System.in);
		System.out.println("lutfen hitap edebilmemiz icin isminizi giriniz");
		String isim = okuyucu.nextLine();
		System.out.printf("%s ,lutfen notlarini gireceginiz ders sayisini giriniz : \n",isim);
		int dersSayisi = intDegerAlanaKadarGirdiAlma(okuyucu);
		
		int[] notlar = new int[dersSayisi];
		
		for(int i = 0 ; i < dersSayisi ; i++)
		{
			System.out.printf("%s ,%d. notu giriniz = \n",isim,i+1);
			while(true)
			{
				notlar[i] = intDegerAlanaKadarGirdiAlma(okuyucu);
				
				if(notlar[i] <= 100 && notlar[i] >= 0)
					break;
				else
					System.out.printf("%s ,lutfen gecerli bir not degeri giriniz (0 ila 100 arasında) = ",isim);
			}
		}
		
		System.out.printf("%s ,girilen notlarin ortalamasi = %.2f\n",isim,ortalamaHesaplama(notlar));
		
		okuyucu.close();
		
	}

}
