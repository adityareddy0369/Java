package java8;

import java.util.List;

public class Customer {
	int id;
	String name;
	String mail;
	List<String> phoneNums;
	
	
	public Customer(int id, String name, String mail, List<String> phoneNums) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.phoneNums = phoneNums;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public List<String> getPhoneNums() {
		return phoneNums;
	}
	public void setPhoneNums(List<String> phoneNums) {
		this.phoneNums = phoneNums;
	}
	
	
}
