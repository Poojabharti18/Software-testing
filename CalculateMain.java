package lambdaexpression;

public class CalculateMain {

	public static void main(String[] args) {
		CalculationCube C=(int x)->
		{
			System.out.println(x*x*x);
		};
		C.cube(9);

	}

}
