package pe.edu.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Example;
import pe.edu.upc.serviceinterface.ExampleService;

@Named
@RequestScoped
public class ExampleController implements Serializable {

	private static final long serialVersionUID = 1L;
	// variables
	@Inject
	private ExampleService iService;
	

	private Example i;
	
	List<Example> listExample;

	// constructor
	@PostConstruct
	public void init() {
		this.listExample = new ArrayList<Example>();
		this.i = new Example();
		this.listarExample();
	}

	// Metodos
	public String newExample() {
		this.setI(new Example());
		return "libros.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanlistaExample();
			this.listarExample();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listarExample() {
		try {
			listExample = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}



	public void cleanlistaExample() {
		this.init();
	}

	
	//get set
	
	public ExampleService getiService() {
		return iService;
	}

	public void setiService(ExampleService iService) {
		this.iService = iService;
	}

	public Example getI() {
		return i;
	}

	public void setI(Example i) {
		this.i = i;
	}

	public List<Example> getListExample() {
		return listExample;
	}

	public void setListExample(List<Example> listExample) {
		this.listExample = listExample;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
