package com.skcc.springboot.data;

import java.util.LinkedList;

public class DataSet {
	private LinkedList<String> ds = new LinkedList<>();
			
	public DataSet() { 
		ds.add("1");
		ds.add("2");
		ds.add("3");
		ds.add("4");
		ds.add("5");
		ds.add("6");
	}

	public LinkedList<String> getDs() {
		return ds;
	}

	public void setDs(LinkedList<String> ds) {
		this.ds = ds;
	} 
	
	public LinkedList<String> setDsAsQueue(String strValue) {
		this.ds.addFirst(strValue);
		return this.ds;
	} 
	public LinkedList<String> setDsAsStack(String strValue) {
		this.ds.addLast(strValue);
		return this.ds;
	} 
	public String getDsAsQueue() {
		return ds.removeLast();
	}
	public String getDsAsStack() {
		return ds.removeLast();
	}
	

	
	
}
