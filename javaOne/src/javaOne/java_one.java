package javaOne;

import java.util.*;



public class java_one {
	
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
		System.out.println("lutfen notlarini gireceginiz ders sayisini giriniz : ");
		int dersSayisi = intDegerAlanaKadarGirdiAlma(okuyucu);
		
		int[] notlar = new int[dersSayisi];
		
		for(int i = 0 ; i < dersSayisi ; i++)
		{
			System.out.printf("%d. notu giriniz = \n",i+1);
			while(true)
			{
				notlar[i] = intDegerAlanaKadarGirdiAlma(okuyucu);
				
				if(notlar[i] <= 100 && notlar[i] >= 0)
					break;
				else
					System.out.println("lutfen gecerli bir not degeri giriniz (0 ila 100 arasında) = ");
			}
		}
		
		System.out.printf("girilen notlarin ortalamasi = %.2f\n",ortalamaHesaplama(notlar));
		
		okuyucu.close();
		
	}

}
