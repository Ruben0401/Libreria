package pe.edu.upc.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Example")
public class Example implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idExample;
	
	private int cantExample;
	
	@ManyToOne
	@JoinColumn(name = "idlibros", nullable = false)
	private Books book;
	
	public Example() {
		super();
	}
	public Example(int idExample, int cantExample, Books book) {
		super();
		this.idExample = idExample;
		this.cantExample = cantExample;
		this.book = book;
	}

	public int getIdExample() {
		return idExample;
	}

	public void setIdExample(int idExample) {
		this.idExample = idExample;
	}

	public int getCantExample() {
		return cantExample;
	}

	public void setCantExample(int cantExample) {
		this.cantExample = cantExample;
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
