package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.DanhMuc;
import model.SachGiaoKhoa;
import model.SachTieuThuyet;

public class DanhMucSach {
	public ArrayList<DanhMuc> DM = new ArrayList<>();
	public ArrayList<SachGiaoKhoa> SGK = new ArrayList<>();
	public ArrayList<SachTieuThuyet> STT = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public void nhapSGK() {
		sc.nextLine();
		SachGiaoKhoa gk = new SachGiaoKhoa();
		System.out.println("nhap ma sach : ");
		gk.setMaSach(sc.nextLine());
		System.out.println("nhap ten nha xuat ban :");
		gk.setTenNXB(sc.nextLine());
		System.out.println("nhap nam xuat ban : ");
		gk.setNXB(sc.nextInt());
		sc.nextLine();
		System.out.println("nhap so trang : ");
		gk.setSoTrang(sc.nextInt());
		System.out.println("nhap gia ban : ");
		gk.setGiaBan(sc.nextDouble());
		System.out.println("nhap so luong : ");
		gk.setSoLuong(sc.nextInt());
		System.out.println("nhap khoi lop : ");
		gk.setKhoiLop(sc.nextInt());
		gk.tinhThanhTien();
		SGK.add(gk);
		DM.add(gk);
	}

	public void nhapSTT() {
		sc.nextLine();
		SachTieuThuyet tt = new SachTieuThuyet();
		System.out.println("nhap ma sach : ");
		tt.setMaSach(sc.nextLine());
		System.out.println("nhap ten nha xuat ban :");
		tt.setTenNXB(sc.nextLine());
		System.out.println("nhap nam xuat ban : ");
		tt.setNXB(sc.nextInt());
		sc.nextLine();
		System.out.println("nhap so trang : ");
		tt.setSoTrang(sc.nextInt());
		System.out.println("nhap gia ban : ");
		tt.setGiaBan(sc.nextDouble());
		System.out.println("nhap so luong : ");
		tt.setSoLuong(sc.nextInt());
		sc.nextLine();
		System.out.println("nhap the loai : ");
		tt.setTheLoai(sc.nextLine());
		tt.tinhThanhTien();
		STT.add(tt);
		DM.add(tt);
	}

	public void read(String fname) {
		IOFile.readFile(fname);
	}

	public void write(String fname) {
		IOFile.writeFile(fname, DM);
	}

	public void delete() {
		int count = 0;
		System.out.println("nhap ma muon xoa : ");
		String maXoa = sc.nextLine();
		for (int i = 0; i < DM.size(); i++) {
			if (DM.get(i).getMaSach().equalsIgnoreCase(maXoa)) {
				DM.remove(DM.get(i));
				System.out.println("xoa thanh cong !");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("khong tim thay ma " + maXoa + " trong danh muc hoa don. ");
		}

	}

	public void output() {
		for (DanhMuc o : DM) {
			System.out.println(o);

		}
	}

	public void maxGiaGiaoKhoa() {
		double maxGiaBan = SGK.get(0).getGiaBan();
		for (int i = 1; i < SGK.size(); i++) {
			if (maxGiaBan < SGK.get(i).getGiaBan()) {
				maxGiaBan = SGK.get(i).getGiaBan();
			}
		}
		System.out.println("gia ban cao nhat cua sach giao khoa la : " + maxGiaBan);

	}

	public void maxGiaTieuThuyet() {
		double maxGiaBan = STT.get(0).getGiaBan();
		for (int i = 1; i < STT.size(); i++) {
			if (maxGiaBan < STT.get(i).getGiaBan()) {
				maxGiaBan = STT.get(i).getGiaBan();
			}
		}
		System.out.println("gia ban cao nhat cua sach tieu thuyet la : " + maxGiaBan);
	}

	@Override
	public String toString() {
		return "DanhMucSach{" + super.toString() + "DM=" + DM;
	}

}
