package CSDL;

import java.io.Serializable;

public class ThongTin_NhanVien_YTe  implements Serializable{
	 String maSo_BS;
	 String matKhau;
	 String soDienThoaiKetNoi;
	String khoa_YTe;
	 String diaChiLienHe;
	 String email;
	
	public ThongTin_NhanVien_YTe() {
		
	}
	public  ThongTin_NhanVien_YTe(String maSo_BS, String matKhau, String soDienThoaiKetNoi, String khoa_YTe,
			String diaChiLienHe, String email) {
		super();
		this.maSo_BS = maSo_BS;
		this.matKhau = matKhau;
		this.soDienThoaiKetNoi = soDienThoaiKetNoi;
		this.khoa_YTe = khoa_YTe;
		this.diaChiLienHe = diaChiLienHe;
		this.email = email;
	}
	public  String getMaSo_BS() {
		return maSo_BS;
	}
	public  void setMaSo_BS(String maSo_BS) {
		this.maSo_BS = maSo_BS;
	}
	public  String getMatKhau() {
		return matKhau;
	}
	public  void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public  String getSoDienThoaiKetNoi() {
		return soDienThoaiKetNoi;
	}
	public  void setSoDienThoaiKetNoi(String soDienThoaiKetNoi) {
		this.soDienThoaiKetNoi = soDienThoaiKetNoi;
	}
	public  String getKhoa_YTe() {
		return khoa_YTe;
	}
	public  void setKhoa_YTe(String khoa_YTe) {
		this.khoa_YTe = khoa_YTe;
	}
	public  String getDiaChiLienHe() {
		return diaChiLienHe;
	}
	public  void setDiaChiLienHe(String diaChiLienHe) {
		this.diaChiLienHe = diaChiLienHe;
	}
	public   String getEmail() {
		return email;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	
}
