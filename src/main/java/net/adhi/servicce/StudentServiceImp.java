package net.adhi.servicce;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.adhi.model.Student;
import net.adhi.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService{

	@Autowired
	private StudentRepository repository;

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		this.repository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		this.repository.deleteById(id);
	}

	@Override
	public Student getStudentById(Long id) {
		Optional <Student> optional=repository.findById(id);
		Student student=null;
		if(optional.isPresent()) {
			student=optional.get();
		}else {
			throw new RuntimeException("Student not found for Id ::"+id);
		}
		return student;
	}
	
}
