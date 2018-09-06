package main;

public class OperatorTestClass {

	public int addition(int operand1, int operand2) {
		return operand1 + operand2;
	}

	public int subtraction(int operand1, int operand2) {
		return operand1 - operand2;
	}

	public double division(int operand1, int operand2) {
		return (double)operand1 / (double)operand2;
	}

	public int multiplication(int operand1, int operand2) {
		return operand1 * operand2;
	}

	public int modulus(int operand1, int operand2) {
		return operand1 % operand2;
	}

	public Object bitNot(int i) {
		
		return ~i;
	}

	public Object bitAnd(int i, int j) {
		return i&j;
	}

	public Object bitOr(int i, int j) {
		return i|j;
	}

	public Object bitExOr(int i, int j) {
		
		return i^j;
	}

	public Object bitShiftRight(int i) {
	
		return i>>1;
	}

	public Object bitShiftRightZero(int i) {

		return null;
	}

	public Object bitShiftLeft(int i) {
		
		return i<<1;
	}

	public Object bitShiftLeftZero(int i) {
		
		return null;
	}

	public Object equalTo(int i, int j) {
		
		return i==j;
	}

	public Object notEqualTo(int i, int j) {
	
		return i!=j;
	}

	public Object greaterThan(int i, int j) {
		
		return i>j;
	}

	public Object greaterThanOrEqual(int i, int j) {
		
		return i>=j;
	}

	public Object lessThan(int i, int j) {
		
		return i<j;
	}

	public Object lessThanOrEqual(int i, int j) {
		
		return i<=j;
	}

	public Object logicalNot(boolean b) {
		
		return !b;
	}

	public Object logicalAnd(boolean b, boolean c) {
		
		return b&&c;
	}

	public Object logicalOr(boolean b, boolean c) {
		
		return b||c;
	}

	public Object logicalExOr(boolean b, boolean c) {
		
		return null;
	}

	public Object shortCircuitAnd(boolean b, boolean c) {
		
		return null;
	}

	public Object shortCircuitOr(boolean b, boolean c) {
		return null;
	}
}