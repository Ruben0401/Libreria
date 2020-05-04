package pe.edu.upc.serviceinterface;

import java.util.List;
import pe.edu.upc.entity.libros;

public interface IlibrosService {
	public void insert(libros i);

	public List<libros> list();
}