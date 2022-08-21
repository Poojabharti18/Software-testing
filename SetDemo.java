package lambdaexpression;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String>set=new HashSet<String>();
		set.add("Mamma");
		set.add("pappa");
		set.add("sis");
		set.add("myself");
		set.forEach(System.out::println);

	}

}
