package com.nt.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nt.entity.BankAccount;
import com.nt.utility.HibernateUtil;

public class UpdateObjectTest1 {

	public static void main(String[] args) {
		Session ses = null;
		BankAccount account = null;
		Transaction tx = null;
		boolean flag = false;
		//get session
		ses = HibernateUtil.getSession();
		try {
			//begin tx
			tx=ses.beginTransaction();
			//load object for partial modification of the object
			account = ses.get(BankAccount.class, 1001L);
			if(account!=null) {
				//modify object
				account.setBalance(410000);
				ses.update(account);
				flag = true;
			} else {
				System.out.println("record /object not found");
				return;
			}
		} catch(HibernateException e) {
			flag = false;
			e.printStackTrace();
		} finally {
			if(flag) {
				tx.commit();
				System.out.println("Object updated");
			} else {
				tx.rollback();
				System.out.println("object not updated");
			}
			HibernateUtil.closeSession(ses);
			HibernateUtil.closeSessionFactory();
		}
	}
}
