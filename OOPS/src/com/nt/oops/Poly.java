package com.nt.oops;

public class Poly {

	String name;// instance variable

	public String m1() {
		return this.name = "naga";
	}// zero parameter method

	public String m1(String name) {
		return this.name = name;
	}//parametriziedmethod 

	public static void main(String[] args) {
		String ss = null;// local variable
		Poly p = new Poly();// object
		ss = p.m1();//calling the zero parametr
		ss = p.m1("raju");// calling the parameter method
		System.out.println(ss);// print the answer

	}

}
