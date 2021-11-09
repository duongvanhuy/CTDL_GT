package doublyLinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// tạo Node
class Node{
	Person data;
	Node prev, next;
	Node(Person data){
		this.data = data;
		prev = next = null;
	}
}


// Doubly Liked List
public class DoublyLinkedList extends Person{
	public Node head, temp;
	
	public DoublyLinkedList() {
		head = temp = null;
	}
//	kiểm tra linkedList có rỗng không
	public boolean isNull() {
		if(head == null)
			return true;
		else
			return false;
	}
//	them Node
	public void addNode(Person key) {
		Node newNode = new Node(key);
//		temp = head;
		
		//thêm vào cuối 
		newNode.next = null;
		
		if(isNull()) {
			 head = newNode;
			 newNode.prev = null;
		}else {
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.prev = temp;
		}
	}
//	tìm Kiếm Node
	public Person timKiemNode(String maSo) {
//		 tạo ra đối tượng để lưu lại 1 Node trả về
		Person person = new Person();
		boolean  check = true;
		
		if(head == null) {
			System.out.println("Không tìm thấy Node");
			return null;
		}
		
		
		while(head != null) {
			if(maSo.equalsIgnoreCase(head.data.getName())) {
				person = head.data;
				check = true;
				return person;
				
			}
			head = head.next;
			check = false;
		}
		if(!check) {
			System.out.println("Không tìm thấy");
			return person;
		}
		return person;
	}
//	xóa
//	sắp xêp
	public Node sapXep() {
		return null;
	}
//	 in ra màn hình
//	public List<Person> printList() {
//		System.out.println("Danh sách: ");
//		if(isNull()) {
//			System.out.println("Trống");
//			return null;
//		}
//		
//		
//		List<Person> list = new ArrayList<>();
//		while(head != null) {
//			list.add(head.data);
//			head = head.next;
//		}
//		return list;
//		
//	}
	public void printList() {
		System.out.println("Danh sách: ");
		if(isNull()) {
			System.out.println("Trống");
			return;
		}
		while(head != null) {
			System.out.println(head.data.getName());
			System.out.println(head.data.getDiaChi());
			System.out.println(head.data.getTuoi());
			head = head.next;
		}
		
	}
}
