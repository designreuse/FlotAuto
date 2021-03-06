package net.sas.model.bo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class ExpenseLubricant extends Expense {

	@OneToOne(orphanRemoval = true)
	@JoinColumn(name = "lubricant_id")
	@Cascade(value = { CascadeType.SAVE_UPDATE })
	private Lubricant lubricant;

	public Lubricant getLubricant() {
		return lubricant;
	}
	public void setLubricant(Lubricant lubricant) {
		this.lubricant = lubricant;
	}

	public Double getCost() {
		return lubricant.getPrice();
	}
	public String getDetails() {
		return lubricant.getDetails();
	}

	public ExpenseType getType() {
		return ExpenseType.LUBRICANT;
	}
}
