package net.sas.controller;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import net.sas.model.bo.Employee;
import net.sas.model.bo.Maintenance;
import net.sas.model.bo.Vehicle;
import net.sas.model.bo.WorkOrder;
import net.sas.model.service.WorkOrderService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class WorkOrderAction implements Action, ModelDriven<WorkOrder> {

	private static WorkOrderService workOrderService = new WorkOrderService();
	private WorkOrder workOrder = new WorkOrder();
	private String vehicleId;
	private String employeeRequestingId;
	private String employeesInChargeList;
	private String maintenanceList;

	@Override
	public WorkOrder getModel() {
		return workOrder;
	}

	@Override
	public String execute() {
		return Action.INPUT;
	}

	public String list() {
		return execute();
	}

	public String view() {
		Integer index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		workOrderService.view(index);
		return Action.INPUT;
	}

	public String save() {
		workOrderService.save(workOrder, vehicleId, employeeRequestingId,
				employeesInChargeList, maintenanceList);
		return Action.INPUT;
	}

	public String delete() {
		workOrderService.delete();
		return Action.INPUT;
	}

	public String clear() {
		workOrderService.clear();
		return Action.INPUT;
	}

	public String previous() {
		workOrderService.previous();
		return Action.INPUT;
	}

	public String next() {
		workOrderService.next();
		return Action.INPUT;
	}

	public String first() {
		workOrderService.first();
		return Action.INPUT;
	}

	public String last() {
		workOrderService.last();
		return Action.INPUT;
	}

	public List<WorkOrder> getWorkOrders() {
		return workOrderService.getList();
	}

	public WorkOrder getCurrentWorkOrder() {
		return workOrderService.getCurrentEntry();
	}

	public List<Vehicle> getAllVehicles() {
		return workOrderService.getAllVehicles();
	}

	public List<Employee> getAllEmployees() {
		return workOrderService.getAllEmployees();
	}

	public List<Maintenance> getAllMaintenances() {
		return workOrderService.getAllMaintenances();
	}

	/* ------------------------- get/set ------------------------- */
	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getEmployeeRequestingId() {
		return employeeRequestingId;
	}

	public void setEmployeeRequestingId(String employeeRequestingId) {
		this.employeeRequestingId = employeeRequestingId;
	}

	public String getEmployeesInChargeList() {
		return employeesInChargeList;
	}

	public void setEmployeesInChargeList(String employeesInChargeList) {
		this.employeesInChargeList = employeesInChargeList;
	}

	public String getMaintenanceList() {
		return maintenanceList;
	}

	public void setMaintenanceList(String maintenanceList) {
		this.maintenanceList = maintenanceList;
	}
}
