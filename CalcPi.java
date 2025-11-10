public class CalcPi {
	public static void main(String [] args) { 
		int terms = Integer.parseInt(args[0]);
		double javaPi = Math.PI;
		double piApprox = 0.0;
		for (int i = 1; i <= terms *2 ; i += 4){
			//System.out.println(i);
			//System.out.println(1.0/i);
			piApprox += 1.0/i;

		}
		for (int j = 3; j <= terms*2 ; j += 4){
			//System.out.println(j);
			//System.out.println(1.0/j);
			piApprox -= 1.0/j;
		}
		
		piApprox = piApprox *4.0;
		System.out.printf("pi according to Java: %.15f\n", javaPi );
		System.out.printf("pi, approximated: %.15f", piApprox);

	}
}
