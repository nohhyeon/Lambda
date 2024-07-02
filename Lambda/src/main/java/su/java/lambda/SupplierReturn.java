package su.java.lambda;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierReturn {
	public static void main(String[] args) { // 객체 타입의 결과에 대한 반환을 구현한다.
		Supplier<?> supplier = () -> {
			String name = "홍길동";
// String 클래스 타입을 반환한다.
			return name;
		};
// int 타입의 결과에 대한 반환을 구현한다.
		IntSupplier intSupplier = () -> {
//1을 더하여 값의 범위가 1부터 100 사이의 의사 난수를 발생시킨다.
			int age = (int) (Math.random() * 100) + 1; // int 타입을 반환한다.
			return age;
		};
// 객체의 결과를 가져와서 할당한다.
		String name = (String) supplier.get();
		System.out.println("이름 : " + name);
// int 타입의 결과를 가져와서 할당한다.
		int age = intSupplier.getAsInt();
		System.out.println("나이 : " + age);
	}
}