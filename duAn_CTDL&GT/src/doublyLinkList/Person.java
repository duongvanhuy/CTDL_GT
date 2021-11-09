package doublyLinkList;

import java.util.LinkedList;
import java.util.List;

public class Person {
	String name;
	String diaChi;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	int tuoi;
	Person(String name, String diaChi, int tuoi){
		this.name = name;
		this.diaChi = diaChi;
		this.tuoi = tuoi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}
}
