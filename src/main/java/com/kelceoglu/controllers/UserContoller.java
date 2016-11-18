package com.kelceoglu.controllers;

import java.awt.DefaultFocusTraversalPolicy;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.hibernate.criterion.DetachedCriteria;

import com.kelceoglu.hibernate.DAO;
import com.kelceoglu.models.ExampleModel;


@ManagedBean 
@SessionScoped
public class UserContoller implements Serializable {
	
	private List<ExampleModel> returningExample;
	
	@PostConstruct
	public void init() {
		this.test();
	}
	
	
	public void test () {
		returningExample = new ArrayList<ExampleModel>();
		DetachedCriteria dc = DetachedCriteria.forClass(ExampleModel.class);
		this.setReturningExample((List<ExampleModel>) DAO.fetchDetachedCriteria(dc));
	}


	public List<ExampleModel> getReturningExample() {
		return returningExample;
	}


	public void setReturningExample(List<ExampleModel> returningExample) {
		this.returningExample = returningExample;
	}
	
	
}
