public class sum1 {
	public static void main(String[] args) {
		int n = 3, i;
		float y = 3f, x, j = 1f, s = 1f;
		for (i = 0; i < n - 1; i++) {
			j = j*(-1);
			s = s + j*(1/(y*y));
			y = y + 2;
		}
		System.out.print(s);
	}	
}
