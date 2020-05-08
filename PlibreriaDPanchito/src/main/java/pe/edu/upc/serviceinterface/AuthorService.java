package pe.edu.upc.serviceinterface;
import java.util.List;
import pe.edu.upc.entity.Author;

public interface AuthorService {
	public void insert(Author i);

	public List<Author> list();
}
