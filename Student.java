package edu.uog.student;

public class Student {

	public static String csvFile="D://Student.csv";
	
	private int STUDENT_ID;
	private int STUDENT_ROLLNO;
	private String STUDENT_SPROGRAM;
	private int STUDENT_SYEAR;
	public int getSTUDENT_ID() {
		return STUDENT_ID;
	}
	public void setSTUDENT_ID(int sTUDENT_ID) {
		STUDENT_ID = sTUDENT_ID;
	}
	public int getSTUDENT_ROLLNO() {
		return STUDENT_ROLLNO;
	}
	public String getSTUDENT_SPROGRAM() {
		return STUDENT_SPROGRAM;
	}
	public void setSTUDENT_SPROGRAM(String sTUDENT_SPROGRAM) {
		STUDENT_SPROGRAM = sTUDENT_SPROGRAM;
	}

	public void setSTUDENT_ROLLNO(int sTUDENT_ROLLNO) {
		STUDENT_ROLLNO = sTUDENT_ROLLNO;
	}
	
	public int getSTUDENT_SYEAR() {
		return STUDENT_SYEAR;
	}
	public void setSTUDENT_SYEAR(int sTUDENT_SYEAR) {
		STUDENT_SYEAR = sTUDENT_SYEAR;
	}
	
	public String toString() {
		String str=null;
		str=this.STUDENT_ID
				+","+this.STUDENT_ROLLNO
				+","+this.STUDENT_SPROGRAM
				+","+this.STUDENT_SYEAR;
		return str;
	}
}
