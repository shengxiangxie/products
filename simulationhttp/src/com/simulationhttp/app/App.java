package com.simulationhttp.app;

import com.simulationhttp.util.HttpRequest;


/**
 * 测试
 * 
 * @author Admin
 *
 */
public class App {

	
	
	public static void main(String[] args) {

		String g = HttpRequest.sendGet("http://localhost:8888/simulationhttp/RequestString", "name=1&pass=2");
		System.out.println("模拟GET请求：" + g);
		System.out.println("===================================");
		String p = HttpRequest.sendPost("http://localhost:8888/simulationhttp/RequestString", "name=post&pass=2");
		System.out.println("模拟POST请求：" + p);
	}
}
