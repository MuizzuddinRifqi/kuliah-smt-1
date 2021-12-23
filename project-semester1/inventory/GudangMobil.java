// M. Muizzuddin Rifqi - D4TI | 1E | 14 | 2141720027

import java.util.Scanner;

public class GudangMobil {
	static Scanner sc = new Scanner(System.in);
	static String merkMobil[] = new String[5];
	static int kolom[][] = new int[2][5];
	static int masuk[][] = new int[5][5];
	static int keluar[][] = new int[5][5];
	static int rusak[][] = new int[5][5];
	static int total_masuk[] = new int[5];
	static int total_keluar[] = new int[5];
	static int total_rusak[] = new int[5];
	static int total_utama[] = new int[5];
	static int lapor[] = new int[5];

	public static void main(String[] args) {
		dataBarang();
	}

	// TAMPIL INPUT BARANG
	static void dataBarang() {
		System.out.println();
		System.out.println("                       <<< INPUT MASTER INVENTORY >>>                   ");
		System.out.println("========================================================================");
		System.out.println("|                            GUDANG HONDA GRAHA                        |");
		System.out.println("|                                  PANDAAN                             |");
		System.out.println("========================================================================");
		for (int bar = 0; bar < merkMobil.length; bar++) {
			System.out.print(" >> MASUKKAN MOBIL KE " + (bar + 1) + " : ");
			merkMobil[bar] = sc.nextLine();
		}
		gudang();
		menu();
	}

	// TAMPIL FULL GUDANG
	static void gudang() {
		System.out.println("========================================================================");
		System.out.println("|                           GUDANG HONDA GRAHA                         |");
		System.out.println("|                                 PANDAAN                              |");
		System.out.println("========================================================================");
		System.out.println();

		for (int bar = 0; bar < merkMobil.length; bar++) {
			System.out.print(" " + merkMobil[bar] + "\t\t");
		}
		System.out.println();
		for (int bar = 0; bar < kolom.length; bar++) {
			for (int kol = 0; kol < kolom[bar].length; kol++) {
				System.out.print(" " + kolom[bar][kol] + "\t\t");
			}
			System.out.println();
		}
		for (int bar = 0; bar < 5; bar++) {
			total_utama[bar] = total_masuk[bar] - total_keluar[bar];
		}
		System.out.println();
	}

	// TAMPIL MENU
	static void menu() {
		System.out.println("========================================================================");
		System.out.println("|   [1] >> PEMASUKAN BARANG     <<                                     |");
		System.out.println("|   [2] >> PENGELUARAN BARANG   <<                                     |");
		System.out.println("|   [3] >> KERUSAKAN BARANG     <<                                     |");
		System.out.println("|   [4] >> PENCARIAN BARANG     <<                                     |");
		System.out.println("|   [5] >> LAPORAN DATA GUDANG  <<                                     |");
		System.out.println("|   [6] >> EXIT                 <<                                     |");
		System.out.println("========================================================================");
		System.out.print("SELECT MENU [1-6] >> : ");
		int select = sc.nextInt();
		System.out.println("========================================================================");

		if (select == 1) {
			System.out.println();
			barangMasuk();
		}
		else if (select == 2) {
			System.out.println();
			barangKeluar();
		}
		else if (select == 3) {
			System.out.println();
			barangRusak();
		}
		else if (select == 4) {
			System.out.println();
			pencarian();
		}
		else if (select == 5) {
			System.out.println();
			laporanGudang();
		} 
		else if (select == 6) {
			System.out.println("ANDA TELAH KELUAR DARI PROGRAM    > > >   TERIMA KASIH");
		}
		else {
			System.out.println("INCORRECT KEYWORDS !!");
			System.out.println();
			gudang();
			menu();
		}
	}

	// INPUT PEMASUKAN BARANG
	static void barangMasuk() {
		char jawab;
		System.out.println("========================================================================");
		System.out.println("|                         MENU PEMASUKAN BARANG                        |");
		System.out.println("|                      GUDANG HONDA GRAHA PANDAAN                      |");
		System.out.println("========================================================================");
		System.out.println("PILIH MOBIL YANG DIMASUKKAN KE GUDANG >>");
		System.out.println();

		for (int bar = 0; bar < merkMobil.length; bar++) {
			System.out.println(" [" + (bar + 1) + "] " + merkMobil[bar]);
		}

		System.out.println("========================================================================");
		System.out.print(" SELECT CAR [1-5] >> : ");
		int select = sc.nextInt();
		System.out.println("========================================================================");

		for (int bar = 0; bar < 1; bar++) {
			for (int kol = 0; kol < kolom.length; kol++) {

				if (select == 1) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[0] + " YANG MASUK KE GUDANG " + (kol + 1) + " : ");
					masuk[kol][0] = sc.nextInt();
					kolom[kol][0] = kolom[kol][0] + masuk[kol][0];
					total_masuk[0] += masuk[kol][0];
				} 
				else if (select == 2) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[1] + " YANG MASUK KE GUDANG " + (kol + 1) + " : ");
					masuk[kol][1] = sc.nextInt();
					kolom[kol][1] = kolom[kol][1] + masuk[kol][1];
					total_masuk[1] += masuk[kol][1];
				} 
				else if (select == 3) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[2] + " YANG MASUK KE GUDANG " + (kol + 1) + " : ");
					masuk[kol][2] = sc.nextInt();
					kolom[kol][2] = kolom[kol][2] + masuk[kol][2];
					total_masuk[2] += masuk[kol][2];
				} 
				else if (select == 4) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[3] + " YANG MASUK KE GUDANG " + (kol + 1) + " : ");
					masuk[kol][3] = sc.nextInt();
					kolom[kol][3] = kolom[kol][3] + masuk[kol][3];
					total_masuk[3] += masuk[kol][3];
				} 
				else if (select == 5) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[4] + " YANG MASUK KE GUDANG " + (kol + 1) + " : ");
					masuk[kol][4] = sc.nextInt();
					kolom[kol][4] = kolom[kol][4] + masuk[kol][4];
					total_masuk[4] += masuk[kol][4];
				} 
				else {
					System.out.println("PILIHAN ANDA TIDAK SESUAI");
				}
			}
		}

		System.out.println();
		System.out.print("KEMBALI KE MENU UTAMA ? [y/t] : ");
		jawab = sc.next().charAt(0);

		if (jawab == 'y' || jawab == 'Y') {
			System.out.println();
			gudang();
			menu();
		}
		else {
			System.out.println();
			barangMasuk();
		}
	}

	// INPUT KELUARAN BARANG
	static void barangKeluar() {
		char jawab;
		System.out.println("========================================================================");
		System.out.println("|                        MENU PENGELUARAN BARANG                       |");
		System.out.println("|                      GUDANG HONDA GRAHA PANDAAN                      |");
		System.out.println("========================================================================");

		System.out.println("PILIH MOBIL YANG DIKELUARKAN DARI GUDANG >>");
		for (int bar = 0; bar < merkMobil.length; bar++) {
			System.out.println(" [" + (bar + 1) + "] " + merkMobil[bar]);
		}
		System.out.println("========================================================================");
		System.out.println();
		System.out.print(" SELECT CAR [1-5] >> : ");
		int select = sc.nextInt();
		System.out.println("========================================================================");

		for (int bar = 0; bar < 1; bar++) {
			for (int kol = 0; kol < kolom.length; kol++) {

				if (select == 1) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[0] + " YANG KELUAR DARI GUDANG " + (kol + 1) + " : ");
					keluar[kol][0] = sc.nextInt();
					kolom[kol][0] = kolom[kol][0] - keluar[kol][0];
					total_keluar[0] += keluar[kol][0];
				} 
				else if (select == 2) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[1] + " YANG KELUAR DARI GUDANG " + (kol + 1) + " : ");
					keluar[kol][1] = sc.nextInt();
					kolom[kol][1] = kolom[kol][1] - keluar[kol][1];
					total_keluar[1] += keluar[kol][1];
				} 
				else if (select == 3) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[2] + " YANG KELUAR DARI GUDANG " + (kol + 1) + " : ");
					keluar[kol][2] = sc.nextInt();
					kolom[kol][2] = kolom[kol][2] - keluar[kol][2];
					total_keluar[2] += keluar[kol][2];
				} 
				else if (select == 4) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[3] + " YANG KELUAR DARI GUDANG " + (kol + 1) + " : ");
					keluar[kol][3] = sc.nextInt();
					kolom[kol][3] = kolom[kol][3] - keluar[kol][3];
					total_keluar[3] += keluar[kol][3];
				} 
				else if (select == 5) {
					System.out.print("INPUT UNIT MOBIL " + merkMobil[4] + " YANG KELUAR DARI GUDANG " + (kol + 1) + " : ");
					keluar[kol][4] = sc.nextInt();
					kolom[kol][4] = kolom[kol][4] - keluar[kol][4];
					total_keluar[4] += keluar[kol][4];
				}
				else {
					System.out.println("PILIHAN ANDA TIDAK SESUAI");
				}
			}
		}

		System.out.println();
		System.out.print("KEMBALI KE MENU UTAMA ? [y/t] : ");
		jawab = sc.next().charAt(0);
		if (jawab == 'y' || jawab == 'Y') {
			System.out.println();
			gudang();
			menu();
		}
		else {
			System.out.println();
			barangKeluar();
		}
	}

	// INPUT KERUSAKAN BARANG
	static void barangRusak() {
		char jawab;
		System.out.println("========================================================================");
		System.out.println("|                          MENU KERUSAKAN BARANG                       |");
		System.out.println("|                       GUDANG HONDA GRAHA PANDAAN                     |");
		System.out.println("========================================================================");
		System.out.println("PILIH MOBIL YANG RUSAK DI GUDANG >>");
		for (int bar = 0; bar < merkMobil.length; bar++) {
			System.out.println(" [" + (bar + 1) + "] " + merkMobil[bar]);
		}
		System.out.println("========================================================================");
		System.out.print(" SELECT CAR [1-5] >> : ");
		int select = sc.nextInt();
		System.out.println("========================================================================");

		for (int bar = 0; bar < 1; bar++) {
			for (int kol = 0; kol < kolom.length; kol++) {

				if (select == 1) {
					System.out.print("JUMLAH UNIT MOBIL " + merkMobil[0] + " YANG RUSAK DI GUDANG " + (kol + 1) + " : ");
					rusak[kol][0] = sc.nextInt();
					total_rusak[0] += rusak[kol][0];
				} 
				else if (select == 2) {
					System.out.print("JUMLAH UNIT MOBIL " + merkMobil[1] + " YANG RUSAK DI GUDANG " + (kol + 1) + " : ");
					rusak[kol][1] = sc.nextInt();
					total_rusak[1] += rusak[kol][1];
				} 
				else if (select == 3) {
					System.out.print("JUMLAH UNIT MOBIL " + merkMobil[2] + " YANG RUSAK DI GUDANG " + (kol + 1) + " : ");
					rusak[kol][2] = sc.nextInt();
					total_rusak[2] += rusak[kol][2];
				} 
				else if (select == 4) {
					System.out.print("JUMLAH UNIT MOBIL " + merkMobil[3] + " YANG RUSAK DI GUDANG " + (kol + 1) + " : ");
					rusak[kol][3] = sc.nextInt();
					total_rusak[3] += rusak[kol][3];
				} 
				else if (select == 5) {
					System.out.print("JUMLAH UNIT MOBIL " + merkMobil[4] + " YANG RUSAK DI GUDANG " + (kol + 1) + " : ");
					rusak[kol][4] = sc.nextInt();
					total_rusak[4] += rusak[kol][4];
				} 
				else {
					System.out.println("PILIHAN ANDA TIDAK SESUAI");
				}
			}
		}

		System.out.println();
		System.out.print("KEMBALI KE MENU UTAMA ? [y/t] : ");
		jawab = sc.next().charAt(0);

		if (jawab == 'y' || jawab == 'Y') {
			System.out.println();
			gudang();
			menu();
		}
		else {
			System.out.println();
			barangRusak();
		}
	}

	// MENU PENCARIAN
	static void pencarian() {
		String cari;
		char jawab;
		int x;
		boolean found = true;
		System.out.println("========================================================================");
		System.out.println("|                           MENU PENCARIAN MOBIL                       |");
		System.out.println("|                        GUDANG HONDA GRAHA PANDAAN                    |");
		System.out.println("========================================================================");
		System.out.print("    >> MASUKKAN MERK MOBIL YANG DICARI  >> : ");
		cari = sc.next();
		for (int bar = 0; bar < merkMobil.length; bar++) {
			if (merkMobil[bar].equalsIgnoreCase(cari)) {
				found = true;
				x = bar + 1;
				System.out.println("MOBIL YANG ANDA CARI ADA DI ROOM " + x);
			}
		}

		if (found == false) {
			System.out.println("MOBIL YANG ANDA CARI TIDAK ADA DI GUDANG !!");
		}
		System.out.println("========================================================================");
		System.out.println();
		System.out.print("KEMBALI KE MENU UTAMA ? [y/t] : ");
		jawab = sc.next().charAt(0);
		if (jawab == 'Y' || jawab == 'y') {
			System.out.println();
			gudang();
			menu();
		}
		else {
			System.out.println();
			pencarian();
		}
	}

	// LAPORAN GUDANG
	static void laporanGudang() {
		char jawab;
		System.out.println("=====================================================================================================================================================");
		System.out.println("\t\t\t\t\t\t\t            LAPORAN GUDANG HONDA           \t\t\t\t\t\t");
		System.out.println("\t\t\t\t\t\t\t                GRAHA PANDAAN              \t\t\t\t\t\t");
		System.out.println("=====================================================================================================================================================");
		System.out.println("\t MERK MOBIL \t|\t JUMLAH SEKARANG \t|\t PEMASUKAN MOBIL \t|\t PENGELUARAN MOBIL \t|\t KERUSAKAN MOBIL \t");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int bar = 0; bar < lapor.length; bar++) {
			System.out.println(String.format("\t %s \t\t|\t\t %s \t\t|\t\t %s \t\t|\t\t %s \t\t|\t\t %s \t\t", merkMobil[bar], total_utama[bar], total_masuk[bar], total_keluar[bar], total_rusak[bar]));
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
		}

		System.out.print("KEMBALI KE MENU UTAMA ? [y/t] : ");
		jawab = sc.next().charAt(0);

		if (jawab == 'Y' || jawab == 'y') {
			System.out.println();
			gudang();
			menu();
		}
		else {
			System.out.println("TERIMAKASIH TELAH MENGAKSES GUDANG HONDA GRAHA PANDAAN");
		}
	}
}