public class fact {
	public static void main(String[] args) {
		int n = 13, i = 2;
		long f = 1;
		if (n < 0) {
			System.out.print("Error");
			System.exit(1);
		}
		
		if (n == 1) {
			System.out.print(1);
		}
		else {
			if (n == 2) {
				System.out.print(2);
			}
			else {
				while (i <= n) {
					f = f*i;
					i++;
				}
				System.out.print(f);
			}
		}
	}
}