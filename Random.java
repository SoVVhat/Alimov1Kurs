public class Random {
	public static void main(String[] args) {
		int s, n;
		int rand[] = new int[10];
		System.out.print("Old: \n");
		for (int i = 0; i < 10; i++) {
			rand[i] = (int) (Math.random()*100);
			System.out.print(rand[i] + " ");
		}
		System.out.print("\nNew: \n");
		for (int i = 0; i < rand.length/2; i++) {
			n = rand[i];
			rand[i] = rand[rand.length - i - 1];
			rand[rand.length - i - 1] = n;
		}
		for (int i = 0; i < rand.length; i++) {
			System.out.print(rand[i] + " ");
		}
	}
}