import java.util.ArrayList;

class Course {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {

        students.add(student);
    }

    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {

        students.remove(student);

    }

}
public class Problem11_5 {

	public static void main(String[] args) {
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database Systems");

		course1.addStudent("Chris Nosowitz");
		course1.addStudent("Nick Leone");
		course1.addStudent("Jack Liggett");

		course2.addStudent("Jake Litts");
		course2.addStudent("Sean Conway");

		System.out.println("Number of students in course 1: "
			+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");

		System.out.println();
		System.out.print("Number of students in course 2: "
			+ course2.getNumberOfStudents());
		String[] students1 = course2.getStudents();
		System.out.println();
		for (int j = 0; j < course2.getNumberOfStudents(); j++)
			System.out.print(students1[j] + ", ");
		
	}
}


