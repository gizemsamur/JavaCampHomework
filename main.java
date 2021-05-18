package javakamp;

public class main {

	public static void main(String[] args) {
		course course1=new course("C# Angular","Engin Demiroğ",0);
		course course2=new course("java react","Engin Demiroğ",0);
		
		course[] course= {course1,course2};
		
		student student1=new student(0,"Gizem","Samur","İstanbul","example@example.com");
		student student2=new student(1,"İrem","Elveren","İstanbul","example@example.com");
		
		student[] student= {student1,student2};
		
		for(course courses:course) {
			System.out.println("kurs adı:"+courses.courseName);
			System.out.println("egitmen adı:"+courses.instructor);
			System.out.println("ücret:"+courses.price);
		}
		for (student students:student) {
			System.out.println("öğrenci id"+students.id);
			System.out.println("öğrenci adı"+students.studentName);
			System.out.println("öğrenci soyadı"+students.lastName);
			System.out.println("öğrenci adresi"+students.address);
			System.out.println("öğrenci mail"+students.email);
			
			
		}
		
	}

}
