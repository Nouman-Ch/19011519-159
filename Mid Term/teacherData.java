import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class teacherData {
	
	private String csvFile = "F:\\Teacher.csv";

	public String getCsvFile() {
		return csvFile;
	}

	public void setCsvFile(String csvFile) {
		this.csvFile = csvFile;
	}
	
	
	
	
	
	public static List<Teacher> FindAll () {
		
		List<Teacher> teachers = new ArrayList<Teacher>();
		String line;
		
		try {
			BufferedReader bufferedreader = new BufferedReader (new FileReader(Teacher.csvFile));
			
			while ((line = bufferedreader.readLine()) != null) {
				
				Teacher teacher = new Teacher();
				String[] teacherRow = line.split(",");
				
				teacher.setTeacher_ID(Integer.parseInt(teacherRow[0]));
				teacher.setTITLE(teacherRow[1]);
				teacher.setFORE_NAME(teacherRow[2]);
				teacher.setSUR_NAME(teacherRow[3]);
				teacher.setAGE(Integer.parseInt(teacherRow[4]));
				teacher.setGENDER(teacherRow[5]);
				teacher.setADDRESS(teacherRow[6]);
				teacher.setS_COURSE(teacherRow[7]);
				
				
				teachers.add(teacher);
				
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return teachers;
	}
	
	
	
	
	
	
	public static Teacher FindByID (int teacher_ID) {
		
		String line;
		
		try {
			BufferedReader bufferedreader = new BufferedReader (new FileReader(Teacher.csvFile));
			
			while ((line = bufferedreader.readLine()) != null) {
				
				Teacher teacher = new Teacher();
				String[] teacherRow = line.split(",");
				
				if (Integer.parseInt(teacherRow[0]) == teacher_ID) {
				
					teacher.setTeacher_ID(Integer.parseInt(teacherRow[0]));
					teacher.setTITLE(teacherRow[1]);
					teacher.setFORE_NAME(teacherRow[2]);
					teacher.setSUR_NAME(teacherRow[3]);
					teacher.setAGE(Integer.parseInt(teacherRow[4]));
					teacher.setGENDER(teacherRow[5]);
					teacher.setADDRESS(teacherRow[6]);
					teacher.setS_COURSE(teacherRow[7]);
					
					return teacher;
				}
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	
	
	
	
	public static List<Teacher> Search (String search)  {
		List<Teacher> teachers = new ArrayList<Teacher>();
		String line;
		
		try {
			BufferedReader bufferreader = new BufferedReader(new FileReader(Teacher.csvFile));
			
			while ((line = bufferreader.readLine()) != null) {
				Teacher teacher = new Teacher();
				
				String[] teacherRow = line.split(",");
				
				if (teacherRow[2].contains(search) == true) {
					
					teacher.setTeacher_ID(Integer.parseInt(teacherRow[0]));
					teacher.setTITLE(teacherRow[1]);
					teacher.setFORE_NAME(teacherRow[2]);
					teacher.setSUR_NAME(teacherRow[3]);
					teacher.setAGE(Integer.parseInt(teacherRow[4]));
					teacher.setGENDER(teacherRow[5]);
					teacher.setADDRESS(teacherRow[6]);
					teacher.setS_COURSE(teacherRow[7]);
					
					teachers.add(teacher);
				}
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return teachers;
	}
	
	
	
	
	
	
	
	public static Teacher Add (Teacher teacher) {
		
		FileWriter filewriter; 
		List<Teacher> teachers = FindAll();

		try {
			filewriter = new FileWriter(Teacher.csvFile);

			for (int i=0; i<teachers.size(); i++) {
				filewriter.append(teachers.get(i).toString());
				filewriter.append("\n");
			}
			
			if (teachers.size()>0)
				teacher.setTeacher_ID(teachers.get(teachers.size()-1).getTeacher_ID()+1);
			else
				teacher.setTeacher_ID(1);
			
			filewriter.append(teacher.toString());
			filewriter.append("\n");
			
			filewriter.flush();
			filewriter.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		return teacher;
	}
	
	
	
	
	
	
	
	public static Teacher DeleteOne(int teacher_ID)  {
		FileWriter filewriter;

		List<Teacher> rooms = FindAll();
		Teacher teacher = FindByID(teacher_ID);

		try {
			filewriter = new FileWriter(Teacher.csvFile);

			for (int i=0; i<rooms.size(); i++) {
				if (rooms.get(i).getTeacher_ID() != teacher_ID) {
					filewriter.append(rooms.get(i).toString());
					filewriter.append("\n");
				}
			}
			filewriter.flush();
			filewriter.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return teacher;
		
	}

}
