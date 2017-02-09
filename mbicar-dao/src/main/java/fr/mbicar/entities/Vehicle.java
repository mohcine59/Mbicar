package fr.mbicar.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Vehicle implements Serializable {
	
	@Id
	private Integer id;
	private String mark;
	private String model;
	private Date originalServiceDate;
	private Integer km;
	private String fuel;
	private int nbDoors;
	private int seatingCapacity;
	private int horsepower;
	private float price;
	private String description;
	private String transmission;
	
	@ManyToOne
	@JoinColumn(name="lotID")
	private Lot lot;
	
	@OneToOne(mappedBy="vehicle")
	private OrderLine orderLine;
	
	@OneToMany(mappedBy="vehicle", cascade = CascadeType.ALL)
	private List<Expense> expenses;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public Date getOriginalServiceDate() {
		return originalServiceDate;
	}

	public void setOriginalServiceDate(Date originalServiceDate) {
		this.originalServiceDate = originalServiceDate;
	}

	public Integer getKm() {
		return km;
	}

	public void setKm(Integer km) {
		this.km = km;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getNbDoors() {
		return nbDoors;
	}

	public void setNbDoors(int nbDoors) {
		this.nbDoors = nbDoors;
	}

	public int getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public Lot getLot() {
		return lot;
	}

	public void setLot(Lot lot) {
		this.lot = lot;
	}


	public OrderLine getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(OrderLine orderLine) {
		this.orderLine = orderLine;
	}

	public List<Expense> getExpenses() {
		return expenses;
	}

	public void setExpenses(List<Expense> expenses) {
		this.expenses = expenses;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
}
