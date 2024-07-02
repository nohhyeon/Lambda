package su.java.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {
	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//주어진 조건식과 일치하는 구성된 스트림을 반환하고 스트림의 각 요소에 대해 작업을 수행하여 출력한다.
		integers.stream().filter(i -> 9 >= i).forEach(System.out::print);
		System.out.println();
//주어진 조건식과 일치하는 구성된 스트림을 최대 크기가 3인 요소까지 반환한다.
		integers.stream().filter(i -> 9 >= i).limit(3).forEach(System.out::print);
		System.out.println();
//주어진 조건식과 일치하는 구성된 스트림의 중복된 요소를 제거하여 반환한다.
		integers.stream().filter(i -> 9 >= i).distinct().forEach(System.out::print);
		System.out.println();
//주어진 조건을 스트림의 요소에 일대일로 적용한 결과로 구성된 스트림을 반환한다.
		integers.stream().map(i -> i * i).forEach(System.out::print);
		System.out.println();
//스트림의 설정된 요소 수를 제거한 후 스트림의 나머지 요소로 구성된 스트림을 반환한다.
		integers.stream().skip(1).forEach(System.out::print);
		System.out.println();
//스트림의 요소를 누적하고 최종적으로 누적된 하나의 선택적 요소를 반환한다.
		System.out.println(integers.stream().reduce((a, b) -> a + b).get());
	}
}