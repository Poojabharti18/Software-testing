package lambdaexpression;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(23);
		list.add(34);
		list.add(45);
		list.add(68);
		list.add(99);
		for(Integer i:list)
		{
			System.out.println(i);
		}
		//lambda
		list.forEach((n)->System.out.println(n));

	}

}
