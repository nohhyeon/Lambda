package su.java.lambda;

public class MemberCommand {
	private String name;
	private int age;

	public MemberCommand(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}