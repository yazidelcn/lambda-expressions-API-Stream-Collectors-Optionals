package playingwithstreams;
import java.util.Comparator;
import java.util.List;

public class SortedWithComparator {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring","Spring boot","API", "AWS",
				"Microservices","PCF","Azure","Docker","Kubernetes","AWS");
		
		//using distinct 
		courses.stream().distinct().forEach(System.out::println);
		//sorting in natural order with comparator
		courses.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
		
		//sorting in reversed order
		courses.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//sorting using my own comparator
		courses.stream().distinct()
		.sorted(Comparator.comparing( x -> x.length())).forEach(System.out::println);
		
		
		
		
		
	}

}
