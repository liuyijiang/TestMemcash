package org.test.bo;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = -4946099913289572463L;
	
	private Integer id;
	private String name;
	private Date join;
	private Double pay;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getJoin() {
		return join;
	}
	public void setJoin(Date join) {
		this.join = join;
	}
	public Double getPay() {
		return pay;
	}
	public void setPay(Double pay) {
		this.pay = pay;
	}
	
	
	
}
