package su.java.lambda;

public class ReferenceMethod {
	public static int plu(int x, int y) {
		return x + y;
	}

	public int mul(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {
		MethodInterface methodInterface = null;
		methodInterface = (x, y) -> ReferenceMethod.plu(x, y);
		System.out.println("람다식 더하기 결괏값 : " + methodInterface.call(7, 7));
		methodInterface = ReferenceMethod::plu;
		System.out.println("참조 더하기 결괏값 : " + methodInterface.call(7, 7));
		ReferenceMethod referenceMethod = new ReferenceMethod();
		methodInterface = (x, y) -> referenceMethod.mul(x, y);
		System.out.println("람다식 곱하기 결괏값 : " + methodInterface.call(7, 7));
		methodInterface = referenceMethod::mul;
		System.out.println("참조 곱하기 결괏값 : " + methodInterface.call(7, 7));
	}
}