package com.ada.point;



public aspect Hi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello hello=new Hello();
		hello.setName("ada");
		hello.getName();
	}
	pointcut hello():set(String a)&&target(Hello);
	pointcut hi(Hello h): call(String Hello.get*())&&target(h);
	before() : hello() {
		System.out.println("ff");
	}
 String	around (Hello h): hi(h) {
		System.out.println("ff");
	Object rObject=	proceed(h);
		return rObject.toString();
	}

}
