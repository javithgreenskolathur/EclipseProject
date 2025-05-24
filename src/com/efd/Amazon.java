package com.efd;

//child - derived/sub class
public class Amazon extends Swiggy{
	
//	super-> parent object 
//	super. => to access parent class method/var
//	this -> child object
//	this. ==> to access child class methd/var
	
	@Override // annotation
	public void send() {
		System.out.println("Festival Offer");
		super.send();//method chaining
		this.add();
	}
	
	private void add() {
		System.out.println("Dress");
	}
	
	
	private void amazonProduct() {
		System.out.println("amazonPhone");
	}
	
	public static void main(String[] args) {
		Amazon a = new Amazon();
		a.send();
		
	}
	
	
	

}
