package functionalinterfaces;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferences {

	public static void main(String[] args) {
		List<String> courses = List.of("Spring","Spring boot","API", "AWS","Microservices","PCF","Azure","Docker","Kubernetes");
		
		courses.stream()
				.distinct()
				.filter(c->c.length()>3) 
				.map(String::toUpperCase)//Using reference method instead of c->c.toUpperCase() 
				.sorted(Comparator.comparing(c->c.length()))
				.forEach(System.out::println);// reference method
								
		
	}

}
