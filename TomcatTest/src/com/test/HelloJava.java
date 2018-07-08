package com.test;

// 导入必需的 java 库
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 扩展 HttpServlet 类
@SuppressWarnings("serial")
public class HelloJava extends HttpServlet {

	private String message;

	public void init() throws ServletException {
		// 执行必需的初始化
		message = "Hello, I am a servlet.";
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置响应内容类型
		response.setContentType("text/html");

		// 实际的逻辑是在这里
		PrintWriter out = response.getWriter();
		out.println("<h1>" + message + "</h1>");
	}

	public void destroy() {
		// 什么也不做
	}
}