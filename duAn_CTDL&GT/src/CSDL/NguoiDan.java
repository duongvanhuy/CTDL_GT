package CSDL;

import java.io.Serializable;

public class NguoiDan implements Serializable{

	//	
	public String ten;
	public String ngaySinh;
	public boolean gioiTinh;
	public String diaChi;
	public String soCCCD;
	@Override
	public String toString() {
		return "NguoiDan [ten=" + ten + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi
				+ ", soCCCD=" + soCCCD + ", soDienThoai=" + soDienThoai + "]";
	}
	public String soDienThoai;
	
//	
	public NguoiDan() {
	}
	public NguoiDan(String ten, String ngaySinh, boolean gioiTinh, String diaChi, String soCCCD, String soDienThoai) {
		super();
		this.ten = ten;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.soCCCD = soCCCD;
		this.soDienThoai = soDienThoai;
	}
	
//	
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getSoCCCD() {
		return soCCCD;
	}
	public void setSoCCCD(String soCCCD) {
		this.soCCCD = soCCCD;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
	
}
