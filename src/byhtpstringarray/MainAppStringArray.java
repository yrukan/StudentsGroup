package byhtpstringarray;

public class MainAppStringArray {

	public static void main(String[] args) {
		
		Student stud1 = new Student("StudentName1", "StudentSurname1");
		Student stud2 = new Student("StudentName2", "StudentSurname2");
		Student stud3 = new Student("StudentName3", "StudentSurname3");
		Student stud4 = new Student("StudentName4", "StudentSurname4");
		Student stud5 = new Student("StudentName5", "StudentSurname5");

		Student[] students = new Student[]{stud1, stud2, stud3, stud4, stud5, stud1, stud2, stud3, stud4, stud5};
		StudentsGroup group = new StudentsGroup();
		
		group.setStudents(students);
		group.printStudents();
		
	}

}

