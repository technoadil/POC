package com.info.test.dp;

/**
 * Use when number of parameters are greater than 4 or more
 * You want to avoid telescoping constructor pattern as it is not scalable.
 * 
 * @author zeba
 *
 */
public class BuilderTester1 {

	public static class Builder {
		
		public int sugar; //use final for immutability
		public int fat;
		public int carb;
		public int sodium;
		public int calories;
		
		int mandatory1;
		
		public Builder(int mandatory1){
			this.mandatory1 =  mandatory1;
		}
		
		public Builder calories(int val) {
			this.calories = val;
			return this;
		}
		
		public Builder carb(int val) {
			this.carb = val;
			return this;
		}
		
		BuilderTester1 build(Builder builder){
			return new BuilderTester1(builder);
		}
	}
	
	public int sugar;
	public int fat;
	public int carb;
	public int sodium;
	public int calories;
	
	private BuilderTester1(Builder builder){
		sugar = builder.sugar ; //etc
	}
	
}


 