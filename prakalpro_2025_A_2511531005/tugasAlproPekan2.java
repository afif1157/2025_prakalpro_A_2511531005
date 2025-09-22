package pekan2;

public class tugasAlproPekan2 {

	public static void main(String[] args) {
		
		/* program ini menampilkan jenis, ukuran, stok, dan status ketersediaan sepatu.
		 * 
		 */
		// inisiallisai data sepatu A
		char sepatuA = 'A';
		float ukuranA = 38.5f;
		int stokA = 108;
		boolean ketersediaanA = true;
		
		// inisialisasi data sepatu B
		char sepatuB = 'B';
		float ukuranB = 39;
		int stokB = 26;
		boolean ketersediaanB = true;
		
		// inisialisasi data sepatu C
		char sepatuC = 'C';
		float ukuranC = 40;
		int stokC = 0;
		boolean ketersediaanC = false;
		
		System.out.println("=== Data Sepatu ===");
		System.out.println();
		System.out.println("Jenis Sepatu :" + sepatuA );
		System.out.println("Ukuran	:" + ukuranA );
		System.out.println("Stok	:" + stokA );
		System.out.println("Status Barang :" + ketersediaanA );
		System.out.println();
		System.out.println("Jenis Sepatu :" + sepatuB );
		System.out.println("Ukuran	:" + ukuranB );
		System.out.println("Stok	:" + stokB );
		System.out.println("Status Barang :" + ketersediaanB );
		System.out.println();
		System.out.println("Jenis Sepatu :" + sepatuC );
		System.out.println("Ukuran	:" + ukuranC );
		System.out.println("Stok	:" + stokC );
		System.out.println("Status Barang :" + ketersediaanC );

		
	}

}
