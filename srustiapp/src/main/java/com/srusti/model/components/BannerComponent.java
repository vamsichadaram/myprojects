package com.srusti.model.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="banners")
public class BannerComponent 
{
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String decription;
	
}
