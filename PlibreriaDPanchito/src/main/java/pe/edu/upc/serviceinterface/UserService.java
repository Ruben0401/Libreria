package pe.edu.upc.serviceinterface;

import java.util.List;
import pe.edu.upc.entity.User;

public interface UserService {
	public void insert(User i);
	
	public List<User>list ();
}
