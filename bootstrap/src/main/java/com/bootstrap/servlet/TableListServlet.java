package com.bootstrap.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class TableListServlet
 */
public class TableListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static List<User> list = new ArrayList<>();

	static {
		for (int i = 0; i < 16; i++) {
			list.add(new User(i, i+"_uname"));
		}
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TableListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("this is TableListServlet...enter...start");
		String type = request.getParameter("type");

		if (type.equals("list")) {
			System.out.println("list:" + new Gson().toJson(list));
			response.getWriter().write(new Gson().toJson(list).toString());
		} else if (type.equals("update")) {
			
		} else if (type.equals("delete")) {
			System.out.println("删除前:" + new Gson().toJson(list));
			String rkey = request.getParameter("rkey");
			if (list.indexOf(rkey) >= 0) {
				System.out.println("包含...");
				list.remove(rkey);
			} else {
				System.out.println("不包含...");
			}

			System.out.println("删除后:" + new Gson().toJson(list));
			request.getRequestDispatcher("TableListServlet?type=list").forward(
					request, response);
		} else {
			System.out.println("错误的操作!!");
		}

	}
}

class User{
	private int id;
	private String uname;
	
	
	public User(int id, String uname) {
		this.id = id;
		this.uname = uname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
}
