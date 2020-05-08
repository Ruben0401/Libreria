package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mindrot.jbcrypt.BCrypt;


import pe.edu.upc.entity.User;

@Named
@ViewScoped
public class RegisterController implements Serializable {

	private static final long serialVersionUID = 1L;

	private User user;

	@PostConstruct
	public void init() {
		
		this.user = new User();
	}

	public String registerUser() {
		String redirect = null;
		try {
			String password = this.user.getPassword();
			String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
			this.user.setPassword(passwordHash);
			redirect = "index?faces-redirect=true";
		} catch (Exception e) {

		}

		return redirect;
	}



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
