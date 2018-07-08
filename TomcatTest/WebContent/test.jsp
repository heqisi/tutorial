<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%-- <%@ page language="java" import="java.util.Date,java.text.SimpleDateFormat" pageEncoding="UTF-8"%> --%>
<%--上面的方法里带上pageEncoding,重复了，会报错 --%>
<%@ page language="java" import="java.util.Date,java.text.SimpleDateFormat" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TomcatTest</title>
</head>
<script type="text/javascript">
	function btnEnter(){
	//三种创建对象的方法
	var o1={};
	var o2=new Object();
	var o3=Object.create(null);
	console.log(typeof o1+' '+typeof o2+' '+typeof o3);
	var obj={
		name:'a',
		get:function(){
			console.log(this.name);
		}
	};
	console.log("obj的get函数返回值为："+obj.get());
	
	var o4={
		name:'a',
		age:12,  
		height:176
	}
	for(var i in o4){
		console.log("o4中"+i+"值为："+o4[i]);
	}
	console.log("o4中的所有属性："+Object.keys(o4));
	delete o4.height;
	console.log("删除height后，o4中的所有属性："+Object.keys(o4));
	console.log('name' in o4);	
	var s=JSON.stringify(o4);
	console.log(s.toString());
	var p=JSON.parse(s);//p是o的深拷贝
	for(var i in p){
		console.log("p中"+i+"值为："+p[i]);
	}
	console.log("---数组篇---");
	console.log("[1,2,3].length 值为："+[1,2,3].length);
	console.log("---日期篇---");
	console.log("---数组篇---");
	var d=new Date();
	console.log("getYear():"+d.getYear());
	console.log("getFullYear():"+d.getFullYear());
	console.log();
	var girlfriend={
		height:'160+',
		weight:'120-'
	}
	for(var i in girlfriend){
			console.log("girlfriend中"+i+"值为："+girlfriend[i]);
	}
	var num=10.007;
	console.log(num+"保留两位小数："+num.toFixed(2));
}
	
function findGirlFriend(){
		var girlfriend={
				height:'160+',
				weight:'120-'
			}
		for(var i in girlfriend){
			console.log("你女朋友的"+i+"希望是："+girlfriend[i]);
		}
}
</script>
<body>
<%
    out.println("Hello World!");
%>
<%--第一个方法过时了，第二个方法引入包后可以 --%>
<P>今天的日期是：<%=(new java.util.Date()).toLocaleString() %></P>
<p>今天的日期是：<%=new SimpleDateFormat("YYYY-MM-dd HH:mm:ss").format(new Date()) %></p>
<input type="button" onclick="btnEnter()" style="width:100px;" value="JS触发按钮"></input>
</body>
</html>