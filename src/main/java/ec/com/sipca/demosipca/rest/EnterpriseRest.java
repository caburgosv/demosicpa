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

import ec.com.sipca.demosipca.models.Enterprise;
import ec.com.sipca.demosipca.service.EnterpriseService;

/**

 * Clase que define los servicios web rest para gestion de empresa

 * @author: Carlos Burgos

 * @version: 2/05/2022

 */

@RestController
@RequestMapping("/enterpriseWs/")
public class EnterpriseRest {

	@Autowired
	private EnterpriseService enterpriseService;
	
	@GetMapping
	private ResponseEntity<List<Enterprise>> getAllEnterprises(){
		return ResponseEntity.ok(enterpriseService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Enterprise>> getEnterpriseById(@PathVariable("id") Long idEnterprise){
		return null;//ResponseEntity.ok(enterpriseService.findById(idEnterprise));
	}
	
	@PostMapping
	private ResponseEntity<Enterprise> saveEnterprise (@RequestBody Enterprise enterprise){
		try {
			Enterprise savedEnterprise = enterpriseService.save(enterprise);		
		return ResponseEntity.created(new URI("/enterpriseWs/"+savedEnterprise.getId())).body(savedEnterprise);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteEnterprise (@PathVariable ("id") Long id){
		enterpriseService.deleteById(id);
		return ResponseEntity.ok(!(enterpriseService.findById(id)!=null));
		
	}
}
