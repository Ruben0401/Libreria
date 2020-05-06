package pe.edu.upc.serviceinterface;

import java.util.List;
import pe.edu.upc.entity.Books;

public interface BooksService {
	public void insert(Books i);

	public List<Books> list();
}