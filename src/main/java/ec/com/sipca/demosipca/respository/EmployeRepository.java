package ec.com.sipca.demosipca.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.sipca.demosipca.models.Employe;

/**

 * Clase interface de la tabla Employe

 * @author: Carlos Burgos

 * @version: 2/05/2022

 */

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long>{

}
