package lambdaexpression;

public class AdditionExample {

	public static void main(String[] args) {
		
		Addition A=(int a,int b)->{
			System.out.println(a+b);
		};
		
		A.add(6,9);
	}

}
