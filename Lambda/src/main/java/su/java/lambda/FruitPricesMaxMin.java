package su.java.lambda;

import java.util.function.BinaryOperator;

public class FruitPricesMaxMin {
	public static void main(String[] args) {
		BinaryOperator<FruitPrices> binaryOperator;
		FruitPrices fruitPrices = null;
//두 개의 int 타입을 숫자로 비교하여 int 타입의 두 피연산자에 대하여 연산을 구현하고 요소 중에 작은 요소를 반환하여 할당한다.
		binaryOperator = BinaryOperator.minBy((a, b) -> Integer.compare(a.fruitPrice, b.fruitPrice));
		fruitPrices = binaryOperator.apply(new FruitPrices("사과", 5000), new FruitPrices("포도", 9000));
		System.out.println("최소 가격의 과일 : " + fruitPrices.fruitName);
//두 개의 int 타입을 숫자로 비교하여 int 타입의 두 피연산자에 대하여 연산을 구현하고 요소 중에 큰 요소를 반환하여 할당한다.
		binaryOperator = BinaryOperator.maxBy((a, b) -> Integer.compare(a.fruitPrice, b.fruitPrice));
		fruitPrices = binaryOperator.apply(new FruitPrices("사과", 5000), new FruitPrices("포도", 9000));
		System.out.println("최대 가격의 과일 : " + fruitPrices.fruitName);
	}
}