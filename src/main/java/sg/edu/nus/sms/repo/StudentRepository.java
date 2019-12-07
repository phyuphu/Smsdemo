package sg.edu.nus.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sg.edu.nus.sms.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}



