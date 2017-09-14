package com.skcc.springboot.data;

import java.util.LinkedList;

public interface DataService {

	LinkedList<String> ds = new LinkedList<>();	
	public LinkedList<String> DataInit();	
	
	public LinkedList<String> putData(String strValue);
	public String getData();
	public LinkedList<String> getDs();
}
