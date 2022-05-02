package ec.com.sipca.demosipca.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.com.sipca.demosipca.models.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
