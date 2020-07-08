import java.util.Scanner;

public class Main {

	public static double a, b;
	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int pilihan;

		do {

			tampilkanMenu();
			pilihan = ambilInteger();

			if (pilihan == 1) {
				tampilkanInput();
				Tambah nilai = new Tambah();
				nilai.aritmatika(a, b);
				System.out.println(a + " + " + b + " = " + nilai.getHasil());

			} else if (pilihan == 2) {
				tampilkanInput();
				Kurang nilai = new Kurang();
				nilai.aritmatika(a, b);
				System.out.println(a + " - " + b + " = " + nilai.getHasil());

			} else if (pilihan == 3) {
				tampilkanInput();
				Kali nilai = new Kali();
				nilai.aritmatika(a, b);
				System.out.println(a + " x " + b + " = " + nilai.getHasil());

			} else if (pilihan == 4) {
				tampilkanInput();
				Bagi nilai = new Bagi();
				nilai.aritmatika(a, b);
				System.out.println(a + " / " + b + " = " + nilai.getHasil());
			} else if (pilihan == 5) {
				System.exit(0);
			}

		} while (true);

	}

	public static void tampilkanMenu() {
		System.out.println("Aplikasi Kalkulator");
		System.out.println("1. Perjumlahan ");
		System.out.println("2. Perkurangan ");
		System.out.println("3. Perkalian ");
		System.out.println("4. Pembagian ");
		System.out.println("5. Keluar");
	}

	public static void tampilkanInput() {
		System.out.println("Input Nilai A = ");
		a = ambilDouble();
		System.out.println("Input Nilai B = ");
		b = ambilDouble();
	}
	
	public static int ambilInteger() {
		while (true) {
			try {
				return input.nextInt();
			} catch (Exception e) {
				input.next();
				System.out.println("Silakan masukkan bilangan bertipe integer .");
			}
		}
	}
	
	public static double ambilDouble() {
		while (true) {
			try {
				return input.nextDouble();
			} catch (Exception e) {
				input.next();
				System.out.println("Silakan masukkan bilangan bertipe double atau integer.");
			}
		}
	}

}
