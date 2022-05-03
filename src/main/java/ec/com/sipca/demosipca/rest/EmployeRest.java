package ec.com.sipca.demosipca.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.com.sipca.demosipca.models.Employe;
import ec.com.sipca.demosipca.models.Enterprise;
import ec.com.sipca.demosipca.service.EmployeService;

/**

 * Clase que define los servicios web rest para gestion del empleado

 * @author: Carlos Burgos

 * @version: 2/05/2022

 */

@RestController
@RequestMapping("/employeWs/")
public class EmployeRest {
	
	@Autowired
	private EmployeService employeService;
	
	@GetMapping
	private ResponseEntity<List<Employe>> getAllEmployees(){
		return ResponseEntity.ok(employeService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<Employe> saveEmploye (@RequestBody Employe enterprise){
		try {
			Employe savedEnterprise = employeService.save(enterprise);		
		return ResponseEntity.created(new URI("/employeWs/"+savedEnterprise.getId())).body(savedEnterprise);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteEmploye (@PathVariable ("id") Long id){
		employeService.deleteById(id);
		return ResponseEntity.ok(!(employeService.findById(id)!=null));
		
	}

}
