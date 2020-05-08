package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.MaintenanceDao;
import pe.edu.upc.entity.Maintenance;

public class MaintenanceImpl implements MaintenanceDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "PlibreriaDPanchito")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Maintenance i) {
		try {
			em.persist(i);
		} catch (Exception e) {

			System.out.println("Error en DAO insert MaintenanceImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Maintenance> list() {
		List<Maintenance> lista = new ArrayList<Maintenance>();
		try {
			Query q = em.createQuery("from Maintenance i");
			lista = (List<Maintenance>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error en DAO list MaintenanceImpl");
		}
		return lista;
	}
}

