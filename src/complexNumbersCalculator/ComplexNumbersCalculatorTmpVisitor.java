package complexNumbersCalculator;

public class ComplexNumbersCalculatorTmpVisitor implements ComplexNumbersCalculatorVisitor {

	@Override
	public Object visit(SimpleNode node, Object data) {
		System.out.println("TEST: " + node);
		return null;
	}

}
