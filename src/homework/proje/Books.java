package homework.proje;
public class Books {
	
	private int baskisay;
	private int sayfasayi;
	private String cilttip;
	private String yazar;
	private int id;
	private String path;
    private String name;
    private String ac�klama;

	public Books(int id,String name,int baskisay, int sayfasayi, String cilttip, String yazar,String path,String ac�klama){
		this.id=id;
		this.baskisay=baskisay;
		this.sayfasayi=sayfasayi;
		this.cilttip=cilttip;
		this.yazar=yazar;	
		this.path=path;
		this.ac�klama=ac�klama;
		this.name=name;
}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	private int yayint;
	public int getYayint() {
		return yayint;
	}

	public void setYayint(int yayint) {
		this.yayint = yayint;
	}

	public int getBaskisay() {
		return baskisay;
	}

	public void setBaskisay(int baskisay) {
		this.baskisay = baskisay;
	}

	public int getSayfasayi() {
		return sayfasayi;
	}

	public void setSayfasayi(int sayfasayi) {
		this.sayfasayi = sayfasayi;
	}

	public String getCilttip() {
		return cilttip;
	}

	public void setCilttip(String cilttip) {
		this.cilttip = cilttip;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public String getac�klama() {
		return ac�klama;
	}

	public void setaciklama(String ac�klama) {
		this.ac�klama = ac�klama;
	}
	
}