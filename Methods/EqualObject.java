package com.corejava.Methods;

public class EqualObject {
	
	int id;
	String name;
	String addr;
	
	EqualObject(int id,String name,String addr){
		
		this.addr=addr;
		this.id=id;
		this.name=name;
		
	}
	
	@Override
	public boolean equals(Object o) {
		EqualObject temp= (EqualObject)o;
		if(this.id==temp.id && this.name==temp.name && this.addr==temp.addr) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		EqualObject E=new EqualObject(1,"Vaibhav","Old Sanghvi");
		EqualObject a=new EqualObject(2,"Sidharth","Madhubun COlony");
		EqualObject d=E;
		
		System.out.println(d==a);
		System.out.println(d.equals(E));
	}

}
