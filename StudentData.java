package edu.uog.student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentData {
	@SuppressWarnings("resource")
	public List<Student> findAll(){            // start
		List<Student>students=new ArrayList<Student>();    //this part receives read data
		String line;                        
		try {
			BufferedReader bufferreader=new BufferedReader(new FileReader(Student.csvFile));  
			while((line=bufferreader.readLine())!=null) {   //reads from file
				Student student=new Student();                       //                                 
				String[] studentLow=line.split(",");                   //splits to get id values
				
				student.setSTUDENT_ID(Integer.parseInt(studentLow[0]));               
				student.setSTUDENT_ROLLNO(Integer.parseInt(studentLow[1])); 
				student.setSTUDENT_SPROGRAM((studentLow[2]));
				student.setSTUDENT_SYEAR(Integer.parseInt(studentLow[3]));                
				
				students.add(student);   //data sending to receiver
				}
				                   
				
			
		}
			catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return students;    //final data received
	}
	
	@SuppressWarnings("resource")
	public static Student findOne(int student_ID){            // start
		String line;                        //this part receives read data
		try {
			BufferedReader bufferreader=new BufferedReader(new FileReader(Student.csvFile));    //start
			while((line=bufferreader.readLine())!=null) {   //reads from file
				Student student=new Student();                       //                                 
				String[] studentLow=line.split(",");                   //splits to get id values
				if(Integer.parseInt(studentLow[0])==student_ID){
					
					student.setSTUDENT_ID(Integer.parseInt(studentLow[0]));               
					student.setSTUDENT_ROLLNO(Integer.parseInt(studentLow[1])); 
					student.setSTUDENT_SPROGRAM((studentLow[2]));
					student.setSTUDENT_SYEAR(Integer.parseInt(studentLow[3]));    
				
				return student;
				
				}
				                   //data sending to receiver
			}
			
		}
			catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return null;    //final data received
	}
	
	
	@SuppressWarnings("resource")
	public Student Search(String search){            // start
		String line;                        //this part receives read data
		try {
			BufferedReader bufferreader=new BufferedReader(new FileReader(Student.csvFile));    //start
			while((line=bufferreader.readLine())!=null) {   //reads from file
				Student student=new Student();                       //                                 
				String[] studentLow=line.split(",");                   //splits to get id values
				if((studentLow[2].compareTo(search))==0){
					
					student.setSTUDENT_ID(Integer.parseInt(studentLow[0]));               
					student.setSTUDENT_ROLLNO(Integer.parseInt(studentLow[1])); 
					student.setSTUDENT_SPROGRAM((studentLow[2]));
					student.setSTUDENT_SYEAR(Integer.parseInt(studentLow[3]));    
				
				return student;
				}
				                   //data sending to receiver
			}	
			
		}
			catch (IOException e) { 
			
			e.printStackTrace();
		}
		
		return null;    //final data received
	}
	
	
	@SuppressWarnings("resource")
	public List<Student> search(String search){            // start
		List<Student>students=new ArrayList<Student>();
		String line;                        //this part receives read data
		try {
			BufferedReader bufferreader=new BufferedReader(new FileReader(Student.csvFile));    //start
			
			while((line=bufferreader.readLine())!=null) {   //reads from file
				
				Student student=new Student();                       //                                 
				String[] studentLow=line.split(","); //splits to get id values
				
				
				if((studentLow[2]).contains(search)) {
					
					student.setSTUDENT_ID(Integer.parseInt(studentLow[0]));               
					student.setSTUDENT_ROLLNO(Integer.parseInt(studentLow[1])); 
					student.setSTUDENT_SPROGRAM((studentLow[2]));
					student.setSTUDENT_SYEAR(Integer.parseInt(studentLow[3]));
				
				students.add(student);   //data sending to receiver
				}
				
			}
				                
			}
			catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return students;    //final data received
	}
	public Student Save(Student student) {
		FileWriter filewriter;
		List<Student>students=this.findAll();
		
		try {
			filewriter=new FileWriter(Student.csvFile);
			
			for(int i=0;i<students.size();i++) {
				filewriter.append(students.get(i).toString());
				filewriter.append("\n");
			}
				if(students.size()>0) 
					student.setSTUDENT_ID(students.get(students.size()-1).getSTUDENT_ID()+1);
					else
						student.setSTUDENT_ID(1);
				
				filewriter.append(student.toString());
				filewriter.append("\n");
				filewriter.flush();
				filewriter.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return student;
	}

}
