package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Books;
import pe.edu.upc.serviceinterface.BooksService;


@Named
@RequestScoped
public class BooksController implements Serializable {

	private static final long serialVersionUID = 1L;

	// variables
	@Inject
	private BooksService iService;
	

	private Books i;
	
	List<Books> listalibros;

	// constructor
	@PostConstruct
	public void init() {
		this.listalibros = new ArrayList<Books>();
		this.i = new Books();
		this.listarlibros();
	}

	// Metodos
	public String newlibros() {
		this.setI(new Books());
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
	public BooksService getiService() {
		return iService;
	}

	public void setiService(BooksService iService) {
		this.iService = iService;
	}

	public Books getI() {
		return i;
	}

	public void setI(Books i) {
		this.i = i;
	}

	public List<Books> getListalibros() {
		return listalibros;
	}

	public void setListalibros(List<Books> listalibros) {
		this.listalibros = listalibros;
	}

}
