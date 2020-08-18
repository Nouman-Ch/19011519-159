package springboot.restful.api.interfase;

public interface teacherCourseInterface {
	
	List<Course> get();
	
	Course get(int id);
	
	void save(Course employee);
	
	void delete(int id);

}
