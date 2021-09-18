package ComparatorsAndComparables;

import java.util.*;

public class Student implements Comparable<Student>{
	
	int marks;
	String name;
	public Student(int marks, String name)
	{
		super();
		this.marks= marks;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int compareTo(Student obj)
	{
//		if(this.marks>obj.marks)return 1; //in increacing order, ifreturn int is +ve means the current obj is small than this object
//		else if(this.marks<obj.marks)return -1;
//		return this.name.compareTo(obj.name); //String already implements comparable interface
		
		return this.marks-obj.marks;
	}
 
}

class SortByNameThenMarks implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2)
	{
		if(o1.name.equals(o2.name))
		{
		  return o1.marks-o2.marks;
		}
		else {
			return o1.name.compareTo(o2.name);
		}
	}
}
