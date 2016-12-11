public class Main {
	public static void main(String[] args) {
	int n = 56;
	int p = n; 
	int m = 0;
	int k = 0;
		while (p > 0) {
			if (p % 2 == 1) {
				k++;
			}
			p = p / 2;
	    }
		   System.out.print(k);
	}	
}