package javakamp;

public class main {

	public static void main(String[] args) {
		course course1=new course("C# Angular","Engin Demiro�",0);
		course course2=new course("java react","Engin Demiro�",0);
		
		course[] course= {course1,course2};
		
		student student1=new student(0,"Gizem","Samur","�stanbul","example@example.com");
		student student2=new student(1,"�rem","Elveren","�stanbul","example@example.com");
		
		student[] student= {student1,student2};
		
		for(course courses:course) {
			System.out.println("kurs ad�:"+courses.courseName);
			System.out.println("egitmen ad�:"+courses.instructor);
			System.out.println("�cret:"+courses.price);
		}
		for (student students:student) {
			System.out.println("��renci id"+students.id);
			System.out.println("��renci ad�"+students.studentName);
			System.out.println("��renci soyad�"+students.lastName);
			System.out.println("��renci adresi"+students.address);
			System.out.println("��renci mail"+students.email);
			
			
		}
		
	}

}
