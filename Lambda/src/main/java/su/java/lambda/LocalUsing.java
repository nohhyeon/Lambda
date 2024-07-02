package su.java.lambda;

public class LocalUsing {
	public void use() {
		final int localVar = 40;
// 익명 구현 인스턴스를 선언한다.
		LocalInterface localInterface = () -> {
			System.out.println("로컬 변숫값 : " + localVar);
		};
		localInterface.call();
	}
}