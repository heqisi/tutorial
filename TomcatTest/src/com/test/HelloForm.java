package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloForm
 */
@WebServlet("/HelloForm")
public class HelloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * GET 请求来自于一个 URL 的正常请求，或者来自于一个未指定 METHOD 的 HTML 表单，它由 doGet() 方法处理。
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();
		String title = "使用 GET 方法读取表单数据";

		/*
		 * 如果用 getparameter() 获取中文只有问号: String name =new
		 * String(request.getParameter("name").getBytes("ISO8859-1"),"UTF-8");
		 * 由于tomcat8默认编码是 utf-8，而这个过滤器把他当成 ISO8859-1 解码时（即解码了两次），就会出现问题，导致所有中文变成问号
		 * 所以我们只需要不使用这个过滤器就可以了。 也就是采用以下代码： String name =new
		 * String(request.getParameter("name")); 这样就能正常显示中文。
		 */
		// 处理中文--我用的tomcat7默认编码iso8859-1
		String name = new String(request.getParameter("name").getBytes("ISO8859-1"), "UTF-8");
		String docType = "<!DOCTYPE html> \n";
		out.println(
				docType + "<html>\n" + "<head><title>" + title + "</title></head>\n" + "<body bgcolor=\"#f0f0f0\">\n"
						+ "<h1 align=\"center\">" + title + "</h1>\n" + "<ul>\n" + "  <li><b>站点名</b>：" + name + "\n"
						+ "  <li><b>网址</b>：" + request.getParameter("url") + "\n" + "</ul>\n" + "</body></html>");
	}

	// 处理 POST 方法请求的方法
	/**
	 * POST 请求来自于一个特别指定了 METHOD 为 POST 的 HTML 表单，它由 doPost() 方法处理。
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
