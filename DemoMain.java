package lambdaexpression;

public class DemoMain {

	public static void main(String[] args) {
		DemoInterface D=()->
		{
			System.out.println("Pooja");
		};
		D.test();
		D.test1();
		DemoInterface.test2();

	}

}
