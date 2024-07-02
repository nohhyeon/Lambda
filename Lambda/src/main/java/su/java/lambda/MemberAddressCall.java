package su.java.lambda;

import java.util.function.Function;

public class MemberAddressCall {
	public static void main(String[] args) {
//매개 변숫값으로 제공되는 MemberAddress 클래스로부터 Address 클래스를 반환한다.
		Function<MemberAddress, Address> functionA;
//매개 변숫값으로 제공되는 Address 클래스로부터 String 클래스를 반환한다.
		Function<Address, String> functionB;
//매개 변숫값으로 제공되는 MemberAddress 클래스와 String 클래스를 반환한다.
		Function<MemberAddress, String> functionAB;
		String city = null;
		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();
//functionB 객체를 먼저 입력에 적용한 다음 이후 functionA 객체를 결과에 적용하는 구성된 기능을 반환한다.
		functionAB = functionA.andThen(functionB); // 기능을 주어진 매개 변수에 적용한다.
		city = functionAB.apply(new MemberAddress("홍길동", 33, new Address("한국", "서울")));
		System.out.println("거주 도시 : " + city);
	}
}