package com.nt.utility;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	static {
		Configuration cfg = null;
		try {
			//bootstrap hibernate
			cfg = new Configuration();
			//input hb cfg file
			cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
			//create sessionfactory object
			factory = cfg.buildSessionFactory();
		}catch(HibernateException he) {
			he.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Session getSession() {
		Session ses = null;
		if(factory!=null)
			ses = factory.openSession();
		return ses;
	}
	
	public static void closeSession(Session ses) {
		if(ses!=null)
			ses.close();
	}
	
	public static void closeSessionFactory() {
		if(factory!=null)
			factory.close();
	}
}
