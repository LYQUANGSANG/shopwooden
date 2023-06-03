package com.sanglq.backend.domain;

public class Product {

    private String id;

    private String name;

    private double price;

    private String description;
    
   private String color;
   
   private double leght;
   
   private double tall;
   
   private double wire;

public Product(String id, String name, double price, String description, String color, double leght, double tall,
		double wire) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.description = description;
	this.color = color;
	this.leght = leght;
	this.tall = tall;
	this.wire = wire;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public double getLeght() {
	return leght;
}

public void setLeght(double leght) {
	this.leght = leght;
}

public double getTall() {
	return tall;
}

public void setTall(double tall) {
	this.tall = tall;
}

public double getWire() {
	return wire;
}

public void setWire(double wire) {
	this.wire = wire;
}
   
   
   

   
    
}