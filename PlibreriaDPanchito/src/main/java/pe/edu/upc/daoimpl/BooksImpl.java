package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.BooksDao;
import pe.edu.upc.entity.Books;

public class BooksImpl implements BooksDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "PlibreriaDPanchito")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Books i) {
		try {
			em.persist(i);
		} catch (Exception e) {

			System.out.println("Error en DAO insert librosImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Books> list() {
		List<Books> lista = new ArrayList<Books>();
		try {
			Query q = em.createQuery("from Books i");
			lista = (List<Books>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error en DAO list libroImpl");
		}
		return lista;
	}



}
