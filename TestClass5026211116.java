public class TestClass5026211116 {
	public static void main(String[] args) {
		ComputeMethods5026211116 cm = new ComputeMethods5026211116();
		
		//Temperature
		double degreesC = cm.fToC(100.4);
		System.out.println("100.4 Fahrenheit is equal with " + degreesC + " Celcius.");

		//Hypotenuse
		double c = cm.hypotenuse(6,9);
		System.out.println("The hypotenuse length of a triangle in cm is: " + c);

		//roll dice
		int sum = cm.roll();
		System.out.println("The sum of two 6-sided dice is: " + sum);
	}
}