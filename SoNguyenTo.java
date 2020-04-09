package sohoc;

public class SoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cac so nguyen to nho hon 100 la: ");
		for(int i = 0;i < 100; i++) {
			if (kiemTra(i) == true) {
			System.out.print(i + " ");	
			}
		}
	}
	public static boolean kiemTra (int n) {
	if ( n < 2) {
		return false;
	}
		for (int i = 2; i < n ; i++) {
			if (n % i == 0) {
		return false;
			}
		}
		return true;
	}
	}

	
