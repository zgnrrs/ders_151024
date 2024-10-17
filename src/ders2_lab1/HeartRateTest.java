package ders2_lab1;

import java.util.Scanner;

public class HeartRateTest {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Adinizi giriniz: ");
		String ad = input.nextLine();
		System.out.print("dogum yilinizi giriniz: ");
		int yil = input.nextInt();
		
		HeartRate h1 = new HeartRate(ad, yil);
		h1.show();

	}

}
