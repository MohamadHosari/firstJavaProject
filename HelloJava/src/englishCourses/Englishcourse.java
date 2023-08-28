package englishCourses;

//class name
public class Englishcourse {
	//variables
	int students;
	int days;
	int weeks;

	//method
	public static void main(String[] args) {
		//object
		Englishcourse Gr = new Englishcourse();
		int totaldays;
		
		Gr.days = 3;
		Gr.students = 10;
		Gr.weeks = 4;
		
		totaldays = Gr.weeks * Gr.days;
		
		System.out.print("this is the total of english grammer course: "+ totaldays +"days");

	}

}
