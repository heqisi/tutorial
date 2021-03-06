package com.test;

//导入必需的 java 库
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//实现 Filter 类
public class LogFilter implements Filter {
	public void init(FilterConfig config) throws ServletException {
		// 获取初始化参数
		String site = config.getInitParameter("Site");

		// 输出初始化参数
		System.out.println("网站名称: " + site);
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws java.io.IOException, ServletException {

		// 输出站点名称
		System.out.println("LogFilter:I am a LogFilter~");

		// 把请求传回过滤链
		chain.doFilter(request, response);
	}

	public void destroy() {
		/* 在 Filter 实例被 Web 容器从服务移除之前调用 */
	}
}
