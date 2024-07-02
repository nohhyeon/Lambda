package su.java.lambda;

import java.util.function.Consumer;

public class ConsumerConnections {
	public static void main(String[] args) {
		Consumer<MemberCommand> consumerA = (m) -> System.out.println("conusmerA: " + m.getName());
		Consumer<MemberCommand> consumerB = (m) -> System.out.println("consumerB: " + m.getAge());
//Consumer 함수형 인터페이스는 처리 결과를 반환하지 않기 때문에 함수적 인터페이스의 호출 순서만 정한다.
		Consumer<MemberCommand> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new MemberCommand("hong", 33));
	}
}