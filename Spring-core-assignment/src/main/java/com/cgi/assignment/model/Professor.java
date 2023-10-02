package com.cgi.assignment.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Professor {

	private int ProfessorId;
	private String ProfessorName;
	@Autowired
	private Course ProfessorCourse;

	public Professor() {
		super();
	}

	public Professor(int professorId, String professorName, Course professorCourse) {
		super();
		ProfessorId = professorId;
		ProfessorName = professorName;
		ProfessorCourse = professorCourse;
	}

	public int getProfessorId() {
		return ProfessorId;
	}

	public void setProfessorId(int professorId) {
		ProfessorId = professorId;
	}

	public String getProfessorName() {
		return ProfessorName;
	}

	public void setProfessorName(String professorName) {
		ProfessorName = professorName;
	}

	public Course getProfessorCourse() {
		return ProfessorCourse;
	}

	public void setProfessorCourse(Course professorCourse) {
		ProfessorCourse = professorCourse;
	}

	@Override
	public String toString() {
		return "Professor [ProfessorId=" + ProfessorId + ", ProfessorName=" + ProfessorName + ", ProfessorCourse="
				+ ProfessorCourse + "]";
	}

}
