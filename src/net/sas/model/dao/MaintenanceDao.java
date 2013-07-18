package net.sas.model.dao;

import java.util.List;

import net.sas.model.bean.Component;
import net.sas.model.bean.Maintenance;
import net.sas.model.bean.MaintenanceProgram;
import net.sas.model.bean.Vehicle;

public class MaintenanceDao extends GenericDao<Maintenance> {

	private String searchQuery = "from Maintenance where";

	@SuppressWarnings("unchecked")
	public List<Component> findByVehicle(String registration) {
		VehicleDao dao = new VehicleDao();
		Vehicle v = dao.findByRegistration(registration);
		return template.find(searchQuery + " vehicle_id=?", v.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Maintenance> findByMaintenanceProgram(String description) {
		MaintenanceProgramDao dao = new MaintenanceProgramDao();
		MaintenanceProgram mp = dao.findByDescription(description);
		return template.find(searchQuery + " maintenanceProgram_id =?", mp.getId());
	}
}
