package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.UserDao;
import pe.edu.upc.entity.User;

public class UserImpl implements UserDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "PlibreriaDPanchito")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(User i) {
		try {
			em.persist(i);
		} catch (Exception e) {

			System.out.println("Error en DAO insert UserImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> list() {
		List<User> lista = new ArrayList<User>();
		try {
			Query q = em.createQuery("from User i");
			lista = (List<User>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error en DAO list UserImpl");
		}
		return lista;
	}
}