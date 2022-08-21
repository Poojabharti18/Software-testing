package lambdaexpression;

public class MethodrefMain {

	
		public void myMethod()
		{
			System.out.println("Hello");
			
		}
		public static void main(String[] args) {
			MethodrefMain m=new MethodrefMain();
			methodrefDemo d=m::myMethod;
			d.display();
	}

}
