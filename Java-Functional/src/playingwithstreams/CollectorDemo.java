package playingwithstreams;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorDemo {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		List<String> courses = List.of("Spring","Spring boot","API", "AWS","Microservices","PCF","Azure","Docker","Kubernetes");

		List<Integer> doubleNumbers = numbers.stream()
									  .map(number -> number*2)
									  .collect(Collectors.toList());
		List<Integer> evenNumbers = numbers.stream()
									.filter(number->number%2==0)
									.collect(Collectors.toList());
		
		List<Integer> coursesLength = courses.stream()
									  .map(course->course.length()).collect(Collectors.toList());
		System.out.println(coursesLength);
		
	}
	

}
