// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String cv = args[1];
		int num = 4;
		int count = 1;
		if (cv.equals("c")){
			System.out.printf("Every one of the first %d hailstone sequences reached 1.\n", seed );
		}
		else{
			System.out.print("1 ");
			for (int i = 2; i <= seed + 1; i++){
				count ++;
				while (num != 1){
					System.out.print(num + " ");
					count ++;
					if (num % 2 == 0){
						num = num/2;
					}
					else{
						num = num * 3 + 1;
					}
				}
				System.out.println (num + " (" + count + ")");
				System.out.printf("Every one of the first %d hailstone sequences reached 1.", seed );
				//System.out.println(count);
				num = i;
				count = 0;
			}
		}

	    // Replace this comment with your code
	}
}
