public class tentwo {
	public static void main(String[] args) {
		int n = 13, i = 0, k = 0, m, k1 = 0;
		m = n;
		while (m > 0) {
			m = m / 2;
			k++;
		}
		int[] arr = new int[k];
		m = n;
		while (m > 0) {
			if (m % 2 != 0) {
				k1++;
			}
			arr[i] = m % 2;
			m = m / 2;
			i++;
		}
		System.out.print(k1 + " - ");
		for (i = k - 1; i > -1; i--) {
			System.out.print(arr[i]);
		}
	}	
}      