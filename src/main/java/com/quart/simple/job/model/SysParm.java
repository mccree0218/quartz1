package com.quart.simple.job.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SYS_PARM")
public class SysParm {

	@Id
	@Column(name = "PARM_CODE")
	private String parmCode;
	
	@Column(name = "PARM_NAME")
	private String parmName;
	
	@Column(name = "PARM_VALUE")
	private String parmValue;

	public String getParmCode() {
		return parmCode;
	}

	public void setParmCode(String parmCode) {
		this.parmCode = parmCode;
	}

	public String getParmName() {
		return parmName;
	}

	public void setParmName(String parmName) {
		this.parmName = parmName;
	}

	public String getParmValue() {
		return parmValue;
	}

	public void setParmValue(String parmValue) {
		this.parmValue = parmValue;
	}

	@Override
	public String toString() {
		return "SysParm [parmCode=" + parmCode + ", parmName=" + parmName + ", parmValue=" + parmValue + "]";
	}
	
	
}
