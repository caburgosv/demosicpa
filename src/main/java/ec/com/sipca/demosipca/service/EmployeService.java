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

import ec.com.sipca.demosipca.models.Employe;
import ec.com.sipca.demosipca.respository.EmployeRepository;

/**

 * Clase servicio para gestion del core de negocios de Employe

 * @author: Carlos Burgos

 * @version: 2/05/2022

 */

@Service
public class EmployeService implements EmployeRepository{
	
	@Autowired
	private EmployeRepository employeRepository;

	@Override
	public List<Employe> findAll() {
		return employeRepository.findAll();
	}
	
	//public List<Employe> finAllBy

	@Override
	public List<Employe> findAll(Sort sort) {
		return employeRepository.findAll(sort);
	}

	@Override
	public List<Employe> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employe> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Employe> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employe> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Employe> entities) {
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
	public Employe getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employe getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employe> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employe> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Employe> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employe> S save(S entity) {
		return employeRepository.save(entity);
	}

	@Override
	public Optional<Employe> findById(Long id) {
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
		employeRepository.deleteById(id);
		
	}

	@Override
	public void delete(Employe entity) {
		employeRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
	}

	@Override
	public void deleteAll(Iterable<? extends Employe> entities) {
		employeRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		employeRepository.deleteAll();
	}

	@Override
	public <S extends Employe> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Employe> Page<S> findAll(Example<S> example, Pageable pageable) {
		return employeRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Employe> long count(Example<S> example) {
		return employeRepository.count(example);
	}

	@Override
	public <S extends Employe> boolean exists(Example<S> example) {
		return employeRepository.exists(example);
	}

	@Override
	public <S extends Employe, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
