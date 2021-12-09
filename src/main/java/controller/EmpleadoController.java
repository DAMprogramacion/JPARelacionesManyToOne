package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Departamento;
import model.Empleado;

public class EmpleadoController {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARelaciones3");
	public static void crearEmpleado(Empleado empleado, int idDepartamento) {
		EntityManager em = emf.createEntityManager();
		Departamento departamento = em.find(Departamento.class, idDepartamento);
		if (departamento == null) {
			em.close();
			return;
		}
		em.getTransaction().begin();
		departamento.addEmpleado(empleado);
		em.persist(empleado);
		em.getTransaction().commit();
		em.close();
	
	}
	
}
