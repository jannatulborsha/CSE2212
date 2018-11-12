package main;

public class TestChain {
	
	public static void main(String[] args) {
		
		Chain chainCalc1 = new AddNumbers();
		Chain chainCalc2 = new SubNumbers();
		Chain chainCalc3 = new MultNumbers();
		Chain chainCalc4 = new DivNumbers();
		
		Numbers request = new Numbers(20, 10, "div");
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		chainCalc1.calculate(request);
	}

}
