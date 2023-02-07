package model;

public class SachGiaoKhoa extends DanhMuc {

	protected int khoiLop;

	public SachGiaoKhoa(int khoiLop, String maSach, String tenNXB, int NXB, int soTrang, double giaBan, int soLuong) {
		super(maSach, tenNXB, NXB, soTrang, giaBan, soLuong);
		this.khoiLop = khoiLop;
	}

	public SachGiaoKhoa() {
	}

	public SachGiaoKhoa(int khoiLop) {
		this.khoiLop = khoiLop;
	}

	public int getKhoiLop() {
		return khoiLop;
	}

	public void setKhoiLop(int khoiLop) {
		this.khoiLop = khoiLop;
	}

	@Override
	public double tinhThanhTien() {
		double sum = 0;
		sum = soLuong * giaBan * 0.7;
		return sum;
	}

	@Override
	public String toString() {
		return "SachGiaoKhoa{" + super.toString() + "khoiLop=" + khoiLop + '}';
	}

}
