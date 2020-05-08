package pe.edu.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Author;
import pe.edu.upc.serviceinterface.AuthorService;

@Named
@RequestScoped
public class AuthorController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	// variables
	@Inject
	private AuthorService iService;
	

	private Author i;
	
	List<Author> listAuthor;

	// constructor
	@PostConstruct
	public void init() {
		this.listAuthor = new ArrayList<Author>();
		this.i = new Author();
		this.listarAuthor();
	}

	// Metodos
	public String newAuthor() {
		this.setI(new Author());
		return "libros.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanlistaAuthor();
			this.listarAuthor();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listarAuthor() {
		try {
			listAuthor = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}



	public void cleanlistaAuthor() {
		this.init();
	}

	
	//Get set
	public AuthorService getiService() {
		return iService;
	}

	public void setiService(AuthorService iService) {
		this.iService = iService;
	}

	public Author getI() {
		return i;
	}

	public void setI(Author i) {
		this.i = i;
	}

	public List<Author> getListAuthor() {
		return listAuthor;
	}

	public void setListAuthor(List<Author> listAuthor) {
		this.listAuthor = listAuthor;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
