package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Loan")
public class Loan implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLoan;
	
	private Date DateLoan;
	
	@ManyToOne
	@JoinColumn(name = "idExample", nullable = false)
	private Example exam;
	
	private int CantBooks;
	
	private Date returnDate;
	
	@Column(name = "observ", nullable = false, length = 50)
	private String observ;
	
	@Column(name = "status", nullable = false, length = 50)
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "idUser", nullable = false)
	private User user;

	
	public Loan() {
		super();
		
	}
	public Loan(int idLoan, Date dateLoan, Example exam, int cantBooks, Date returnDate, String observ, String status,
			User user) {
		super();
		this.idLoan = idLoan;
		DateLoan = dateLoan;
		this.exam = exam;
		CantBooks = cantBooks;
		this.returnDate = returnDate;
		this.observ = observ;
		this.status = status;
		this.user = user;
	}
	public int getIdLoan() {
		return idLoan;
	}
	public void setIdLoan(int idLoan) {
		this.idLoan = idLoan;
	}
	public Date getDateLoan() {
		return DateLoan;
	}
	public void setDateLoan(Date dateLoan) {
		DateLoan = dateLoan;
	}
	public Example getExam() {
		return exam;
	}
	public void setExam(Example exam) {
		this.exam = exam;
	}
	public int getCantBooks() {
		return CantBooks;
	}
	public void setCantBooks(int cantBooks) {
		CantBooks = cantBooks;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public String getObserv() {
		return observ;
	}
	public void setObserv(String observ) {
		this.observ = observ;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
