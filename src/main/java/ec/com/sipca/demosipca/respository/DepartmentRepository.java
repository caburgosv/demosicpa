package ec.com.sipca.demosipca.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.sipca.demosipca.models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
