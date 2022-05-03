package ec.com.sipca.demosipca.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ec.com.sipca.demosipca.models.Enterprise;


/**

 * Clase interface de la tabla Enterprise

 * @author: Carlos Burgos

 * @version: 2/05/2022

 */

@Repository
public interface EnterpriseRepository extends JpaRepository<Enterprise, Long>{

}
