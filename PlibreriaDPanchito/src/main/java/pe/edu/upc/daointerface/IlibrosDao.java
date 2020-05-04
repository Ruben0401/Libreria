package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.libros;

public interface IlibrosDao {
	public void insert(libros i);

	public List<libros> list();

}
