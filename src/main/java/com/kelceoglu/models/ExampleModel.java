package com.kelceoglu.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_example")
public class ExampleModel implements Serializable{
	
	private static final long serialVersionUID = 1L;

	  @Id
	  @Column(name = "exampleid", nullable = false)
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private Long exampleid;

	
	
}
