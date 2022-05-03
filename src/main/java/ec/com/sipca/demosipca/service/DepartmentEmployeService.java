package ec.com.sipca.demosipca.service;

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

import ec.com.sipca.demosipca.models.DepartmentEmploye;
import ec.com.sipca.demosipca.respository.DepartmentEmployeRepository;

/**

 * Clase servicio para gestion del core de negocios de DepartmentEmploye

 * @author: Carlos Burgos

 * @version: 2/05/2022

 */

@Service
public class DepartmentEmployeService implements DepartmentEmployeRepository {

	@Autowired
	private DepartmentEmployeRepository departmentEmployeRepository;

	@Override
	public List<DepartmentEmploye> findAll() {
		return departmentEmployeRepository.findAll();
	}

	@Override
	public List<DepartmentEmploye> findAll(Sort sort) {
		return departmentEmployeRepository.findAll(sort);
	}

	@Override
	public List<DepartmentEmploye> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DepartmentEmploye> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends DepartmentEmploye> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DepartmentEmploye> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<DepartmentEmploye> entities) {
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
	public DepartmentEmploye getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DepartmentEmploye getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DepartmentEmploye> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DepartmentEmploye> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<DepartmentEmploye> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DepartmentEmploye> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DepartmentEmploye> findById(Long id) {
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
	public void delete(DepartmentEmploye entity) {
		departmentEmployeRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends DepartmentEmploye> entities) {
		departmentEmployeRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		departmentEmployeRepository.deleteAll();
	}

	@Override
	public <S extends DepartmentEmploye> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DepartmentEmploye> Page<S> findAll(Example<S> example, Pageable pageable) {
		return departmentEmployeRepository.findAll(example, pageable);
	}

	@Override
	public <S extends DepartmentEmploye> long count(Example<S> example) {
		return departmentEmployeRepository.count(example);
	}

	@Override
	public <S extends DepartmentEmploye> boolean exists(Example<S> example) {
		return departmentEmployeRepository.exists(example);
	}

	@Override
	public <S extends DepartmentEmploye, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
}
