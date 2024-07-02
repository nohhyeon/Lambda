package su.java.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerFunction {
	public static void main(String[] args) { // String 클래스 타입 매개 변수를 수행한다.
		Consumer<String> consumer = t -> {
			System.out.println(t + "8");
		};
		consumer.accept("자바 ");
// String 클래스 타입 매개 변수를 반환한다.
		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println(t + u);
		};
		biConsumer.accept("자바 ", "8");
// double 타입 매개 변수를 반환한다.
		DoubleConsumer doubleConsumer = d -> {
			System.out.println("자바 " + d);
		};
		doubleConsumer.accept(8.0);
//String 클래스 타입 매개 변수와 int 타입 매개 변수를 수행한다.
		ObjIntConsumer<String> objIntConsumer = (t, i) -> {
			System.out.println(t + i);
		};
		objIntConsumer.accept("자바 ", 8);
	}
}
