package customclass;

import java.util.List;
import java.util.function.Predicate;

public class CustomClassDemo {

	public static void main(String[] args) {
		List<Course> courses = List.of(
				new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 30000),
				new Course("API", "Microservices", 97, 22000),
				new Course("Microservices", "Microservices", 96, 25000),
				new Course("Fullstack", "FullStack", 91, 14000),
				new Course("AWS", "Cloud", 92, 21000),
				new Course("Azure", "Cloud", 99, 21000),
				new Course("Docker", "Cloud", 92, 20000),
				new Course("Kubernetes", "Cloud", 91, 20000)
				);
		//allMatch, noneMatch, anyMatch
		
		Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore()>90;
		Predicate<Course> numberOfStudentsGreaterThan30000Predicate = course -> course.getNumberOfStudents()>30000;

		System.out.println(courses.stream().allMatch(reviewScoreGreaterThan90Predicate));//true 
		System.out.println(courses.stream().noneMatch(reviewScoreGreaterThan90Predicate));//false
		System.out.println(courses.stream().anyMatch(reviewScoreGreaterThan90Predicate));//true
		
		
		System.out.println(courses.stream().noneMatch(numberOfStudentsGreaterThan30000Predicate));//true
		System.out.println(courses.stream().anyMatch(course -> course.getNumberOfStudents()>30000));//false
		System.out.println(courses.stream().allMatch(course -> course.getNumberOfStudents()>30000));//false
		 
		
		
		
		
	}

}
