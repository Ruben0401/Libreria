package pe.edu.upc.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;

	@Column(name = "Name", nullable = false, length = 50)
	private String Name;
	
	@Column(name = "LastName", nullable = false, length = 50)
	private String LastName;
	
	private int DNI;
	
	@Column(name = "email", nullable = false, length = 50)
	private String email;
	
	@Column(name ="Function", nullable = false, length = 50)
	private String Function;
	
	@Column(name ="Password", nullable = false, length = 50)
	private String Password;
	
	public User() {
		super();
		
	}
	public User(int idUser, String name, String lastName, int dNI, String email, String function, String password) {
		super();
		this.idUser = idUser;
		Name = name;
		LastName = lastName;
		DNI = dNI;
		this.email = email;
		Function = function;
	    Password = password;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	//get set
	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
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


	public int getDNI() {
		return DNI;
	}


	public void setDNI(int dNI) {
		DNI = dNI;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getFunction() {
		return Function;
	}


	public void setFunction(String function) {
		Function = function;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	
}
