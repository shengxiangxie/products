package com.taxi.model;

import java.util.ArrayList;
import java.util.List;

public class InitailData {

	/**
	 * 初始化数据
	 */
	public static Car initData(){
		System.out.println("正在初始化数据..." );
		List<Car> list = new ArrayList<Car>();
		Car car = new Car();
		
		Car car1 = new Car();
		car1.setNum(1);
		car1.setName("奥迪");
		car1.setPrice("500元/天");
		car1.setType("1");
		car1.setCapacity("4人");
		list.add(car1);
		
		Car car2 = new Car();
		car2.setNum(2);
		car2.setName("马自达");
		car2.setPrice("400元/天");
		car2.setType("1");
		car2.setCapacity("4人");
		list.add(car2);
		
		car.setList(list);
		System.out.println("数据初始化完成！！");
		return car;
	}
	public static void main(String[] args) {
		Car car = initData();
		List<Car> cars = car.getList();
		System.out.println("序号  名称  租金  容量");
		for(Car c : cars){
			String type = null;
			if(c.getType() == "1"){
				type = "载客";
			}else if(c.getType() == "2"){
				type = "载货";
			}
			System.out.println(c.getNum()+ " " + c.getName() + " " + c.getPrice() + " "
					+type+":"+c.getCapacity());
		}
	}
}
