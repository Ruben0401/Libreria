package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.BooksDao;
import pe.edu.upc.entity.Books;
import pe.edu.upc.serviceinterface.BooksService;

@Named
@RequestScoped
public class BooksServiceImpl implements BooksService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private BooksDao iD;

	@Override
	public void insert(Books i) {
		iD.insert(i);
	}

	@Override
	public List<Books> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}

}