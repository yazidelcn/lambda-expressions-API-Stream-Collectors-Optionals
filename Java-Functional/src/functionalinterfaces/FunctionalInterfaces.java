package functionalinterfaces;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,8,6,10,9,7);
		
		
		
		
		
		//Behind every lambda expression there is a functional interface
		
		
		
		
		Predicate<Integer> isEvenPredicate = x->x%2==0;
		
		Predicate<Integer> isOddPredicate = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				
				return t%2 != 0;
			}
		};
		
		
		
		Function<Integer, Integer> squareFunction = x->x*x;
		
		Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer t) {
				return t*t;
			}
			
		};
		
		
		Consumer<Integer> sysoutConsumer = System.out::println;
		
		Consumer<Integer> sysoutConsumer2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		
		
		numbers.stream()
		.filter(isEvenPredicate)
		.map(squareFunction)
		.forEach(sysoutConsumer);
		
		
		

	}

}
