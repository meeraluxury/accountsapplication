package com.meeraluxury.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private Long expenseColumn1;
	
	private Long expenseColumn2;
	
	private Long expenseColumn3;
	
	private Long expenseColumn4;
	
	private Long expenseColumn5;
	
	private Long expenseColumn6;
	
	private Long expenseColumn7;
	
	private Long expenseColumn8;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getExpenseColumn1() {
		return expenseColumn1;
	}

	public void setExpenseColumn1(Long expenseColumn1) {
		this.expenseColumn1 = expenseColumn1;
	}

	public Long getExpenseColumn2() {
		return expenseColumn2;
	}

	public void setExpenseColumn2(Long expenseColumn2) {
		this.expenseColumn2 = expenseColumn2;
	}

	public Long getExpenseColumn3() {
		return expenseColumn3;
	}

	public void setExpenseColumn3(Long expenseColumn3) {
		this.expenseColumn3 = expenseColumn3;
	}

	public Long getExpenseColumn4() {
		return expenseColumn4;
	}

	public void setExpenseColumn4(Long expenseColumn4) {
		this.expenseColumn4 = expenseColumn4;
	}

	public Long getExpenseColumn5() {
		return expenseColumn5;
	}

	public void setExpenseColumn5(Long expenseColumn5) {
		this.expenseColumn5 = expenseColumn5;
	}

	public Long getExpenseColumn6() {
		return expenseColumn6;
	}

	public void setExpenseColumn6(Long expenseColumn6) {
		this.expenseColumn6 = expenseColumn6;
	}

	public Long getExpenseColumn7() {
		return expenseColumn7;
	}

	public void setExpenseColumn7(Long expenseColumn7) {
		this.expenseColumn7 = expenseColumn7;
	}

	public Long getExpenseColumn8() {
		return expenseColumn8;
	}

	public void setExpenseColumn8(Long expenseColumn8) {
		this.expenseColumn8 = expenseColumn8;
	}
}
