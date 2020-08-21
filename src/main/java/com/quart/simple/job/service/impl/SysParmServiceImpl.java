package com.quart.simple.job.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.quart.simple.job.dao.SysParmDAO;
import com.quart.simple.job.model.SysParm;
import com.quart.simple.job.service.SysParmService;

@Service
public class SysParmServiceImpl implements SysParmService{
	
	@Autowired
	private SysParmDAO sysParmDAO;

	@Transactional
	public List<SysParm> findAll() {
		return sysParmDAO.findAll();
	}

}
