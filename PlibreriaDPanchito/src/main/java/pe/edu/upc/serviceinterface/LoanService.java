package pe.edu.upc.serviceinterface;

import java.util.List;
import pe.edu.upc.entity.Loan;

public interface LoanService {
	public void insert(Loan i);

	public List<Loan> list();
}