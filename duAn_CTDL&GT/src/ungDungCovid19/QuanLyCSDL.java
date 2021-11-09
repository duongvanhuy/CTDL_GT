package ungDungCovid19;

import java.util.*;

import CSDL.Admin;
import CSDL.NguoiDan;
import CSDL.ThongTin_NhanVien_YTe;
import fileRead_Write.FileRead_thongTin_CSDL;
import fileRead_Write.FileRead_thongTin_NguoiDan;


public class QuanLyCSDL extends Admin {
//	 khai báo linkedList
	private LinkedList<Admin> linkedList;
	private Scanner sc = new Scanner(System.in);
//	 khai báo đối tượng đọc file
	private FileRead_thongTin_CSDL readFilePeople;

	boolean caNhan_coQuan;
	String tenCaNhan_CoQuan;
    String maSoCongTac;
	String matKhau;
	String chucVu;
	String diaChi;
	String email;
	String soDienThoai;
	
//	contractor ghi - đọc file
	public QuanLyCSDL() {
		readFilePeople = new FileRead_thongTin_CSDL();
//		đối tượng đọc file
		linkedList = (LinkedList<Admin>) readFilePeople.read();
	}
	
//	 0. thêm  số lượng cá nhân, ban nghành có thẩm quyền vào file
	public  void themMoi_caNhan_coQuanToChuc() {
		System.out.println("Bạn muốn thêm bao nhiêu cá nhân");
		int soNguoiThemMoi = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < soNguoiThemMoi; i++) {
			System.out.println("Bạn là cá nhân hay cơ quan tổ chức");
			caNhan_coQuan = Boolean.parseBoolean(sc.nextLine());
			System.out.println("Tên cá nhân/tổ chức cơ quan");
			tenCaNhan_CoQuan = sc.nextLine();
			System.out.println("Mã số công tác");
			maSoCongTac = sc.nextLine();
			System.out.println("Mật khẩu");
			matKhau = sc.nextLine();
			System.out.println("Chức vụ");
			chucVu = sc.nextLine();
			System.out.println("Địa chỉ(Tỉnh/TP- Quận/huyện- xã/phường-số nhà");
			diaChi = sc.nextLine();
			System.out.println("Email liên hệ");
			email = sc.nextLine();
			System.out.println("Số điện thoại liên hệ");
			soDienThoai = sc.nextLine();
			Admin admin = new Admin(caNhan_coQuan, tenCaNhan_CoQuan, maSoCongTac, matKhau, chucVu, diaChi,email,soDienThoai);
			linkedList.add(admin);
			readFilePeople.write(linkedList);
			System.out.println("Bạn đã đăng kí thành công");
		}
	}
//	2. Dich vụ chăm sóc y tế
	 public void dichVuChamSocYTe(int maDichVu) {
		 
	 }
//	 2.1 Tìm kiếm bác sĩ
	 public int timKiemBacSi() {
		 return 0;
	 }
//	 2.1....
	 public void timKiemBS() {
		 
	 }
//	 3. 

}
