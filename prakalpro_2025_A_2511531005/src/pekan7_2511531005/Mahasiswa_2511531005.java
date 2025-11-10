package pekan7_2511531005;

public class Mahasiswa_2511531005 {
	private int nim;
	private String nama,nim2;
	
	public void setNim (int nim) {
		this.nim=nim;
	}
	public void setNim2 (String nim2 ) {
		this.nim2=nim2;	
	}
	public void setNama (String nama) {
		this.nama=nama;
	}
	public int getNim() {
		return nim;
	}
	public String getNim2() {
		return nim2;
	}
	public String getNama() {
		return nama;
	}

	
	public void Cetak () {
		System.out.println("nim : "+ nim);
		System.out.println("nama : "+ nama);
	}
	public void Cetak2 () {
		System.out.println("nim : "+ nim2);
		System.out.println("nama : "+ nama);
	}
}


