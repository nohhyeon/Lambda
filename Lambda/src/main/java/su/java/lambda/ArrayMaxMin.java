package su.java.lambda;

import java.util.function.IntBinaryOperator;

public class ArrayMaxMin {
	private static int[] scores = { 100, 92, 81, 78, 88, 96, 55, 94 };

//call 스테틱 메서드의 매개 변수로 두 개의 int 타입 피연산자에 대한 연산을 구현하고 int 타입의 결과를 생성한다.
	public static int call(IntBinaryOperator intBinaryOperator) {
//scores 배열에서부터 0번째 값이라는 의미로 scores 배열로부터 int 타입만큼 한번 이동한 값이라는 의미가 된다.
		int result = scores[0];
		for (int score : scores) {
// 연산자를 설정된 int 타입 피연산자에 적용한다.
			result = intBinaryOperator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {
		int max = call((a, b) -> {
			if (a >= b) {
				return a;
			} else {
				return b;
			}
		});

		System.out.println("최댓값 : " + max);
		int min = call((a, b) -> {
			if (a <= b) {
				return a;
			} else {
				return b;
			}
		});
		{

			System.out.println("최솟값 : " + min);
		}
	}
}