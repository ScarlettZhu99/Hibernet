package com.nagendra.com.hibernate.Task3;
import java.util.Map;

public class Emp {
	private String id;
	private String name;
	private Map<String, PhoneNumber> phoneno;

	public Emp() {
		System.out.println("Employee Object is Created");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, PhoneNumber> getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Map<String, PhoneNumber> phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", phoneno=" + phoneno + "]";
	}
}