public class Random2 {
	public static void main(String[] args) {
		int s, n;
		s = 5 + (int) (Math.random()*6);
		long rand[] = new long[s];
		rand[0] = 1;
		rand[1] = 2;
		for (int i = 2; i < rand.length; i++) {
			rand[i] = rand[i-1]*rand[i-2];
		}
		for (int i = 0; i < rand.length; i++) {
			System.out.print(rand[i] + " ");
		}
	}
}