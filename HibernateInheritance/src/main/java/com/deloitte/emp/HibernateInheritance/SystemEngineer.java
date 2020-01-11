package com.deloitte.emp.HibernateInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("System Engg.")
public class SystemEngineer extends Employee{

	private String lang;
	private String devProfile;
	
	public SystemEngineer() {
		
	}
	public SystemEngineer( String lang, String devProfile) {
		super();
		this.lang = lang;
		this.devProfile = devProfile;
	}

	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getDevProfile() {
		return devProfile;
	}
	public void setDevProfile(String devProfile) {
		this.devProfile = devProfile;
	}
	@Override
	public String toString() {
		return "SystemEngineer [ lang=" + lang + ", devProfile=" + devProfile + "]";
	}
	
	
}
