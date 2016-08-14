package com.taxi.action;

import java.util.List;
import java.util.Scanner;

import com.taxi.model.Car;
import com.taxi.service.CarService;

public class TaxiWel {

	final static CarService carService = new CarService();
	
	public static void main(String[] args) {
		System.out.println("欢迎使用达达租车系统：");
		System.out.println("您是否要租车：1是 0否");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		if(x == 1){
			Car car = carService.initCar();
			List<Car> cars = car.getList();
			System.out.println("您可租用的车型以及价目：" );
			System.out.println("序号 \t名称\t租金\t容量");
			for(Car c : cars){
				String type = null;
				if(c.getType() == "1"){
					type = "载客";
				}else if(c.getType() == "2"){
					type = "载货";
				}
				System.out.println(c.getNum()+ "\t" + c.getName() + "\t" + c.getPrice() + "\t"
						+type+":"+c.getCapacity());
			}
			System.out.println("请输入您要租车的数量：");
			int taxiNum = in.nextInt(); //租车的
			int[] orderNum = new int[taxiNum];
			for(int i=0;i<taxiNum;i++){
				System.out.println("请输入您要租车的序号：");
				orderNum[i] = in.nextInt();
			}
			System.out.println("请输入您要租车的天数：");
			int days = in.nextInt();
			System.out.println("您的账单：");
			for(int i=0;i<orderNum.length;i++){
				Car result = carService.getById(car, orderNum[i]);
				System.out.println(result.getNum()+ "\t" + result.getName() + "\t" + result.getPrice() + "\t"
						+result.getType()+":"+result.getCapacity());
			}
		}else{
			System.out.println("再见!");
		}
	}
}
