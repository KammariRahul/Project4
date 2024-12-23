package com.rahul;


class student{
	int id;
	String name;
	int fee;
	String address;
	String college;
	public student(int id, String name, int fee, String address, String college) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
		this.address = address;
		this.college = college;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", fee=" + fee + ", address=" + address + ", college=" + college
				+ "]";
	}
	
}
public class test {

	public static void main(String[] args) {
		student s1 = new student(01,"Rahul",500000,"HYD","SPEC");
		System.out.println(s1);

	}

}
