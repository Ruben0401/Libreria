package pe.edu.upc.serviceimpl;
import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.MaintenanceDao;
import pe.edu.upc.entity.Maintenance;
import pe.edu.upc.serviceinterface.MaintenanceService;

@Named
@RequestScoped
public class MaintenanceServiceImpl implements MaintenanceService, Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject
	private MaintenanceDao iD;

	@Override
	public void insert(Maintenance i) {
		iD.insert(i);
	}

	@Override
	public List<Maintenance> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}
}


