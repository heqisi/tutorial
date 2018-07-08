package com.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

@SuppressWarnings("serial")
public class HelloServlet extends HttpServlet {

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// 出现乱码
		// 鎴戠殑绗竴涓猻ervlet
		// response.setCharacterEncoding("UTF-8");
		// response.getWriter().write("我的第一个servlet");

		// 1.设置response的编码为utf-8
		response.setCharacterEncoding("utf-8");
		// 2.通知浏览器，以UTF-8的编码打开
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write("菜鸟教程：http://www.runoob.com");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
