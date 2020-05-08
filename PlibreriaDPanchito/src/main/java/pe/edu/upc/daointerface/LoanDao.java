package pe.edu.upc.daointerface;
import java.util.List;

import pe.edu.upc.entity.Loan;

public interface LoanDao {
	public void insert(Loan i);

	public List<Loan> list();
}
