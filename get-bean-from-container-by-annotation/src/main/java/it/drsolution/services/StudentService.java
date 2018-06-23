package it.drsolution.services;

import java.util.List;

import it.drsolution.model.Student;
import it.drsolution.repositories.StudentRepository;

public class StudentService {

	private StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	
	public List<Student> getListOfStudents(){
		return studentRepository.getStudents();
	}
	
}
