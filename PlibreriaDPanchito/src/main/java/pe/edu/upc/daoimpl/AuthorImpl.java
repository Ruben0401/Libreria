package pe.edu.upc.daoimpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.AuthorDao;
import pe.edu.upc.entity.Author;


public class AuthorImpl implements AuthorDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "PlibreriaDPanchito")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Author i) {
		try {
			em.persist(i);
		} catch (Exception e) {

			System.out.println("Error en DAO insert AuthorImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Author> list() {
		List<Author> lista = new ArrayList<Author>();
		try {
			Query q = em.createQuery("from Author i");
			lista = (List<Author>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error en DAO list AuthorImpl");
		}
		return lista;
	}
}