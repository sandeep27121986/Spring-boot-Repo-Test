package com.example.demo;



public class MYVECHICAL1 {

   int id;
   String VName;
   String Status;

	public MYVECHICAL1(int i,String name,String s) {
		// TODO Auto-generated constructor stub
	id=i;
	VName=name;
	Status=s;
	}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getVName() {
	return VName;
}
public void setVName(String vName) {
	VName = vName;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
   
}
