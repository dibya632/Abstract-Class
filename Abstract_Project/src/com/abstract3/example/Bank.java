package com.abstract3.example;

public abstract class Bank {

	public abstract void intrest() ;
		
	public Bank() {
		System.out.println("Iam bank defult construdtor");
		
	}
	public void getMessage(){
		System.out.println("i am noramal Message Method");
		
	}
	static {
		System.out.println("i am static block");
	}
	{
		System.out.println("i am instance block");
	}
	}

