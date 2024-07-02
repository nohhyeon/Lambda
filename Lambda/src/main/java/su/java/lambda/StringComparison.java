package su.java.lambda;

import java.util.function.ToIntBiFunction;

public class StringComparison {
	public static void call(int order) {
		if (order < 0) {
			System.out.println("사전순서로 먼저 나옵니다.");
		} else if (order == 0) {
			System.out.println("같은 문자열입니다.");
		} else {
			System.out.println("사전순서로 나중에 나옵니다.");
		}
	}

	public static void main(String[] args) {
//두 개의 매개 변수를 받아들이고 int 타입의 결과를 생성하는 기능을 구현한다.
		ToIntBiFunction<String, String> toIntBiFunction;
//대소문자의 차이를 무시하고 사전순서로 두 문자열을 비교하여 할당한다.
		toIntBiFunction = (a, b) -> a.compareToIgnoreCase(b); // 객체 타입의 매개 변수를 int 타입처럼 적용한다.
		call(toIntBiFunction.applyAsInt("JAVA", "Java"));
	}
}
