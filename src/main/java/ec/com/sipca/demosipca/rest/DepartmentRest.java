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

import ec.com.sipca.demosipca.models.Department;
import ec.com.sipca.demosipca.models.Enterprise;
import ec.com.sipca.demosipca.service.DepartmentService;

@RestController
@RequestMapping("/departmetWs/")
public class DepartmentRest {

	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping
	private ResponseEntity<List<Department>> getAllDepartments(){
		return ResponseEntity.ok(departmentService.findAll());
	}
	
	@GetMapping ("{id}")
	private ResponseEntity<List<Department>> getEnterpriseById(@PathVariable("id") Long idEnterprise){
		return ResponseEntity.ok(departmentService.findAllByEnterprise(idEnterprise.intValue()));
	}
	
	@PostMapping
	private ResponseEntity<Department> saveDepartment (@RequestBody Department department){
		try {
			Department savedDepartment = departmentService.save(department);		
		return ResponseEntity.created(new URI("/enterpriseWs/"+savedDepartment.getId())).body(savedDepartment);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deleteDepartment (@PathVariable ("id") Long id){
		departmentService.deleteById(id);
		return ResponseEntity.ok(!(departmentService.findById(id)!=null));
		
	}
}
