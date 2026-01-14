
public class PrimeNo {
	
	public static void main(String[] args) {
		
		System.out.println("Prime number between 1 to 50:");
		for (int num = 2; num <= 50; num++) {
			boolean isprime = true;
			for (int i = 2; i <= Math.sqrt(num);i++) {
				if (num % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime) {
				System.out.println(num + " ");
			}
		}
	}

}
