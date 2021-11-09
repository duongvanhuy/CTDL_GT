package ungDungCovid19;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import CSDL.NguoiDan;

import fileRead_Write.FileRead_thongTin_NguoiDan;
public class DichVu extends NguoiDan{
//	 khai báo linkedList
	private List<NguoiDan> linkedList;
//	= new LinkedList<NguoiDan>();
	private Scanner sc = new Scanner(System.in);
	private FileRead_thongTin_NguoiDan readFilePeople;
	
	 public DichVu() {
		readFilePeople = new FileRead_thongTin_NguoiDan();
		linkedList = readFilePeople.read();
//		linkedList = new FileRead_thongTin_NguoiDan();
	}
//	 khai báo đối tượng đọc file
	 

	String ten;
	String ngaySinh;
	boolean gioiTinh;
	String diaChi;
	String soCCCD;
	String soDienThoai;
	
//	contractor ghi - đọc file
//	public DichVu() {
//		readFilePeople = ;
////		đối tượng đọc file
////		linkedList  = (LinkedList<NguoiDan>) readFilePeople.read();
//	}
	
//	 0. thêm 1 số lượng người dân vào file
	public  void themMoiDemo() {
		System.out.println("Bạn muốn thêm bao nhiêu cá nhân");
		int soNguoiThemMoi = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < soNguoiThemMoi; i++) {
			System.out.println("Họ và tên");
			ten = sc.nextLine();
			System.out.println("Giới tính");
			gioiTinh =Boolean.parseBoolean(sc.nextLine());
			System.out.println("Ngày sinh");
			ngaySinh = sc.nextLine();
			System.out.println("Địa chỉ:(Tỉnh-huyện-xã- địa chỉ nhà)");
			diaChi = sc.nextLine();
			System.out.println("Số hộ chiếu/CMND/CCCD");
			soCCCD = sc.nextLine();
			System.out.println("Số điện thoại");
			soDienThoai = sc.nextLine();
			NguoiDan nguoiDan = new NguoiDan(ten, ngaySinh, gioiTinh, diaChi, soCCCD, soDienThoai);
			linkedList.add(nguoiDan);
			readFilePeople.write(linkedList);
			System.out.println("Bạn đã đăng kí thành công");
		}
	}
//	 1. Đăng kí tài khoản
	public void dangKiTaiKhoan() {
		System.out.println("Chào mừng bạn đến với cổng y tế Quốc gia");
		System.out.println("Họ và tên");
		ten = sc.nextLine();
		System.out.println("Ngày sinh");
		ngaySinh = sc.nextLine();
		System.out.println("Giới tính");
		gioiTinh = sc.nextBoolean();
		System.out.println("Địa chỉ:(Tỉnh-huyện-xã- địa chỉ nhà)");
		diaChi = sc.nextLine();
		System.out.println("Số hộ chiếu/CMND/CCCD");
		soCCCD = sc.nextLine();
		System.out.println("Số điện thoại");
		soDienThoai = sc.nextLine();
		NguoiDan nguoiDan = new NguoiDan(ten, ngaySinh, gioiTinh, diaChi, soCCCD, soDienThoai);
		linkedList.add(nguoiDan);
		readFilePeople.write(linkedList);
		System.out.println("Bạn đã đăng kí thành công");
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
	 
	 
	 
//	 đọc file
	 public void printFile() {
		 linkedList = (List<NguoiDan>) readFilePeople.read();
		 for (NguoiDan nguoiDan : linkedList) {
			System.out.printf("|%20s|%19s|%15s|%20s|%12s|%12s|", nguoiDan.ten, nguoiDan.ngaySinh,nguoiDan.gioiTinh, nguoiDan.diaChi, nguoiDan.soCCCD, nguoiDan.soDienThoai);
		}
//		 for (int i = 0; i < linkedList.size(); i++) {
//			 System.out.printf("|%20s|%19s|%15s|%20s|%12s|%12s|", linkedList.get(i).ten, linkedList.get(i).ngaySinh,linkedList.get(i).gioiTinh, linkedList.get(i).diaChi, linkedList.get(i).soCCCD, linkedList.get(i).soDienThoai);
//
//

	 }
}
