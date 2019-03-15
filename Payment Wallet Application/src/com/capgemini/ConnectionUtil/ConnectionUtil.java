package com.capgemini.ConnectionUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionUtil {
	
	
	public EntityManager getConnection()
	{
		try {
			EntityManagerFactory efactory=Persistence.createEntityManagerFactory("Sachin");
			EntityManager entitymanager=efactory.createEntityManager();
			return entitymanager;
		}catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
		
	}

}
