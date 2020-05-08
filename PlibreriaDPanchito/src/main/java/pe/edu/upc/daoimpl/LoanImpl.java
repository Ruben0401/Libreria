package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.LoanDao;
import pe.edu.upc.entity.Loan;

public class LoanImpl implements LoanDao, Serializable{
	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "PlibreriaDPanchito")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Loan i) {
		try {
			em.persist(i);
		} catch (Exception e) {

			System.out.println("Error en DAO insert LoanImpl");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Loan> list() {
		List<Loan> lista = new ArrayList<Loan>();
		try {
			Query q = em.createQuery("from Loan i");
			lista = (List<Loan>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error en DAO list LoanImpl");
		}
		return lista;
	}
}

