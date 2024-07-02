package su.java.lambda;

public class AllowParameters {
	private String name;
	private int age;

	public AllowParameters(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "AllowParameters [name=" + name + ", age=" + age + "]";
	}
}