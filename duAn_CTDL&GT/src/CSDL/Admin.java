package CSDL;

import java.io.Serializable;

public class Admin implements Serializable{
//	true: cơ quan, fasle: cá nhân
	public boolean caNhan_coQuan;
	public String tenCaNhan_CoQuan;
	public String maSoCongTac;
	public String matKhau;
	public String chucVu;
	public String diaChi;
	public String email;
	public String soDienThoai;
	
//
	public Admin() {
	}
	public Admin(boolean caNhan_coQuan, String tenCaNhan_CoQuan, String maSoCongTac, String matKhau, String chucVu,
			String diaChi, String email, String soDienThoai) {
		super();
		this.caNhan_coQuan = caNhan_coQuan;
		this.tenCaNhan_CoQuan = tenCaNhan_CoQuan;
		this.maSoCongTac = maSoCongTac;
		this.matKhau = matKhau;
		this.chucVu = chucVu;
		this.diaChi = diaChi;
		this.email = email;
		this.soDienThoai = soDienThoai;
	}
//	
	public boolean isCaNhan_coQuan() {
		return caNhan_coQuan;
	}
	public void setCaNhan_coQuan(boolean caNhan_coQuan) {
		this.caNhan_coQuan = caNhan_coQuan;
	}
	public String getTenCaNhan_CoQuan() {
		return tenCaNhan_CoQuan;
	}
	public void setTenCaNhan_CoQuan(String tenCaNhan_CoQuan) {
		this.tenCaNhan_CoQuan = tenCaNhan_CoQuan;
	}
	public String getMaSoCongTac() {
		return maSoCongTac;
	}
	public void setMaSoCongTac(String maSoCongTac) {
		this.maSoCongTac = maSoCongTac;
	}
	public String getMatKhau() {
		return matKhau;
	}
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String daiChi) {
		this.diaChi = daiChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	
}
