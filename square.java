public class square {
	public static void main(String[] args) {
		int n = 8;
		int j = 1, i = 1;
		while (j <= n) {
			while (i <= n) {
				System.out.print("* ");
				i++;
			}
			System.out.print("\n");
			j++;
			i = 1;
		}
	}	
}