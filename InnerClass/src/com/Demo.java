package com;

public class Demo {
Demo(){
	System.out.println("demo");
}
static class Inner1 {
	Inner1(){
		System.out.println("inner1");
	}
}
class Inner2 {
	Inner2(){
		System.out.println("inner2");
	}
}
public static void main(String[] args) {
	Demo demo=new Demo();
	Inner1 n1=new Inner1();
	Inner2 n2=demo.new Inner2();
}
}

