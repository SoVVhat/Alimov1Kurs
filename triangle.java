public class square {
	public static void main(String[] args) {
		int n = 41, i = 1, j = 1, k = 0;
		while (j < n) {
		  while (i < n - j) {
		    System.out.print(" ");
			i++;
		  }
		  while (k < j) {
		    System.out.print("* ");
		    k++;
	      }
		  j++; i = 1; k = 0;
		  System.out.print("\n");
		} 
	}	
}