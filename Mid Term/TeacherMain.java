import java.util.List;


public class TeacherMain {

	public static void main(String[] args) {
		
		System.out.println("Find By ID");
		
		Teacher teacher = teacherData.FindByID(2);
		System.out.println(teacher.toString());
		System.out.println("------------------------------------------\n------------------------------------------\n");
		
		
		System.out.println("Find All");
		
		List<Teacher> teachers = teacherData.FindAll();
		for (int i=0; i<teachers.size(); i++) {
			System.out.println(teachers.get(i).toString());
		}
		System.out.println("------------------------------------------\n------------------------------------------\n");
		
		
		System.out.println("Search");
		
		teachers = teacherData.Search("Nouman");
		for (int i=0; i<teachers.size(); i++) {
			System.out.println(teachers.get(i).toString());
		}
		System.out.println("------------------------------------------\n------------------------------------------\n");
		
		
		System.out.println("Add New Data");
		
		teacher.setTITLE("Teacher");
		teacher.setFORE_NAME("Tabinda");
		teacher.setSUR_NAME("Touqeer");
		teacher.setAGE(34);
		teacher.setGENDER("Male");
		teacher.setADDRESS("Lahore Pakistan");
		teacher.setS_COURSE("Chemistry");
		
		teacher = teacherData.Add(teacher);
		System.out.println(teacher.toString());
		System.out.println("------------------------------------------\n------------------------------------------\n");
		
		
		System.out.println("Find All after Adding New Data");
		
		teachers = teacherData.FindAll();
		for (int i=0; i<teachers.size(); i++) 
			System.out.println(teachers.get(i).toString());
		System.out.println("------------------------------------------\n------------------------------------------\n");
		
		
		System.out.println("Delete Data");
		
	    teacher = teacherData.DeleteOne(1);
	    System.out.println(teacher.toString());
		System.out.println("Your given ID data has been successfully Deleted");
		System.out.println("------------------------------------------\n------------------------------------------\n");
		
		
		System.out.println("Find All after Deleting Data");
		
		teachers = teacherData.FindAll();
		for (int i=0; i<teachers.size(); i++) 
			System.out.println(teachers.get(i).toString());
		System.out.println("------------------------------------------\n------------------------------------------\n");

	}

}
