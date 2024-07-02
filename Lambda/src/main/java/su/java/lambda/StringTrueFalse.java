package su.java.lambda;

import java.util.function.Predicate;

public class StringTrueFalse {
	public static void main(String[] args) {
//하나의 매개 변수에 대한 조건자인 boolean 타입으로 테스트 기능을 구현한다.
		Predicate<String> predicate;
//null 매개 변수가 같은지 테스트하는 조건자를 반환한다.
		predicate = Predicate.isEqual(null); // 주어진 null 매개 변수를 테스트한다.
		System.out.println("null과 null 비교 : " + predicate.test(null)); // Java 매개 변수가 같은지 테스트하는 조건자를 반환한다.
		predicate = Predicate.isEqual("Java"); // 주어진 null 매개 변수를 테스트한다.
		System.out.println("Java와 null 비교 : " + predicate.test(null)); // null 매개 변수가 같은지 테스트하는 조건자를 반환한다.
		predicate = Predicate.isEqual(null); // 주어진 Java 매개 변수를 테스트한다.
		System.out.println("null과 Java 비교 : " + predicate.test("Java")); // Java 매개 변수가 같은지 테스트하는 조건자를 반환한다.
		predicate = Predicate.isEqual("Java"); // 주어진 Java 매개 변수를 테스트한다.
		System.out.println("Java와 Java 비교 : " + predicate.test("Java"));
	}
}