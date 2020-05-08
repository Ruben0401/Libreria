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
@Table(name = "Maintenance")
public class Maintenance implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMainte;
	
	private Date DateMainte;
	
	@Column(name = "MainteObserv", nullable = false, length = 50)
	private String MainteObserv;
	
	@ManyToOne
	@JoinColumn(name = "idlibros", nullable = false)
	private Books book;

	public Maintenance() {
		super();
		
	}
	public Maintenance(int idMainte, Date dateMainte, String mainteObserv, Books book) {
		super();
		this.idMainte = idMainte;
		DateMainte = dateMainte;
		MainteObserv = mainteObserv;
		this.book = book;
	}

	
	// get set
	public int getIdMainte() {
		return idMainte;
	}

	public void setIdMainte(int idMainte) {
		this.idMainte = idMainte;
	}

	public Date getDateMainte() {
		return DateMainte;
	}

	public void setDateMainte(Date dateMainte) {
		DateMainte = dateMainte;
	}

	public String getMainteObserv() {
		return MainteObserv;
	}

	public void setMainteObserv(String mainteObserv) {
		MainteObserv = mainteObserv;
	}

	public Books getBook() {
		return book;
	}

	public void setBook(Books book) {
		this.book = book;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
