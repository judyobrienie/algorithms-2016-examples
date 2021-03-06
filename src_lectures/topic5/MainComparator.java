package topic5;

import java.util.Iterator;
import java.util.TreeSet;

public class MainComparator {

	public static void main(String args[]) {
		TreeSet<Student> set = new TreeSet<Student>(new StudentByScoreComparator());
		set.add(new Student("Ann", 87));
		set.add(new Student("Bob", 83));
		set.add(new Student("Cat", 99));
		set.add(new Student("Dan", 25));
		set.add(new Student("Eve", 76));
		Iterator<Student> iter = set.iterator();
		System.out.println("Students by Score");
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.name + "  " + s.score);
		}
		
		TreeSet<Student> setByName = new TreeSet<Student>(new StudentByNameComparator());
		setByName.addAll(set);
		iter = setByName.iterator();
		System.out.println("\nStudents by Name");
		while (iter.hasNext()) {
			Student s = iter.next();
			System.out.println(s.name + "  " + s.score);
		}
	}

}
