package javaVize;

public class Proje {// sınıf içerisinde mumkun oldugunca static kullanmamaya calis cunku sinifin ozellikleri genel olarak istisnalari goz ardi edersek sinifa ozel olmalidir

	private String projeAdi;
	private String projeDili;
	String[] kullanilanProjeler;
	
	public Proje(String projeAdi ,String projeDili ,String...kullanilanProjeler)
	{
		this.projeAdi = projeAdi;
		this.projeDili = projeDili;
		this.kullanilanProjeler = kullanilanProjeler;
	}
	
	
	public String getProjeAdi()
	{
		return projeAdi;
	}
	
	public void setProjeAdi(String projeAdi)
	{
		this.projeAdi = projeAdi;
	}
	
	public String getProjeDili()
	{
		return projeDili;
	}
	
	public void setProjeDili(String projeDili)
	{
		this.projeDili = projeDili;
	}
	
	public void bilgileriBas()
	{
		System.out.printf("Proje adi = %s\nProje dili = %s\nKullanilan projeler = ",projeAdi ,projeDili);
		for(int i = 0 ; i < kullanilanProjeler.length ; i++)
		{
			System.out.printf("%s, ",kullanilanProjeler[i]);
		}
	}
	
}
