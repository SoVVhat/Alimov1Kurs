public class Pi {
	public static void main(String[] args) {
		double  Pi = 1f, pi2, a = 2f, b = 1f;
		int i, n = 1000;
		for (i = 0; i < n; i++) {
			Pi = a*a/(b*(b+2))*Pi;
			a += 2; b += 2;
		}
		Pi = Pi*2;
		System.out.print(Pi);
	}
}