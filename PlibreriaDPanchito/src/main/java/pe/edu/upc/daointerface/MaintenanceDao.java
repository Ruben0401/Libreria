package pe.edu.upc.daointerface;
import java.util.List;

import pe.edu.upc.entity.Maintenance;

public interface MaintenanceDao {
	public void insert(Maintenance i);

	public List<Maintenance> list();
}