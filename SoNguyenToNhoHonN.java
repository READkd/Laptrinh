package sohoc;

import java.util.Scanner;

public class SoNguyenToNhoHonN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Xin moi ban nhap so ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("Cac so nguyen to nho hon n la:  ");
		if (n >=2) {
		 System.out.print(2);
		}
		for (int i = 3; i < n; i+=2) {
			if (isPrimeNumber(i)) {
				System.out.print(" " + i);
			}
		}
	}
	public static boolean isPrimeNumber(int n) {
		if (n < 2) {
			return false;
		}
		for (int i =2; i < n; i++) {
			if (n % i ==0) {
		}
	}
		return true;
}
}