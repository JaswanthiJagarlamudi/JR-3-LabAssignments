package com.cg.jhl01.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.cg.jhl01.entity.Author;
import com.cg.jhl01.util.JPAUtil;

public class App01 {

	public static void main(String[] args) {
		EntityManager em=JPAUtil.getEntityManager();
		Author a1=new Author(10L,"Jaswanthi","Chowdary","Jagarlamudi",1228912291);
		Author a2=new Author(11L,"Sai","Kumar","Narayanasetti",1728167297);
		Author a3=new Author(12L,"vishnu","Sahasrajith","Narayanasetti",1428645891);
		Author a4=new Author(13L,"Parineetha","Rinu","Kovelamudi",982785789);
		Author a5=new Author(14L,"Samyuktha","Sri","Thopuri",623456789);
		Author a6=new Author(15L,"Harsha","Vardhan","Mandadi",1237567891);
		EntityTransaction txn=em.getTransaction();
		txn.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		em.persist(a4);
		em.persist(a5);
		em.persist(a6);
		txn.commit();
		em.close();
		JPAUtil.shutdown();
	}

}
