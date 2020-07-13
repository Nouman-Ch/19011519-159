
public class Teacher {
	
	public static String csvFile = "F:\\Teacher.csv";
	
	private int Teacher_ID;
	
	private String TITLE;
	
	private String FORE_NAME;
	
	private String SUR_NAME;
	
	private int AGE;
	
	private String GENDER;
	
	private String ADDRESS;
	
	private String S_COURSE;
	

	public static String getCsvFile() {
		return csvFile;
	}

	public static void setCsvFile(String csvFile) {
		Teacher.csvFile = csvFile;
	}

	public int getTeacher_ID() {
		return Teacher_ID;
	}

	public void setTeacher_ID(int teacher_ID) {
		Teacher_ID = teacher_ID;
	}

	public String getTITLE() {
		return TITLE;
	}

	public void setTITLE(String tITLE) {
		TITLE = tITLE;
	}

	public String getFORE_NAME() {
		return FORE_NAME;
	}

	public void setFORE_NAME(String fORE_NAME) {
		FORE_NAME = fORE_NAME;
	}

	public String getSUR_NAME() {
		return SUR_NAME;
	}

	public void setSUR_NAME(String sUR_NAME) {
		SUR_NAME = sUR_NAME;
	}

	public int getAGE() {
		return AGE;
	}

	public void setAGE(int aGE) {
		AGE = aGE;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getADDRESS() {
		return ADDRESS;
	}

	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}

	public String getS_COURSE() {
		return S_COURSE;
	}

	public void setS_COURSE(String s_COURSE) {
		S_COURSE = s_COURSE;
	}
	
	public String toString() {
		
		String str = null;
		
		str = this.Teacher_ID
				+ "," + this.TITLE
				+ "," + this.FORE_NAME
				+ "," + this.SUR_NAME
				+ "," + this.AGE
				+ "," + this.GENDER
				+ "," + this.ADDRESS
				+ "," + this.S_COURSE;
		
		return str;
	}

}
