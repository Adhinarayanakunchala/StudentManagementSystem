package net.adhi.servicce;

import java.util.List;

import net.adhi.model.Student;

public interface StudentService {
   void saveStudent(Student student);
   List<Student> getAllStudents();
   void deleteStudent(Long id);
   Student getStudentById(Long id);
   
}
