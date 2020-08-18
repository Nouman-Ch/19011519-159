package springboot.restful.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TeacherCourseController {
	
	@Autowired
	private TeacherCourse teacherCourse;
		
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView get() {
		ModelAndView mav = new ModelAndView("Teacher Course List");
		List<Course> list = teacherCourse.get();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("/openTeacherCourse")
	public ModelAndView openTeacherCourse() {
		ModelAndView mav = new ModelAndView("CoursesAdd");
		mav.addObject("Course", new TeacherCourse());
		return mav;
	}
	
	@RequestMapping("/save")
	public ModelAndView save(@ModelAttribute("Teacher") Teacher teacherObj) {
		ModelAndView mav = new ModelAndView("TeacherCoursesist");
		teacherCourse.save(teacherObj);
		List<Course> list = teacherCourse.get();
		mav.addObject("list", list);
		return mav;
	}
	
	@RequestMapping("/Course/{id}")
	public ModelAndView get(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("TeacherCoursesAdd");
		TeacherCourse teacherObj = teacherCourse.get(id);
		if(teacherObj == null) {
			throw new RuntimeException("Course not found"+id);
		}
		mav.addObject("TeacherCourse", teacherObj);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView("TeacherCoursesList");
		teacherCourse.delete(id);
		List<Course> list = teacherCourse.get();
		mav.addObject("list", list);
		return mav;
	}

}
