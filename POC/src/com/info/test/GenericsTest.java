package com.info.test;

class Stack<E> {

	private E[] elements;
	private int size =0 ;
	private static final int DEFAULT_CAPACITY=16;
	
	
	@SuppressWarnings("unchecked")
	public Stack(){
		elements = (E[]) new Object[DEFAULT_CAPACITY];
	}
	
	public void push(E e){
	//	ensureCapacity();
		elements[size++] = e;
	}
	
	
}
