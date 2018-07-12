package Paquete2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Paquete.Departamento;

public class JpaTest {

	private EntityManager manager;
	public JpaTest(EntityManager manager){
		this.manager=manager;
	}
	
	public static void main(String[]args){
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("persistenceUnit");
	EntityManager em = factory.createEntityManager();
	JpaTest test = new JpaTest(em);
	EntityTransaction tx = em.getTransaction();
	tx.begin();
	tx.commit();
	}
	private void crearEmpleados(){
		Departamento lima = new Departamento();
		lima.setNombre("Lima");
		manager.persist(lima);
	}
	

	public EntityManager getManager() {
		return manager;
	}

	public void setManager(EntityManager manager) {
		this.manager = manager;
	}
	
}
