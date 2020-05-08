package pe.edu.upc.serviceimpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.ExampleDao;
import pe.edu.upc.entity.Example;
import pe.edu.upc.serviceinterface.ExampleService;

@Named
@RequestScoped
public class ExampleServiceImpl implements ExampleService, Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject
	private ExampleDao iD;

	@Override
	public void insert(Example i) {
		iD.insert(i);
	}

	@Override
	public List<Example> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}
}