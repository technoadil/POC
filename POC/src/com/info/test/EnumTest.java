package com.info.test;


/**
 * 
 * @author zeba
 * 
 * A full class
 * Can implement as well
 * 
 *
 */
interface e {
	
}

public enum EnumTest implements e {

	ENMOBJ1(1,2),
	ENMOBJ2(3,4),
	ENMOBJ3(5,6);
	
	int x;
	 
	int y;
	
	
	EnumTest(int x,int y){
		this.x =x;
	}
}
