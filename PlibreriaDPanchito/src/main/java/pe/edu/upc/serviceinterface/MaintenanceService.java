package pe.edu.upc.serviceinterface;

import java.util.List;
import pe.edu.upc.entity.Maintenance;

public interface MaintenanceService {
	public void insert(Maintenance i);

	public List<Maintenance> list();
}
