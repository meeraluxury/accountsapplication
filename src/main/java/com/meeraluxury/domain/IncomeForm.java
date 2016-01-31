package com.meeraluxury.domain;

import java.util.Date;

public class IncomeForm {
	
	private Date date;
	
	private String busNumber;
	
	private Long incomeColumn1;
	
	private Long incomeColumn2;
	
	private Long incomeColumn3;
	
	private Long incomeColumn4;
	
	private Long incomeColumn5;
	
	private Long incomeColumn6;
	
	private Long incomeColumn7;
	
	private Long incomeColumn8;
	
	private Long incomeColumn9;
	
	private Long incomeColumn10;
	
	private String remarks;
	
	private String submittedBy;
	
	private Expense expense;
	
	public Expense getExpense() {
		return expense;
	}

	public void setExpense(Expense expense) {
		this.expense = expense;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}

	public Long getIncomeColumn1() {
		return incomeColumn1;
	}

	public void setIncomeColumn1(Long incomeColumn1) {
		this.incomeColumn1 = incomeColumn1;
	}

	public Long getIncomeColumn2() {
		return incomeColumn2;
	}

	public void setIncomeColumn2(Long incomeColumn2) {
		this.incomeColumn2 = incomeColumn2;
	}

	public Long getIncomeColumn3() {
		return incomeColumn3;
	}

	public void setIncomeColumn3(Long incomeColumn3) {
		this.incomeColumn3 = incomeColumn3;
	}

	public Long getIncomeColumn4() {
		return incomeColumn4;
	}

	public void setIncomeColumn4(Long incomeColumn4) {
		this.incomeColumn4 = incomeColumn4;
	}

	public Long getIncomeColumn5() {
		return incomeColumn5;
	}

	public void setIncomeColumn5(Long incomeColumn5) {
		this.incomeColumn5 = incomeColumn5;
	}

	public Long getIncomeColumn6() {
		return incomeColumn6;
	}

	public void setIncomeColumn6(Long incomeColumn6) {
		this.incomeColumn6 = incomeColumn6;
	}

	public Long getIncomeColumn7() {
		return incomeColumn7;
	}

	public void setIncomeColumn7(Long incomeColumn7) {
		this.incomeColumn7 = incomeColumn7;
	}

	public Long getIncomeColumn8() {
		return incomeColumn8;
	}

	public void setIncomeColumn8(Long incomeColumn8) {
		this.incomeColumn8 = incomeColumn8;
	}

	public Long getIncomeColumn9() {
		return incomeColumn9;
	}

	public void setIncomeColumn9(Long incomeColumn9) {
		this.incomeColumn9 = incomeColumn9;
	}

	public Long getIncomeColumn10() {
		return incomeColumn10;
	}

	public void setIncomeColumn10(Long incomeColumn10) {
		this.incomeColumn10 = incomeColumn10;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSubmittedBy() {
		return submittedBy;
	}

	public void setSubmittedBy(String submittedBy) {
		this.submittedBy = submittedBy;
	}	
	
	public Income toIncome(){
		return new Income(date, 
				busNumber,
				incomeColumn1,
				incomeColumn2,
				incomeColumn3,
				incomeColumn4,
				incomeColumn5,
				incomeColumn6,
				incomeColumn7,
				incomeColumn8,
				incomeColumn9,
				incomeColumn10,
				remarks,
				submittedBy,
				expense
				);
	}
}
