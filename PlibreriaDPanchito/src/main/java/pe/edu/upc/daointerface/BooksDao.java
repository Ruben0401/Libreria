package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Books;

public interface BooksDao {
	public void insert(Books i);

	public List<Books> list();

}
