package pe.edu.upc.controller;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Maintenance;
import pe.edu.upc.serviceinterface.MaintenanceService;

@Named
@RequestScoped
public class MaintenanceController implements Serializable{
	private static final long serialVersionUID = 1L;
	// variables
	@Inject
	private MaintenanceService iService;
	

	private Maintenance i;
	
	List<Maintenance> listMaintenance;

	// constructor
	@PostConstruct
	public void init() {
		this.listMaintenance = new ArrayList<Maintenance>();
		this.i = new Maintenance();
		this.listarMaintenance();
	}

	// Metodos
	public String newMaintenance() {
		this.setI(new Maintenance());
		return "libros.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanlistaMaintenance();
			this.listarMaintenance();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void listarMaintenance() {
		try {
			listMaintenance = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}



	public void cleanlistaMaintenance() {
		this.init();
	}
	//get set 
	public MaintenanceService getiService() {
		return iService;
	}

	public void setiService(MaintenanceService iService) {
		this.iService = iService;
	}

	public Maintenance getI() {
		return i;
	}

	public void setI(Maintenance i) {
		this.i = i;
	}

	public List<Maintenance> getListMaintenance() {
		return listMaintenance;
	}

	public void setListMaintenance(List<Maintenance> listMaintenance) {
		this.listMaintenance = listMaintenance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
