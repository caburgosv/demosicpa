package ec.com.sipca.demosipca.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.sipca.demosipca.models.Employe;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
