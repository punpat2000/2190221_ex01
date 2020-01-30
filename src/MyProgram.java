
public class MyProgram {

	public static void main(String[] args) {
		// initial
		Carrier ship1 = new Carrier();
		Aircraft jaguar = new Aircraft();
		Aircraft bear = new Aircraft();
		Aircraft[] ac = new Aircraft[2];
		ac[0] = jaguar;
		ac[1] = bear;
		Carrier ship2 = new Carrier(ac);
		Aircraft eagle = new Aircraft(50, 100);
	}

}
