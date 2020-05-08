package pe.edu.upc.serviceimpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.LoanDao;
import pe.edu.upc.entity.Loan;
import pe.edu.upc.serviceinterface.LoanService;

@Named
@RequestScoped
public class LoanServiceImpl implements LoanService, Serializable{
	private static final long serialVersionUID = 1L;
	@Inject
	private LoanDao iD;

	@Override
	public void insert(Loan i) {
		iD.insert(i);
	}

	@Override
	public List<Loan> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}
}

