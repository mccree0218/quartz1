package com.quart.simple.job.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quart.simple.job.dao.SysParmDAO;
import com.quart.simple.job.model.SysParm;

@Repository
public class SysParmDAOImpl implements SysParmDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<SysParm> findAll() {
		return sessionFactory.getCurrentSession().createQuery("from SysParm ").list();
	}

}
