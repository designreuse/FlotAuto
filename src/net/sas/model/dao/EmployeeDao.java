package net.sas.model.dao;

import java.util.List;

import net.sas.model.bo.DrivingLicense;
import net.sas.model.bo.Employee;
import net.sas.model.enums.Occupation;
import net.sas.model.service.ContextUtil;

@SuppressWarnings("unchecked")
public class EmployeeDao extends GenericDao<Employee> {

	private String searchQuery = "from Employee where";
	
	public List<Employee> findByLastName(String lastName) {
		return template.find(searchQuery + " lastName=?", lastName);
	}

	public List<Employee> findByFirstName(String firstName) {
		return template.find(searchQuery + " firstName=?", firstName);
	}
	
	public List<Employee> findByOccupation(Occupation occupation) {
		return template.find(searchQuery + " occupation=?", occupation);
	}

	public Employee findByNumber(String number) {
		return (Employee) template.find(searchQuery + " number=?", number).get(
				0);
	}

	public Employee findByCin(String cin) {
		return (Employee) template.find(searchQuery + " cin=?", cin).get(0);
	}

	public Employee findByDrivingLicense(String licenseNbr) {
		DrivingLicense l = ((DrivingLicenseDao) ContextUtil.getInstance()
				.getBean("licenseDao")).findByNumber(licenseNbr);
		return (Employee) template.find(searchQuery + " drivingLicense_id=?",
				l.getId()).get(0);
	}
}
