package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.User;
import pe.edu.upc.serviceinterface.UserService;

@Named
@RequestScoped
public class UserController implements Serializable{
	
	private static final long serialVersionUID = 1L;
	// variables
	@Inject
	private UserService iService;
	

	private User i;
	
	List<User> listUsers;

	// constructor
	@PostConstruct
	public void init() {
		this.listUsers = new ArrayList<User>();
		this.i = new User();
		this.listarUsers();
	}

	// Metodos
	public String newusers() {
		this.setI(new User());
		return "libros.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanlistausers();
			this.listarUsers();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listarUsers() {
		try {
			listUsers = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}



	public void cleanlistausers() {
		this.init();
	}
	
	// get set
	public UserService getiService() {
		return iService;
	}

	public void setiService(UserService iService) {
		this.iService = iService;
	}

	public User getI() {
		return i;
	}

	public void setI(User i) {
		this.i = i;
	}

	public List<User> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<User> listUsers) {
		this.listUsers = listUsers;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
