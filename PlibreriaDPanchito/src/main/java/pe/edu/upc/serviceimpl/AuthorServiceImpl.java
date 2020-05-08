package pe.edu.upc.serviceimpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.AuthorDao;
import pe.edu.upc.entity.Author;
import pe.edu.upc.serviceinterface.AuthorService;

@Named
@RequestScoped
public class AuthorServiceImpl implements AuthorService, Serializable{
	private static final long serialVersionUID = 1L;
	@Inject
	private AuthorDao iD;

	@Override
	public void insert(Author i) {
		iD.insert(i);
	}

	@Override
	public List<Author> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}
}