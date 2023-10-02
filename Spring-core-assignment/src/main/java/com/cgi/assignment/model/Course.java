package com.cgi.assignment.model;

import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class Course {

	private int courseId;
	private String courseName;
	private Professor courseProfessor;
	private List<Student> studentsList;

	public Course(int courseId, String courseName, Professor courseProfessor, List<Student> studentsList) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseProfessor = courseProfessor;
		this.studentsList = studentsList;
	}

	public Course() {
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Professor getCourseProfessor() {
		return courseProfessor;
	}

	public void setCourseProfessor(Professor courseProfessor) {
		this.courseProfessor = courseProfessor;
	}

	public List<Student> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseProfessor=" + courseProfessor
				+ ", studentsList=" + studentsList + "]";
	}
}
