package model;

public abstract class DanhMuc {
	protected String maSach;
	protected String tenNXB;
	protected int NXB;
	protected int soTrang;
	protected double giaBan;
	protected int soLuong;

	public abstract double tinhThanhTien();

	public DanhMuc(String maSach, String tenNXB, int NXB, int soTrang, double giaBan, int soLuong) {
		this.maSach = maSach;
		this.tenNXB = tenNXB;
		this.NXB = NXB;
		this.soTrang = soTrang;
		this.giaBan = giaBan;
		this.soLuong = soLuong;
	}

	public DanhMuc() {
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getTenNXB() {
		return tenNXB;
	}

	public void setTenNXB(String tenNXB) {
		this.tenNXB = tenNXB;
	}

	public int getNXB() {
		return NXB;
	}

	public void setNXB(int NXB) {
		this.NXB = NXB;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Override
	public String toString() {
		return "maSach=" + maSach + ", tenNXB=" + tenNXB + ", NXB=" + NXB + ", soTrang=" + soTrang + ", giaBan="
				+ giaBan + ", soLuong=" + soLuong + "  ";
	}
}
