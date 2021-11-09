package doublyLinkList;

import java.util.LinkedList;
import java.util.List;

public class run {
	
	public static void main(String[] args) {
		Person person = new Person("Huy", "QB", 17);
		DoublyLinkedList doublyList = new DoublyLinkedList();
		doublyList.addNode(person);
		
		
		doublyList.printList();
		
		
//		List<Person> list;
//		DoublyLinkedList listDS = new DoublyLinkedList();
		
//		listDS.addNode(person);
//		 danh sách node
//		list = (List<Person>) listDS.printList();
//		for (Person person1 : list) {
//			System.out.println(person1.name);
//			System.out.println(person1.diaChi);
//		}
//		for (Person person1 : list) {
//			if("Huy".equalsIgnoreCase(person1.name)) {
//				System.out.println("Tìm thấy");
//				break;
//			}
//			System.out.println("Không");
//		}
//		list = (List<Person>) listDS.timKiemNode("Huy");
//		System.out.println(list.get(0));
	}

}
