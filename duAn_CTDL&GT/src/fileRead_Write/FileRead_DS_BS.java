package fileRead_Write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import CSDL.ThongTin_NhanVien_YTe;

public class FileRead_DS_BS {
	private static final String fileName = "D:\\testFile\\CSDL_NhanVienYTe.txt";	
	File file = new File(fileName);
//	 phương thức ghi vào file
 public void write(List<ThongTin_NhanVien_YTe> list) {
 	  FileOutputStream fos = null;
// 	  ghi kiểu dữ liệu nguyên thủy, đồ thị, đối tượng
       ObjectOutputStream oos = null;
       
//       luôn đặt try - catch cho việc ghi - đọc - đóng file
       try {
    	   if(!file.exists()) {
    		   file.createNewFile();
    	   }
//     	  kết nối file
           fos = new FileOutputStream(file);
           oos = new ObjectOutputStream(fos);
           
//           ghi đối tượng vào file
           oos.writeObject(list);
//           1.xuất hiện khi một file được chỉ định không tồn tại
//           2. Một file được chỉ định với đường dẫn tồn tại nhưng không thể truy xuất được vì một lý do gì đó chẳng hạn như không có quyền truy cập v.v
       } catch (FileNotFoundException e) {
//     	   giúp xác định phương thức bị lỗi ------ (theo nguyên tắc stack)
           e.printStackTrace();
//           ném (throw) ra những ngoại lệ không mong muốn có muốn catch(chụp lấy)
       } catch (IOException e) {
           e.printStackTrace();
//           nó luôn được thực thi cho dù exception(ngoại lệ) có xử lý hay không
//           nó được áp dụng cho việc đóng kết nối
       } finally {
           closeStream(fos);
           closeStream(oos);
       }
   }
 
//  phương thức đọc file
 public List<ThongTin_NhanVien_YTe> read() {
     List<ThongTin_NhanVien_YTe> list = new ArrayList<>();
//   định nghĩa  kết nối file
     FileInputStream fis = null;
     ObjectInputStream ois = null;
     
     
     try {
//     	kết nối file
         fis = new FileInputStream(file);
         ois = new ObjectInputStream(fis);
         
//          đọc data file
         list = (List<ThongTin_NhanVien_YTe>) ois.readObject();
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     } catch (IOException e) {
         e.printStackTrace();
     } catch (ClassNotFoundException e) {
         e.printStackTrace();
     } finally {
         closeStream(fis);
         closeStream(ois);
     }
     return list;
 }
 
//  phương thức đóng file đọc
 private void closeStream(InputStream is) {
     if (is != null) {
         try {
             is.close();
         } catch (IOException e) {
             e.printStackTrace();
         }
     }
 }
 
//  phương thức đong file ghi
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
