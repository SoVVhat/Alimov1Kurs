public class del {
	public static void main(String[] args) {
		long n = 78655476, i = 2;
		
		System.out.print(1 + " ");
		System.out.print(n + " ");
		while (i < (Math.abs(Math.sqrt(n)))) {
			if (n % i == 0) {
				System.out.print(i + " ");
				System.out.print(n / i + " ");
			}
			i++;
		}
	}	
}
