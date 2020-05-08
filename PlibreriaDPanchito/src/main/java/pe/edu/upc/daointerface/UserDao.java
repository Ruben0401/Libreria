package pe.edu.upc.daointerface;
import java.util.List;

import pe.edu.upc.entity.User;

public interface UserDao {
	public void insert(User i);

	public List<User> list();
}

