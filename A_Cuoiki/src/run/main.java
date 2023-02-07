package run;

import controller.DanhMucSach;
import java.util.Scanner;
import model.DanhMuc;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DanhMucSach DM = new DanhMucSach();
		String fname = "D:\\Workspace\\A_Cuoiki\\src\\run\\FileDanhMuc.txt";

		int option = 0;
		do {
			System.out.println("0. exit");
			System.out.println("1. nhap giao khoa");
			System.out.println("2. nhap tieu thuyet");
			System.out.println("3. in ");
			System.out.println("4. doc file");
			System.out.println("5. viet file");
			System.out.println("6. xoa 1 ma : ");
			System.out.println("7. tim sach co gia max lon nhat theo tung loai");
			System.out.println("lua chon option : ");
			option = sc.nextInt();

			switch (option) {
			case 0:
				System.exit(0);
				break;
			case 1:
				DM.nhapSGK();
				break;
			case 2:
				DM.nhapSTT();
				break;
			case 3:
				DM.output();
				break;
			case 4:
				DM.read(fname);
				break;
			case 5:
				DM.write(fname);
				break;
			case 6:
				DM.delete();
				break;
			case 7:
				DM.maxGiaGiaoKhoa();
				DM.maxGiaTieuThuyet();
				break;
			default:
				throw new AssertionError();
			}
		} while (option != 0);
	}
}
