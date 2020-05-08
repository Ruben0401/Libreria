package pe.edu.upc.daointerface;
import java.util.List;

import pe.edu.upc.entity.Author;

public interface AuthorDao {
	public void insert(Author i);

	public List<Author> list();
}

