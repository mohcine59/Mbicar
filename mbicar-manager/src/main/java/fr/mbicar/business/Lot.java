package fr.mbicar.business;

import java.io.Serializable;
import java.util.List;

public class Lot implements Serializable {
	
	private Integer id;
	private String name;
	private Purchase purchase;
	private List<Vehicle> vehicles;

	public Lot() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}
	
	

}
