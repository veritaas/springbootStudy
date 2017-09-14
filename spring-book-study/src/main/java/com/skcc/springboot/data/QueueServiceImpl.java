package com.skcc.springboot.data;


import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.skcc.springboot.user.dao.User;
import com.skcc.springboot.user.dao.UserMapper;

@Service
@Transactional
@Profile("s1")
public class QueueServiceImpl implements DataService{

//	@Autowired 
//    private DataSet ds;
//	private DataSet ds = new DataSet();
	
	@Override
	public LinkedList<String> DataInit() {
		// TODO Auto-generated method stub
		ds.add("1");
		ds.add("2");
		ds.add("3");
		ds.add("4");
		ds.add("5");
		ds.add("6");
		return ds;
	}
	
	
	@Override
	public LinkedList<String> putData(String strValue) {
		
//		ds.setDsAsQueue(strValue);
//		return ds.getDs();
		ds.addFirst(strValue);
		return ds;
	}



	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return ds.removeLast();
		
	}
	 
	@Override
	public LinkedList<String> getDs() {
		// TODO Auto-generated method stub
		return ds;
	}
	

}
