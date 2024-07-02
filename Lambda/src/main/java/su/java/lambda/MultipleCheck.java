package su.java.lambda;

import java.util.function.IntPredicate;

public class MultipleCheck {
	public static void main(String[] args) {
//2의 배수를 설정하고 하나의 int 타입 매개 변수에 대한 조건자인 boolean 타입으로 테스트 기능을 구현한다.
		IntPredicate intPredicateA = a -> a % 2 == 0;
//3의 배수를 설정하고 하나의 int 타입 매개 변수에 대한 조건자인 boolean 타입으로 테스트 기능을 구현한다.
		IntPredicate intPredicateB = b -> b % 3 == 0;
		boolean result;
//AND 연산을 구현하고 하나의 int 타입 매개 변수에 대한 조건자인 boolean 타입으로 테스트 기능을 구현한다.
		IntPredicate intPredicateAB = intPredicateA.and(intPredicateB); // 주어진 매개 변수인 9를 테스트하고 할당한다.
		result = intPredicateAB.test(9);
		System.out.println("9는 2와 3의 배수입니까? " + result);
//OR 연산을 구현하고 하나의 int 타입 매개 변수에 대한 조건자인 boolean 타입으로 테스트 기능을 구현한다.
		intPredicateAB = intPredicateA.or(intPredicateB); // 주어진 매개 변수인 9를 테스트하고 할당한다.
		result = intPredicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수입니까? " + result);
//논리적 부정을 구현하고 하나의 int 타입 매개 변수에 대한 조건자인 boolean 타입으로 테스트 기능을 구현한다.
		intPredicateAB = intPredicateA.negate(); // 주어진 매개 변수인 9를 테스트하고 할당한다.
		result = intPredicateAB.test(9);
		System.out.println("9는 홀수입니까? " + result);
	}
}