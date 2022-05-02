package ec.com.sipca.demosipca.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.sipca.demosipca.models.DepartmentEmploye;

@Repository
public interface DepartmentEmployeRepository extends JpaRepository<DepartmentEmploye, Long>{

}
