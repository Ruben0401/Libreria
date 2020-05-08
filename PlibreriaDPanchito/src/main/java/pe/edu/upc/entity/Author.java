package pe.edu.upc.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Author")
public class Author implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAuthor;
	
	@Column(name = "Name", nullable = false, length = 50)
	private String Name;
	
	@Column(name = "LastName", nullable = false, length = 50)
	private String LastName;

	public Author() {
		super();
	}
	
	public Author(int idAuthor, String name, String lastName) {
		super();
		this.idAuthor = idAuthor;
		Name = name;
		LastName = lastName;
	}

	
	// get set
	public int getIdAuthor() {
		return idAuthor;
	}

	public void setIdAuthor(int idAuthor) {
		this.idAuthor = idAuthor;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
