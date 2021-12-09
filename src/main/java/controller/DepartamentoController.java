package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Departamento;

public class DepartamentoController {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPARelaciones3");

	public static void crearDepartamento(Departamento departamento) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(departamento);
		em.getTransaction().commit();
		em.close();
	}

	public static List<Departamento> obtenerTodosDepartamentos() {
		List<Departamento> departamentos = null;
		EntityManager em = emf.createEntityManager();
		Query query = em.createNamedQuery("Departamento.findAll");
		departamentos = query.getResultList();
		for (Departamento departamento : departamentos) {
			departamento.getEmpleados().size();
		}
		em.close();
		// departamentos.size();
		return departamentos;
	}

	public static Departamento obtenerDepartamentoPorId(int id) {
		Departamento departamento = null;
		EntityManager em = emf.createEntityManager();
		departamento = em.find(Departamento.class, id);
		if (departamento != null)
			departamento.getEmpleados().size();
		em.close();
		return departamento;
	}

	public static void borrarDepartamentoPorId(int id) {
		EntityManager em = emf.createEntityManager();
		Departamento departamento = em.find(Departamento.class, id);
		if (departamento == null) {
			em.close();
			return;
		}
		em.getTransaction().begin();
		em.remove(departamento);
		em.getTransaction().commit();
		em.close();
	}

}
