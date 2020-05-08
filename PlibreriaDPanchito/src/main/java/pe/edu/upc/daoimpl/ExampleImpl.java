package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.ExampleDao;
import pe.edu.upc.entity.Example;

public class ExampleImpl implements ExampleDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "PlibreriaDPanchito")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Example i) {
		try {
			em.persist(i);
		} catch (Exception e) {

			System.out.println("Error en DAO insert ExampleImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Example> list() {
		List<Example> lista = new ArrayList<Example>();
		try {
			Query q = em.createQuery("from Example i");
			lista = (List<Example>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error en DAO list ExampleImpl");
		}
		return lista;
	}
}

