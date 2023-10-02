package com.cgi.assignment.model;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private int studentId;
	private String studentName;

	@Autowired
	private List<Course> courseList;

	public Student() {
	}

	public Student(int studentId, String studentName, List<Course> courseList) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseList = courseList;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseList=" + courseList + "]";
	}

}
