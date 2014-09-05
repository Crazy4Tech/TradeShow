package com.tradeshow.service;

import java.util.List;

public interface IService<T> {

	
	public boolean add(T t);
	
	public boolean delete(T t);
	
	public boolean update(T t);
	
	public List<T> find(T t);
	
}
