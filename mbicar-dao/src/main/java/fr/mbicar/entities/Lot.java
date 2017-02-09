package fr.mbicar.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Lot implements Serializable {
	
	@Id
	private Integer id;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="purchaseID")
	private Purchase purchase;
	
	@OneToMany(mappedBy="lot", cascade = CascadeType.ALL)
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
