package lambdaexpression;

public interface DemoInterface {
	void test();
	default void test1() {
		System.out.println("Hello");
	}
	static void test2() {
		System.out.println("World");
	}

}
