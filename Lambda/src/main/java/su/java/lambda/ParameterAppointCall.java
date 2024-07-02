package su.java.lambda;

public class ParameterAppointCall {
	public static void main(String[] args) { // 익명 구현 인스턴스를 선언한다.
		ParameterAppoint parameterAppoint = a -> {
			System.out.println("매개 변숫값 : " + a);
			return a;
		};
		parameterAppoint.call(4);
	}
}
