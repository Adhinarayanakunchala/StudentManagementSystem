package net.adhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.adhi.model.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
