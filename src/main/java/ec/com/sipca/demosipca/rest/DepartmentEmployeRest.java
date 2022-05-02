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

import ec.com.sipca.demosipca.models.DepartmentEmploye;
import ec.com.sipca.demosipca.models.Employe;
import ec.com.sipca.demosipca.service.DepartmentEmployeService;

@RestController
@RequestMapping("/departmentEmployeWs/")
public class DepartmentEmployeRest {

	@Autowired
	private DepartmentEmployeService departmentEmployeService;
	
	@GetMapping
	private ResponseEntity<List<DepartmentEmploye>> getAllDepartmentEmploye(){
		return ResponseEntity.ok(departmentEmployeService.findAll());
	}
	
	@PostMapping
	private ResponseEntity<DepartmentEmploye> saveDepartmentEmploye (@RequestBody DepartmentEmploye enterprise){
		try {
			DepartmentEmploye savedDepartmentEmploye = departmentEmployeService.save(enterprise);		
		return ResponseEntity.created(new URI("/departmentEmployeWs/"+savedDepartmentEmploye.getId())).body(savedDepartmentEmploye);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteDepartmentEmploye (@PathVariable ("id") Long id){
		departmentEmployeService.deleteById(id);
		return ResponseEntity.ok(!(departmentEmployeService.findById(id)!=null));
		
	}

}
