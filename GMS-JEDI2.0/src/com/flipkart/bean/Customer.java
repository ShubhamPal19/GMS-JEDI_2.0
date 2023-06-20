/**
 * 
 */
package com.flipkart.bean;

/**
 * 
 */
public class Customer {
	private int id;
	private String name;
	private String password;
	private String address;
	private int[] bookings; //slotid
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int[] getBookings() {
		return bookings;
	}
	public void setBookings(int[] bookings) {
		this.bookings = bookings;
	}
}
