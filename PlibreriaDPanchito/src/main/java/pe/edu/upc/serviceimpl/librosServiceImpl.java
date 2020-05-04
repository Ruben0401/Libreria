package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IlibrosDao;
import pe.edu.upc.entity.libros;
import pe.edu.upc.serviceinterface.IlibrosService;

@Named
@RequestScoped
public class librosServiceImpl implements IlibrosService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IlibrosDao iD;

	@Override
	public void insert(libros i) {
		iD.insert(i);
	}

	@Override
	public List<libros> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}

}