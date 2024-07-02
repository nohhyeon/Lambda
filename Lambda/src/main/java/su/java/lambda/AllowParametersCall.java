package su.java.lambda;

import java.util.function.BiFunction;

public class AllowParametersCall {
	public static void main(String[] args) {
//생성자 참조로 매개 변수를 할당하고 두 개의 매개 변수를 받아들이고 결과를 생성하는 기능을 구현한다.
		BiFunction<String, Integer, AllowParameters> biFunction = AllowParameters::new; // 기능을 주어진 매개 변수에 적용한다.
		AllowParameters allowParameters = biFunction.apply("홍길동", 33);
		System.out.println("두 개의 매개 변수 적용 : " + allowParameters);
	}
}