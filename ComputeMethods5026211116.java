import java.util.Random;
public class ComputeMethods5026211116 {
	//Temperature
	public double fToC(double degreesF) {
        	return (5/9.0 * (degreesF-32));
    	}
	//Hypotenuse
    	public double hypotenuse (int a, int b) {
        	double times = (Math.pow(a, 2)) +  (Math.pow(b, 2));
        	return Math.sqrt(times);
    	}

	//roll dice
    	public int roll() {
        	Random rnd = new Random();
        	int dice1 = rnd.nextInt(7) + 1;
        	int dice2 = rnd.nextInt(7) + 1;
        	return dice1 + dice2;
    	}
}