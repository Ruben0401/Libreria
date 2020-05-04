package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IlibrosDao;
import pe.edu.upc.entity.libros;

public class librosImpl implements IlibrosDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "PlibreriaDPanchito")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(libros i) {
		try {
			em.persist(i);
		} catch (Exception e) {

			System.out.println("Error en DAO insert librosImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<libros> list() {
		List<libros> lista = new ArrayList<libros>();
		try {
			Query q = em.createQuery("from libros i");
			lista = (List<libros>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error en DAO list libroImpl");
		}
		return lista;
	}



}
