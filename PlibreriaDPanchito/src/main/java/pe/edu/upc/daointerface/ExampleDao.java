package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Example;


public interface ExampleDao {
	public void insert(Example i);

	public List<Example> list();
	
}
