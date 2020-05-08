package pe.edu.upc.serviceimpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.UserDao;
import pe.edu.upc.entity.User;
import pe.edu.upc.serviceinterface.UserService;

@Named
@RequestScoped
public class UserServiceImpl implements UserService, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Inject
	private UserDao iD;
	
	@Override
	public void insert(User i) {
		iD.insert(i);
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}
}




	

