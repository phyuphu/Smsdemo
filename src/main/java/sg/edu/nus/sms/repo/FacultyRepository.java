package sg.edu.nus.sms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sg.edu.nus.sms.models.Faculty;


@Repository
public interface FacultyRepository extends JpaRepository<Faculty,Integer>{

}
