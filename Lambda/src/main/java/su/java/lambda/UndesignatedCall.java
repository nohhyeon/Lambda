package su.java.lambda;

public class UndesignatedCall {
	public static void main(String[] args) { // 익명 구현 인스턴스를 선언한다.
		Undesignated undesignated = () -> {
			String string = "매개 변수 없는 추상 메서드를 호출한다.";
			System.out.println(string);
		};
		undesignated.call();
	}
}
