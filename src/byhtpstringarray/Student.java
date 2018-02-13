package byhtpstringarray;

public class Student {

	private String name;
	private String surname;
	
	public Student(){
		
	}
	
	public Student(String name, String surname){
		this.name = name;
		this.surname = surname;
	}
	
	public void setStudent(String name, String surname){
		this.name = name;
		this.surname = surname;
	}
	
	public String getStudentName(){
		return this.name;
	}
	
	public String getStudentSurname(){
		return this.surname;
	}
}