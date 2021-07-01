package playingwithstreams;
import java.util.ArrayList;
import java.util.List;

public class Functional {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		List<String> courses = List.of("Spring","Spring boot","API", "AWS","Microservices","PCF","Azure","Docker","Kubernetes");
		
		//print all courses
		courses.stream().forEach(System.out::println);
		
		
		//print courses containing the word spring
		courses.stream()
		.filter(course -> course.contains("Spring")).forEach(System.out::println);
		
		
		//print courses whose name has atleast 4 letters
		courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
		
		//print square of  odd number 
		numbers.stream()
		.filter(number-> number%2 !=0)
		.map(number -> number*number)
		.forEach(System.out::println);
		
		System.out.println("courses*******************");
		
		courses.stream()
		.map(course -> course.length()).forEach(System.out::println);
		
		System.out.println("Sum");
		
		int sum =numbers.stream().reduce(0, (a,b)->a+b);
		System.out.println("Sum = " + sum);
		
		
		
	}
	
	
}
