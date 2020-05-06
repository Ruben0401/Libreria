package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Books")
public class Books implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idlibros;

	@Column(name = "nombreLibro", nullable = false, length = 50)
	private String nombreLibro;
	
	private Date FechaIngreso;
	
	private int NumEdicion;
	private int NumSerie;
	
	@Column(name ="idiomaLibro", nullable = false, length = 50)
	private String idiomaLibro;
	public Books() {
		super();
		
	}

	public Books(int idlibros, String nombreLibro, Date fechaIngreso, int numEdicion, int numSerie,
			String idiomaLibro) {
		super();
		this.idlibros = idlibros;
		this.nombreLibro = nombreLibro;
		FechaIngreso = fechaIngreso;
		NumEdicion = numEdicion;
		NumSerie = numSerie;
		this.idiomaLibro = idiomaLibro;
	}

	public int getIdlibros() {
		return idlibros;
	}

	public void setIdlibros(int idlibros) {
		this.idlibros = idlibros;
	}

	public String getNombreLibro() {
		return nombreLibro;
	}

	public void setNombreLibro(String nombreLibro) {
		this.nombreLibro = nombreLibro;
	}

	public Date getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	public int getNumEdicion() {
		return NumEdicion;
	}

	public void setNumEdicion(int numEdicion) {
		NumEdicion = numEdicion;
	}

	public int getNumSerie() {
		return NumSerie;
	}

	public void setNumSerie(int numSerie) {
		NumSerie = numSerie;
	}

	public String getIdiomaLibro() {
		return idiomaLibro;
	}

	public void setIdiomaLibro(String idiomaLibro) {
		this.idiomaLibro = idiomaLibro;
	}

}