package com.veera.dairy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veera.dairy.Entities.Entry;
import com.veera.dairy.repository.EntityRepository;

@Service
public class EntryServiceImpl implements EntryService {
	
	@Autowired
	private EntityRepository entityRepository;
	

	@Override
	public Entry saveEntry(Entry entry) {
		// TODO Auto-generated method stub
		return entityRepository.save(entry);
	}

	@Override
	public Entry updateEntry(Entry entry) {
		// TODO Auto-generated method stub
		return entityRepository.save(entry);
	}

	@Override
	public void deleteEntry(Entry entry) {
		// TODO Auto-generated method stub
		entityRepository.delete(entry);

	}

	@Override
	public Entry finById(int id) {
		// TODO Auto-generated method stub
		return entityRepository.findById(id).get();
	}

	@Override
	public List<Entry> findAll() {
		// TODO Auto-generated method stub
		return entityRepository.findAll();
	}

	@Override
	public List<Entry> findByUserId(int id) {
		// TODO Auto-generated method stub
		return entityRepository.findByUserId(id);
	}

}
