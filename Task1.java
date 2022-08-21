package lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class Task1 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,2,3);
		list.forEach(n->{
			n+=2;
			System.out.println(n);
		});

	}

}
