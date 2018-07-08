<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
/*
 * http://www.iqiyi.com/w_19ru990nwp.html
 * 回掉函数在异步中用的比较多
 */
 function get1(name){
	 return name+" 111"
 }
 alert(get1("lee "))//说明是同步的。
 
 function get2(name){
	 var result;
	 setTimeout(function (){
		 result=name +"222";
	 })
	 return result;
 }
 alert(get2("lee "))//说明是异步的。
 
 function getCallback(name,callback){
	/* setTimeout(function(){
		 callback(name +" callback");
	 },5000) */ 
/* 	 setTimeout(function(){
		 callback(name +" callback");
	 })  */
	 setTimeout(function(){
		 callback(name +" callback");
	 })() }
 getCallback("lee",function(result){
	 alert(result);
 })
</script>
</head>
<body>

</body>
</html>