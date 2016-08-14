package com.taxi.model;

import java.util.List;

public class Car {

	private int num;
	private String name; //车名
	private String price; //租金
	private String capacity; //容量
	private String type; //载客1、载货2、0即载可也载货
	private List<Car> list = null;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Car> getList() {
		return list;
	}
	public void setList(List<Car> list) {
		this.list = list;
	}
	
}
