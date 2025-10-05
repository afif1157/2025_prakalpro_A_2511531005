package pekan4;

import java.util.Scanner;

public class tugasAlproPekan4_2511531005 {

	public static void main(String[] args) {
		
		String nama;
		int jumlah;
		String hari;
		String waktu;
		String studio;
		double harga=0;
		double Btiket=0;
		double Bhari=0;
		double Bwaktu=0;
		double diskon=0;
		double hargatotal=0;
		double subharga=0;
		
		Scanner input = new Scanner (System.in);
		System.out.println("input nama : ");
		nama = input.next();
		System.out.println("input jumlah tiket : ");
		jumlah = input.nextInt();
		System.out.println("input hari : (senin-minggu)");
		hari = input.next();
		System.out.println("input waktu : (pagi, siang, sore)");
		waktu = input.next();
		System.out.println("input studio : (regular, deluxe, premium)");
		studio = input.next();
		
		if (studio.equalsIgnoreCase("regular")) {
			Btiket = 35000;
		}else if (studio.equalsIgnoreCase("deluxe")){
			Btiket = 40000;
		}else if (studio.equalsIgnoreCase("premium")) {
			Btiket = 60000;
		}
		
		switch (hari.toLowerCase()) {
			case "senin":
			case "selasa":
			case"rabu":
			case"kamis":
				Bhari = 0;
				break;
			case"jumat":
				Bhari = 15;
				break;
			case"sabtu":
			case"minggu":
				Bhari = 20;
		}
		
		if (waktu.equalsIgnoreCase("pagi")) {
			Bwaktu = 0;
		}else if (waktu.equalsIgnoreCase("siang")) {
			Bwaktu = 5;
		}else if (waktu.equalsIgnoreCase("sore")) {
			Bwaktu = 10;
		}
		
		harga = Btiket;
		harga = harga + harga*Bhari/100;
		harga = harga + harga*Bwaktu/100;
		subharga = harga*jumlah;
		
		if (jumlah <=2) {
			diskon=0;
		}else if (jumlah <=4) {
			diskon = 20;
		}else if (jumlah >5) {
			diskon = 30;
		}	
		
		hargatotal = subharga - subharga*diskon/100;
		
		System.out.println("=== Pembelian Tiket Bioskop ===");
		System.out.println("Nama : " + nama);
		System.out.println("Jumlah Tiket : " + jumlah);
		System.out.println("Hari : " + hari);
		System.out.println("Waktu Tayang : " + waktu);
		System.out.println("Jenis Studio : " + studio);
		System.out.println("--------------------------------");
		System.out.println("Harga Tiket : " + Btiket);
		System.out.println("Biaya Hari : +"+Bhari+"%");
		System.out.println("Biaya Waktu : +"+Bwaktu+"%");
		System.out.println("Harga per Tiket : Rp."+harga);
		System.out.println("Subtotal :Rp."+subharga);
		System.out.println("Diskon : "+diskon+"%");
		System.out.println("--------------------------------");
		System.out.println("Total Harga : Rp."+hargatotal);
		

	}

}
