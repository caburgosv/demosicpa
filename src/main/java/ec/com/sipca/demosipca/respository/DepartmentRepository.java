package ec.com.sipca.demosipca.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.sipca.demosipca.models.Department;

/**

 * Clase interface de la tabla Department

 * @author: Carlos Burgos

 * @version: 2/05/2022

 */

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}
