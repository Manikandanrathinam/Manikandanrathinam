package com.mobile.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="mobile_details")
public class Mobile {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
/**
 * @Param id
 */
private int id;
/**
 * @param brand
 */
private String brand;
/**
 * @param colour
 */
private String colour;
/**
 * @param price
 */
private int price;
/**
 * @param mobno
 */
private long mobNo;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the brand
 */
public String getBrand() {
	return brand;
}
/**
 * @param brand the brand to set
 */
public void setBrand(String brand) {
	this.brand = brand;
}
/**
 * @return the colour
 */
public String getColour() {
	return colour;
}
/**
 * @param colour the colour to set
 */
public void setColour(String colour) {
	this.colour = colour;
}
/**
 * @return the price
 */
public int getPrice() {
	return price;
}
/**
 * @param price the price to set
 */
public void setPrice(int price) {
	this.price = price;
}
/**
 * @return the mobNo
 */
public long getMobNo() {
	return mobNo;
}
/**
 * @param mobNo the mobNo to set
 */
public void setMobNo(long mobNo) {
	this.mobNo = mobNo;
}


}

