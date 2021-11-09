package ungDungCovid19;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import CSDL.Admin;
import CSDL.NguoiDan;
import CSDL.ThongTin_NhanVien_YTe;
import fileRead_Write.FileRead_DS_BS;
import fileRead_Write.FileRead_thongTin_CSDL;

public class ChamSocYTe {
//	 khai báo linkedList
	private List<ThongTin_NhanVien_YTe> linkedList;
	private Scanner sc = new Scanner(System.in);
//	 khai báo đối tượng đọc file
	private FileRead_DS_BS readFilePeople;

	String maSo_BS;
	String matKhau;
	String soDienThoaiKetNoi;
	String khoa_YTe;
	String diaChiLienHe;
	String email;

//	contractor ghi - đọc file
	public ChamSocYTe() {
		readFilePeople = new FileRead_DS_BS();
//		đối tượng đọc file
		linkedList = (List<ThongTin_NhanVien_YTe>) readFilePeople.read();
	}
//	chức năng
	public int chonChucNang() {
		int chon;
		System.out.println("Mời bạn lựa chọn chức năng");
		System.out.println("Chọn 1: Thêm nhân viên y tế vào hệ thống");
		System.out.println("Chọn 2: Xóa nhân viên y tế khỏi hệ thống");
		System.out.println("Chọn 3: Chỉnh sửa thông tin nhân viên y tế");
		System.out.println("Chọn 4: Sắp xếp danh sách nhân viên y tế theo mã công tác");
		System.out.println("Chọn 5: Tìm kiếm nhân viên y tế theo mã công tác");
//		 cần xem xét thêm
		System.out.println("Chọn 6: Thống kê những nhân viên y tế nào hoạt động theo chuẩn thời gian đặt ra");
		System.out.println("Chọn 7: Thông tin nhân viên y tế có thời gian hoặt động lớn nhất");
		System.out.println("Chọn 8: Thông tin nhân viên y tế có thời gian hoạt động ít nhất");
		System.out.println("Chọn 0 để thoát khỏi tác vụ");
		System.out.println("Mời bạn chọn");
		chon = sc.nextInt();
		return chon;
	}
//	 0. thêm  số lượng nhân viên y tế vào file
	public void themMoi_caNhan_coQuanToChuc() {
		System.out.println("Bạn muốn thêm bao nhiêu nhân viên y tế");
		int soNguoiThemMoi = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < soNguoiThemMoi; i++) {
			System.out.println("Mã số công tác");
			maSo_BS = sc.nextLine();
			System.out.println("Mật khẩu");
			matKhau = sc.nextLine();
			System.out.println("soDienThoaiKetNoi");
			soDienThoaiKetNoi = sc.nextLine();
			System.out.println("Bạn thuộc chuyên nghành/khoa nào");
			khoa_YTe = sc.nextLine();
			System.out.println("Địa chỉ liên hệ(Tỉnh/TP- Quận/huyện- xã/phường-số nhà)");
			diaChiLienHe = sc.nextLine();
			System.out.println("Email liên hệ");
			email = sc.nextLine();
			ThongTin_NhanVien_YTe nhanVien_yTe = new ThongTin_NhanVien_YTe(maSo_BS, matKhau, soDienThoaiKetNoi,
					khoa_YTe, diaChiLienHe, email);
			linkedList.add(nhanVien_yTe);
			readFilePeople.write(linkedList);
			System.out.println("Bạn đã đăng kí thành công");
		}
	}

//	chức năng
	public void xoa_BS() {
		linkedList = readFilePeople.read();
		boolean count = true;
		String check;
		System.out.println("Nhập mã số nhân viên y tế cần xóa");
		String maSo = sc.nextLine();
		for (int i = 0; i < linkedList.size(); i++) {
			if (maSo.equalsIgnoreCase(linkedList.get(i).getMaSo_BS())) {
				System.out.println(
						"Bạn có muốn xóa nhân viên có mã số: " + linkedList.get(i).getMaSo_BS() + " ra khỏi danh sách");
				System.out.println("Nhập Yes để xác nhận có hoặc chọn phím kì để hủy tác vụ");
				check = sc.nextLine();
				if (check.equalsIgnoreCase("Yes")) {
					linkedList.remove(i);
					readFilePeople.write(linkedList);
					count = false;
				} else {
					System.out.println("Tác vụ không thành công");
					return;
				}
			}
		}
		if (!count) {
			System.out.println("Không tìm thấy mã bạn cần xóa");
		}
	}
//	II chỉnh sửa
	public void chinhSuaTT() {
		linkedList = readFilePeople.read();
		System.out.println("Mời bạn nhập mã số nhân viên y tế cần thay đổi thông tin!!!");
		String maSo = sc.nextLine();
		String check;
		int thongTinThayDoi;
		for (int i = 0; i < linkedList.size(); i++) {
			if (maSo.equalsIgnoreCase(linkedList.get(i).getMaSo_BS())) {
				System.out.println("Bạn có muốn thay đổi nhân viên y tế có mã số: " + maSo);
				System.out.println("Vui lòng nhập 'Yes' để xác nhận hoặc chọn phím bất kì để thoát khỏi tác vụ");
				check = sc.nextLine();
				if (check.equalsIgnoreCase("Yes")) {
					checkThayDoi(i);
				}
			}
		}
	}
// II
	public int thayDoiTT() {
		int chon;
		//		Bạn muốn thay đổi thông tin gì
		System.out.println("bạn muốn thay đổi thông tin gì");
		System.out.println("Chọn 1 để thay đổi mã số công tác");
		System.out.println("Chọn 2 để thay đổi mật khẩu");
		System.out.println("Chọn 3 để thay đổi khoa/chuyên nghành công tác");
		System.out.println("Chọn 4 để thay đổi địa chỉ liên hệ");
		System.out.println("Chọn 5 để thay đổi số điện thoại liên hệ");
		System.out.println("Chọn 6 để thay đổi email liên hệ");
		System.out.println("Chọn 0 để thoát khỏi tác vụ");
		System.out.println("Mời bạn chọn");
		chon = sc.nextInt();
		return chon;
	}

//	II
	//	i: vị trí cảu đối tượng cần thay đổi
	public void checkThayDoi(int i) {
		thayDoiTT();
		int check = thayDoiTT();
//		String ttCanThayDoi = null;
		switch (check) {

		
//		 thay đổi mã số công tác
		case 1:
			boolean checkMS;
//			kiểm tả mã số thay đổi không được trùng với mã số có trong danh sách
//			 nhập lại cho đến khi nào đúng thì thôi
			do {
				System.out.println("Mời bạn nhập lại mã số mới");
				maSo_BS = sc.nextLine();
				checkMS =checkMaSo(maSo_BS);
			} while (!checkMS);

			linkedList.get(i).setMaSo_BS(maSo_BS);
//			 sau khi chỉnh sửa xong thì ghi lại vào file
			readFilePeople.write(linkedList);
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 0:
			break;
		default:
			System.err.println("Không hợp lệ");
			break;
		}

	}
//	 kiểm tra mã số không được trùng
	public boolean checkMaSo(String maSo) {
		for (int i = 0; i < linkedList.size(); i++) {
			if(maSo.equalsIgnoreCase(linkedList.get(i).getMaSo_BS())) {
				System.out.println("Mã số công tác không được trùng");
				return false;
			}
			
		}
		return true;
	}

	public void sapXep_Theo_maSo() {

	}

	public void hienThiTT() {

	}

	public void timKiem_BS_maSo() {

	}

//	có rảnh không/ onl không
	public void timKiem_BS_trangThai() {

	}

	public void timKiem_BS_khoa() {

	}

//	 hoạt động nhiều nhất
	public void thongKe_BS_MaxTime() {

	}

//	 hoạt động ít nhất
	public void thongKe_BS_MinTime() {

	}

	public void printFile() {
		linkedList = (List<ThongTin_NhanVien_YTe>) readFilePeople.read();
		for (ThongTin_NhanVien_YTe nvYTe : linkedList) {
			System.out.printf("|%20s|%19s|%15s|%20s|%12s|%12s|", nvYTe.getMaSo_BS(), nvYTe.getKhoa_YTe(),
					nvYTe.getDiaChiLienHe(), nvYTe.getEmail(), nvYTe.getSoDienThoaiKetNoi());
		}
//		 for (int i = 0; i < linkedList.size(); i++) {
//			 System.out.printf("|%20s|%19s|%15s|%20s|%12s|%12s|", linkedList.get(i).ten, linkedList.get(i).ngaySinh,linkedList.get(i).gioiTinh, linkedList.get(i).diaChi, linkedList.get(i).soCCCD, linkedList.get(i).soDienThoai);
//
//

	}
}
