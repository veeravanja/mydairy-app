package com.veera.dairy.service;

import java.util.List;

import com.veera.dairy.Entities.Entry;


public interface EntryService {
	public Entry saveEntry(Entry entry);
	public Entry updateEntry(Entry entry);
	public void  deleteEntry(Entry entry);
	public Entry finById(int id);
	public List<Entry> findAll();
	public List<Entry>findByUserId(int id);
	

}
