public class nodEvklid {
	public static void main(String[] args) {
		long a = 6, b = 36;
	    while (a != 0 & b != 0) {
		  if (a > b) {
		    a = a % b;
		  }
		  else {
		    b = b % a;
		  }
		}
		System.out.print(a + b);
	}	
}