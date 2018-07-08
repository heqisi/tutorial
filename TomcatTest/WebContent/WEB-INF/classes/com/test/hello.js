/**
 * 
 */
function Person(name,age){
	this.name=name;
	this.age=age;
}

Person.prototype.sayName=function(){
	alert(this.name);	
};