package customclass;

import java.util.Comparator;
import java.util.List;

public class CustomClassComparator {

	public static void main(String[] args) {
		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 30000), new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("Fullstack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000));
		
		
		Comparator<Course> comparingByNumberOfStudentsIncreasing = Comparator.comparing(course->course.getNumberOfStudents());
		Comparator<Course> comparingByNumberOfStudentsDecreasing = Comparator.comparing(Course::getNumberOfStudents).reversed();
		
		
		
		courses.stream().sorted(comparingByNumberOfStudentsDecreasing)
		.forEach(System.out::println);
		
		
		courses.stream()
			   .sorted(Comparator.comparing(Course::getNumberOfStudents).thenComparing(Course::getReviewScore).reversed())
			   .forEach(System.out::println);
	}

}
