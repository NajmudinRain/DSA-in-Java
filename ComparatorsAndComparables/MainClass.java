package ComparatorsAndComparables;
import java.util.*;
public class MainClass {
public static void main(String[]args)
{
	List<Student> students= new ArrayList<>();
	students.add(new Student(23,"Ram"));
	students.add(new Student(65,"Ram"));
	students.add(new Student(83,"Aman"));
	students.add(new Student(13,"Rohit"));
	students.add(new Student(65,"Anuj"));
	Collections.sort(students);
	students.forEach(System.out::println);
	System.out.println();
	
//Collections.sort(students, new  SortByNameThenMarks());
	// or we can we sort without creating the class.. by creating anonymous class. as below
//	Collections.sort(students, new Comparator<Student>(){
//		 public int compare(Student o1,Student o2)
//		 {
//			 if(o1.name.equals(o2))
//			 {
//				 return o1.marks-o2.marks;
//			 }
//			 else {
//				 return o1.name.compareTo(o2.name);
//			 }
//		 }
//	});
	//or by below lamda sorting.
//	Collections.sort(students, (Student o1,Student o2)->{
//		 
//			 if(o1.name.equals(o2))
//			 {
//				 return o1.marks-o2.marks;
//			 }
//			 else {
//				 return o1.name.compareTo(o2.name);
//			 }
//		 
//	});
//	Collections.sort(students,(o1,o2)->{
//		  if(o1.name.equals(o2))
//			 {
//				 return o1.marks-o2.marks;
//			 }
//			 else {
//				 return o1.name.compareTo(o2.name);
//			 }
//		 
//	});
	//or
//Collections.sort(students, (o1,o2)->o1.name.compareTo(o2.name));
	//or
	//Collections.sort(students, Comparator.comparing(Student::getName));
//	Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks));
	Collections.sort(students, Comparator.comparing(Student::getName).thenComparing(Student::getMarks).reversed());
	
	
	students.forEach(System.out::println);
	
	
	
}
}
