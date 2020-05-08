package pe.edu.upc.serviceinterface;

import java.util.List;
import pe.edu.upc.entity.Example;

public interface ExampleService {
	public void insert(Example i);

	public List<Example> list();
}
