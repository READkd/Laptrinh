package sohoc;

public class SoChinhPhuongNhoHonN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Cac so chinh phuong nho hon 100 la: ");
		for(int i = 0;i < 100; i++) {
			if(kiemTra(i)) {
			System.out.print(i + " ");	
		}
	}
	}
	public static boolean kiemTra (int n) {
		int temp = (int)Math.sqrt(n);
		if (temp* temp== n) {
			return true;
		}
		else {
			return false;
		}
	}
}