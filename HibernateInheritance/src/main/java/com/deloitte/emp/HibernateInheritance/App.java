package com.deloitte.emp.HibernateInheritance;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sf= new Configuration()
        		.configure()
        		.addAnnotatedClass(Employee.class)
        		.addAnnotatedClass(SystemEngineer.class)
        		.addAnnotatedClass(DeloitteConsultant.class)
        		.buildSessionFactory();
     
        SystemEngineer se = new SystemEngineer();
        se.setEmpId(102);										// FOR CREATE
        se.setDevProfile("Web Developer");
        se.setEmpName("Hashir");
        se.setLang("Java");
        
        DeloitteConsultant dc = new DeloitteConsultant();
        dc.setEmpId(202);
        dc.setEmpName("Sidharth");
        dc.setTestProfile("System Testing");
        dc.setTestTech("Selenium");
        
        Session sn= sf.openSession();
        Transaction t=sn.beginTransaction();
        sn.save(se);
        sn.save(dc);
        
        t.commit();

        // QUERY TO GET THE DETAILS OF A SE WORKING WITH JAVA AS QUREY.      
        //    	FOR <UPDATE> in HIBERNATE.

//        Session sn= sf.openSession();
//        Query q = sn.createQuery("from SystemEngineer where lang=:Java");	
//        q.setParameter("Java","Java");
//        SystemEngineer se =(SystemEngineer)q.getSingleResult();
        
//       //SystemEngineer se = sn.get( SystemEngineer.class,102);  // SEARCHING BY ID
//        sn.close();
      
//        System.out.println("Emp ID - " +se.getEmpId());
//        System.out.println("Emp Name - "+se.getEmpName());
//        System.out.println("Dev Profile -"+se.getDevProfile());
//        System.out.println("Language - "+se.getLang());
       
        // SAME ABOVE CODE AS QUERY
        // TypedQuery<SystemEngineer> q = sn.createQuery("from SystemEngineer where lang:Java");
        //
//      //PRINTING DATA USING CRITERIA.
//        Session sn= sf.openSession();
//        Criteria ctr = sn.createCriteria(DeloitteConsultant.class);
//        ctr.add(Restrictions.eq("testTech","Selenium"));
//        System.out.println(ctr.list());
//        sn.close();
    }
}
