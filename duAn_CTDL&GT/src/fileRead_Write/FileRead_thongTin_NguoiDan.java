package fileRead_Write;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import CSDL.NguoiDan;


public class FileRead_thongTin_NguoiDan {
//	private static final String fileName = "D:\\testFil	e\\CSDLNhanDan.txt";
	String fileName = "D:\\testFile\\CSDLNhanDan.txt";
	File file = new File(fileName);

//	 phương thức ghi vào file
	public void write(List<NguoiDan> linkedList) {
		FileOutputStream fos = null;
//   	  ghi kiểu dữ liệu nguyên thủy, đồ thị, đối tượng
		ObjectOutputStream oos = null;
//         
//         luôn đặt try - catch cho việc ghi - đọc - đóng file
		try {
			if (!file.exists()) {
				file.createNewFile();
			}
//       	  kết nối file
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);

//             ghi đối tượng vào file
			oos.writeObject(linkedList);
//             1.xuất hiện khi một file được chỉ định không tồn tại
//             2. Một file được chỉ định với đường dẫn tồn tại nhưng không thể truy xuất được vì một lý do gì đó chẳng hạn như không có quyền truy cập v.v
		} catch (FileNotFoundException e) {
//       	   giúp xác định phương thức bị lỗi ------ (theo nguyên tắc stack)
			e.printStackTrace();
//             ném (throw) ra những ngoại lệ không mong muốn có muốn catch(chụp lấy)
		} catch (IOException e) {
			e.printStackTrace();
//             nó luôn được thực thi cho dù exception(ngoại lệ) có xử lý hay không
//             nó được áp dụng cho việc đóng kết nối
		} finally {
			closeStream(oos);
			closeStream(fos);
		}
	}

//    phương thức đọc file-- đọc ra một danh sách luôn
//	@SuppressWarnings("unchecked")
	public List<NguoiDan> read() {
		List<NguoiDan> list = new ArrayList<>();
//     định nghĩa  kết nối file
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {

			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			list = (List<NguoiDan>) ois.readObject();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		finally {
			closeStream(fis);
			closeStream(ois);
		}
		return list;
	}

//    phương thức đóng file đọc
	private void closeStream(InputStream is) {
		if (is != null) {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

//    phương thức đong file ghi
	private void closeStream(OutputStream os) {
		if (os != null) {
			try {
				os.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
