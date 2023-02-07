package model;

public class SachTieuThuyet extends DanhMuc {

	protected String theLoai;

	public SachTieuThuyet(String theLoai, String maSach, String tenNXB, int NXB, int soTrang, double giaBan,
			int soLuong) {
		super(maSach, tenNXB, NXB, soTrang, giaBan, soLuong);
		this.theLoai = theLoai;
	}

	public SachTieuThuyet() {
	}

	public SachTieuThuyet(String theLoai) {
		this.theLoai = theLoai;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	@Override
	public String toString() {
		return "SachTieuThuyet{" + super.toString() + "theLoai=" + theLoai + '}';
	}

	@Override
	public double tinhThanhTien() {
		double sum = 0;
		sum = soLuong * giaBan * 0.8;
		return sum;
	}

}
