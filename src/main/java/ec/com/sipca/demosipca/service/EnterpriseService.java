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

import ec.com.sipca.demosipca.models.Enterprise;
import ec.com.sipca.demosipca.respository.EnterpriseRepository;

@Service
public class EnterpriseService implements EnterpriseRepository {
	
	@Autowired
	private EnterpriseRepository enterpriseRepository;
	
	@Override
	public List<Enterprise> findAll(){
		return enterpriseRepository.findAll();
	}

	@Override
	public List<Enterprise> findAll(Sort sort) {
		return enterpriseRepository.findAll(sort);
	}

	@Override
	public List<Enterprise> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enterprise> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Enterprise> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enterprise> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Enterprise> entities) {
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
	public Enterprise getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Enterprise getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enterprise> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enterprise> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Enterprise> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enterprise> S save(S entity) {
		return enterpriseRepository.save(entity);
	}

	@Override
	public Optional<Enterprise> findById(Long id) {
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
		enterpriseRepository.deleteById(id);
		
	}

	@Override
	public void delete(Enterprise entity) {
		enterpriseRepository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Enterprise> entities) {
		enterpriseRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Enterprise> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Enterprise> Page<S> findAll(Example<S> example, Pageable pageable) {
		return enterpriseRepository.findAll(example, pageable);
	}

	@Override
	public <S extends Enterprise> long count(Example<S> example) {
		return enterpriseRepository.count(example);
	}

	@Override
	public <S extends Enterprise> boolean exists(Example<S> example) {
		return enterpriseRepository.exists(example);
	}

	@Override
	public <S extends Enterprise, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
