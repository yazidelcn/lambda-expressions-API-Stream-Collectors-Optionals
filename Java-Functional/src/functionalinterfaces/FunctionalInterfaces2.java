package functionalinterfaces;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FunctionalInterfaces2 {

	public static void main(String[] args) {
		// No input -> Return something
		Supplier<Integer> randomInteger = () -> {
			Random number = new Random();
			return number.nextInt(100);
		};

		System.out.println(randomInteger.get());

		// take one param as the input and returns result of the same type
		UnaryOperator<Integer> unaryOperator = x -> x * x;
		System.out.println(unaryOperator.apply(10));
		
		
		BiPredicate<Integer, Integer> isGreater = (a,b)-> a>b;
		System.out.println(isGreater.test(10, 90));
		
		BiFunction<Integer, Integer, String> bifunc = (a,b)->a+""+b;
		System.out.println(bifunc.apply(20, 21));
		
		
		BiConsumer<String, Integer> biConsumer = (str,num)->{
			System.out.println(str+" "+ num);
		};
		
		biConsumer.accept("The year is ", 2021);
		
		
	}

}
