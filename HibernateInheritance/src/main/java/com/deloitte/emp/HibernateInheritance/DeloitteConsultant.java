package com.deloitte.emp.HibernateInheritance;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;



@Entity
@DiscriminatorValue("testing consultant")
@NamedQuery(name="byTestTech",query ="from DeloitteConsultant where testTech=:tech") 

public class DeloitteConsultant extends Employee {
	

	private String testTech;
	private String testProfile;
	
	public DeloitteConsultant() {
		
	}

	public DeloitteConsultant( String testTech, String testProfile) {
		super();
	
		this.testTech = testTech;
		this.testProfile = testProfile;
	}

	public String getTestTech() {
		return testTech;
	}

	public void setTestTech(String testTech) {
		this.testTech = testTech;
	}

	public String getTestProfile() {
		return testProfile;
	}

	public void setTestProfile(String testProfile) {
		this.testProfile = testProfile;
	}

	@Override
	public String toString() {
		return "DeloitteConsultant [ testTech=" + testTech + ", testProfile=" + testProfile + "]";
	}
	
	
}
