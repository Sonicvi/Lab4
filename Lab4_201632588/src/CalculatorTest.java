
public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("add 3.5 + 9: "+calc.add(3.5, 9));
		System.out.println("substract 3.5 - 9 : "+calc.substract(3.5, 9));
		System.out.println("multiply 3.5 x 9 : "+calc.multiply(3.5, 9));
		System.out.println("divide 3.5 / 9 : "+calc.divide(3.5, 9));
		System.out.println("divide with remainder 9/4 : "+calc.remainder(9, 4));
		calc.toString();
		
		
	}

}
