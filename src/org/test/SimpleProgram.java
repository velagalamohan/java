package org.test;

public class SimpleProgram {
	
	public void stepOne() {
System.out.println("we can enter class");
	}
	
	public void stepTwo() {
System.out.println("we can enter method");
	}
	
	public void stepThree() {
System.out.println("we can enter object");
	}
	
	public static void main(String[] args) {
		SimpleProgram s = new SimpleProgram();
		s.stepOne();
		s.stepTwo();
		s.stepThree();
	}

}
