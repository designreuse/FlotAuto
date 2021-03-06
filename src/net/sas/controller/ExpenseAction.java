package net.sas.controller;

import java.util.List;

import net.sas.model.bo.Component;
import net.sas.model.bo.Expense;
import net.sas.model.bo.ExpenseType;
import net.sas.model.bo.Lubricant;
import net.sas.model.service.ExpenseService;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;

public class ExpenseAction implements Action {

	private static ExpenseService expenseService = new ExpenseService();

	private Integer id;
	private String expenseType;
	private Integer componentId;
	private Integer lubricantId;
	private String description;
	private Double cost;
	private Integer quantity;
	private Double totalCost;

	@Override
	public String execute() {
		expenseService.clear();
		return Action.INPUT;
	}

	public String list() {
		return execute();
	}

	public String view() {
		Integer index = Integer.parseInt(ServletActionContext.getRequest()
				.getParameter("index"));
		expenseService.view(index);
		return Action.INPUT;
	}

	public String save() {
		if (expenseType.equals(ExpenseType.COMPONENT.toString())) {
			expenseService.saveExpenseComponent(id, componentId, quantity);
		} else if (expenseType.equals(ExpenseType.LUBRICANT.toString())) {
			expenseService.saveExpenseLubricant(id, lubricantId, quantity);
		} else {
			expenseService.saveExpenseOther(id, description, cost, quantity);
		}
		return Action.INPUT;
	}

	public String delete() {
		expenseService.delete();
		return Action.INPUT;
	}

	public String clear() {
		expenseService.clear();
		return Action.INPUT;
	}

	public String previous() {
		expenseService.previous();
		return Action.INPUT;
	}

	public String next() {
		expenseService.next();
		return Action.INPUT;
	}

	public String first() {
		expenseService.first();
		return Action.INPUT;
	}

	public String last() {
		expenseService.last();
		return Action.INPUT;
	}

	public List<Expense> getExpenses() {
		return expenseService.getList();
	}

	public Expense getCurrentExpense() {
		return expenseService.getCurrentEntry();
	}

	public List<Lubricant> getAllLubricants() {
		return expenseService.getAllLubricants();
	}

	public List<Component> getAllComponents() {
		return expenseService.getAllComponents();
	}

	/* ------------------------------ GET/SET ------------------------------ */
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getExpenseType() {
		return expenseType;
	}

	public void setExpenseType(String expenseType) {
		this.expenseType = expenseType;
	}

	public Integer getComponentId() {
		return componentId;
	}

	public void setComponentId(Integer componentId) {
		this.componentId = componentId;
	}

	public Integer getLubricantId() {
		return lubricantId;
	}

	public void setLubricantId(Integer lubricantId) {
		this.lubricantId = lubricantId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
}
