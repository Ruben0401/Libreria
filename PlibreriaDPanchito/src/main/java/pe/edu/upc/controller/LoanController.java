package pe.edu.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Loan;
import pe.edu.upc.serviceinterface.LoanService;

@Named
@RequestScoped
public class LoanController implements Serializable {
	private static final long serialVersionUID = 1L;
	// variables
	@Inject
	private LoanService iService;
	

	private Loan i;
	
	List<Loan> listLoan;

	// constructor
	@PostConstruct
	public void init() {
		this.listLoan = new ArrayList<Loan>();
		this.i = new Loan();
		this.listarLoan();
	}

	// Metodos
	public String newLoan() {
		this.setI(new Loan());
		return "libros.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanlistaLoan();
			this.listarLoan();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listarLoan() {
		try {
			listLoan = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}



	public void cleanlistaLoan() {
		this.init();
	}

	public LoanService getiService() {
		return iService;
	}

	public void setiService(LoanService iService) {
		this.iService = iService;
	}

	public Loan getI() {
		return i;
	}

	public void setI(Loan i) {
		this.i = i;
	}

	public List<Loan> getListLoan() {
		return listLoan;
	}

	public void setListLoan(List<Loan> listLoan) {
		this.listLoan = listLoan;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
