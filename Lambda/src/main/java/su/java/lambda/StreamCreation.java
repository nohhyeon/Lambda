package su.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreation {
	public static void main(String[] args) {
//설정된 배열이 지원하는 고정 크기의 리스트를 반환하여 할당한다.
		List<String> names = Arrays.asList("Java", "JDBC", "JSP", "Spring");
		long count = 0;
//순차 스트림을 생성하여 J 문자를 포함한 문자 개수를 할당한다.
		count = names.stream().filter(a -> a.contains("J")).count();
		System.out.println("대문자 J가 포함된 문자의 개수 : " + count);
//병렬 스트림을 생성하여 S 문자를 포함한 문자 개수를 할당한다.
		Stream<String> a = names.parallelStream().filter(x -> x.contains("S"));
		count = a.count();
		System.out.println("대문자 S가 포함된 문자의 개수 : " + count);
// 생성된 스트림은 재사용이 불가능하므로 예외가 발생한다.
		List<String> lists = a.collect(Collectors.toList());
		System.out.println(lists);
	}
}
