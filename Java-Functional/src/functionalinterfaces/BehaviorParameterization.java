package functionalinterfaces;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviorParameterization {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3,4,8,6,10,9,7);
		Function<Integer, Integer> squareFunction = x->x*x;
		
		
		
	   List<Integer> squared = 	extracted(numbers, squareFunction);
	   List<Integer> cubed = extracted(numbers, x->x*x*x);
	   System.out.println(squared);
	   System.out.println("*******************************");
	   System.out.println(cubed);
		
	}

	private static List<Integer> extracted(List<Integer> list, Function<Integer, Integer> function) {
		return  list.stream()
				.map(function)
				.collect(Collectors.toList());
	}
	
	
}
