package main;

public class Numbers {
	
	private int number1;
	private int number2;
	private String operation;
	
	public Numbers(int _number1, int _number2, String _operation) {
		
		number1 = _number1;
		number2 = _number2;
		operation = _operation;
	}
	
	public int getNumber1() {
		
		return number1;
	}
	
	public int getNumber2() {
		
		return number2;
	}
	
	public String getOperation() {
		
		return operation;
	}

}
