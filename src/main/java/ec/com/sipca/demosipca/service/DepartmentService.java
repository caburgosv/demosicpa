package ec.com.sipca.demosipca.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import ec.com.sipca.demosipca.models.Department;
import ec.com.sipca.demosipca.respository.DepartmentRepository;

@Service
public class DepartmentService implements DepartmentRepository{
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Override
	public List<Department> findAll(){
		return departmentRepository.findAll();
	}
	
	public List<Department> findAllByEnterprise(Long id){
		List<Department> departmentsResponse =  new ArrayList<>();
		List<Department> departments = departmentRepository.findAll();
		departments.forEach(dep -> {
			if(dep.getId().equals(id)) {
				departmentsResponse.add(dep);
			}
		});
		return departmentsResponse;
	}

	@Override
	public List<Department> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return departmentRepository.findAll(sort);
	}

	@Override
	public List<Department> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Department> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Department> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Department> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Department> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Department entity) {
		departmentRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Department> entities) {
		departmentRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		departmentRepository.deleteAll();
	}

	@Override
	public <S extends Department> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Department> Page<S> findAll(Example<S> example, Pageable pageable) {
		return departmentRepository.findAll(example,pageable);
	}

	@Override
	public <S extends Department> long count(Example<S> example) {
		return departmentRepository.count(example);
	}

	@Override
	public <S extends Department> boolean exists(Example<S> example) {
		return departmentRepository.exists(example);
	}

	@Override
	public <S extends Department, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
