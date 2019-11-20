package exercises;

public class Prime {

	public void checkPrime(int ...a) {
		boolean isPrime;
		for(int i = 0; i < a.length; i++) {
			isPrime = true;
			if(a[i] <= 1) {
				isPrime = false;
			}else {
				for(int j = 2; j <= a[i]/2; j++) {
					if(a[i] % j == 0) {
						isPrime = false;
						break;
					}
				}
			}
			
			if(isPrime) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
	}

}
