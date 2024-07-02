package su.java.lambda;

public class MemberAddress {
	private String name;
	private int age;
	private Address address;

	public MemberAddress(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Address getAddress() {
		return address;
	}
}