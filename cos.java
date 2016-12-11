public class cos {
	public static void main(String[] args) {
		int n = 5;
		double s, x;
		x = 1;
		s = Math.cos(x);
		  if (n > 1) {
			for (int i = 0; i < n; i++) {
				s = Math.cos(s);
			}
		  }	
		System.out.print(s);
	}	
}
