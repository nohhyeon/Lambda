package su.java.lambda;

//두 개 이상의 추상 메서드를 선언하지 못하도록 제어한다.
@FunctionalInterface
//함수형 인터페이스를 선언한다.
public interface MemberInterface {
	public void call();
}