package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.libros;
import pe.edu.upc.serviceinterface.IlibrosService;


@Named
@RequestScoped
public class librosController implements Serializable {

	private static final long serialVersionUID = 1L;

	// variables
	@Inject
	private IlibrosService iService;
	

	private libros i;
	
	List<libros> listalibros;

	// constructor
	@PostConstruct
	public void init() {
		this.listalibros = new ArrayList<libros>();
		this.i = new libros();
		this.listarlibros();
	}

	// Metodos
	public String newlibros() {
		this.setI(new libros());
		return "libros.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanlistalibro();
			this.listarlibros();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listarlibros() {
		try {
			listalibros = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}



	public void cleanlistalibro() {
		this.init();
	}

	
	// getters y setters
	public IlibrosService getiService() {
		return iService;
	}

	public void setiService(IlibrosService iService) {
		this.iService = iService;
	}

	public libros getI() {
		return i;
	}

	public void setI(libros i) {
		this.i = i;
	}

	public List<libros> getListalibros() {
		return listalibros;
	}

	public void setListalibros(List<libros> listalibros) {
		this.listalibros = listalibros;
	}

}
