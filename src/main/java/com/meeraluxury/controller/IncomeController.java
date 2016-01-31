package com.meeraluxury.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.meeraluxury.db.IncomeRepository;
import com.meeraluxury.domain.Income;
import com.meeraluxury.domain.IncomeForm;

@Controller
@RequestMapping("/income")
public class IncomeController {
	
	private IncomeRepository repository;
	
	@Autowired
	public IncomeController(IncomeRepository repository){
		this.repository = repository;
	}
	
	@RequestMapping("/")
	public void getIncome(){
		Iterable<Income> incomes = repository.findAll();
		//while(in)
		Iterator<Income> itr = incomes.iterator();
		while(itr.hasNext()){
			System.out.println("Id - "+itr.next().getSubmittedBy());
		}
		//return "dailyupdates";
		
	}
	
	@RequestMapping(value="/add", method=GET)
	public String addIncome(Model model){
		model.addAttribute(new IncomeForm());
		model.addAttribute("name", "Suman Kumar");
		return "addIncome";
	}
	
	@RequestMapping(value="/add", method=POST)
	public String saveIncome(IncomeForm incomeForm, 
			RedirectAttributes model){
		System.out.println("Income - "+incomeForm.getIncomeColumn1());
		System.out.println("Expense - "+incomeForm.getExpense().getExpenseColumn1());
		
		Income income = repository.save(incomeForm.toIncome());
		Income income1 = repository.findOne(income.getId());
		System.out.println("Incoem ID - "+income1.getId());
		System.out.println("Expense ID - "+income1.getExpense().getExpenseColumn1());
		model.addAttribute("incomeId", income.getId());
		model.addAttribute("income", income);
		return "redirect:/income/{incomeId}";
	}
	
	@RequestMapping(value="{incomeId}", method=GET)
	public String getIncome(@PathVariable String incomeId, Model model){
		if(!model.containsAttribute("incomeForm")){
			Income income = repository.findOne(Long.getLong(incomeId));
			model.addAttribute("incomeForm",income);
		}
		return "viewincome";
	}
	
}
