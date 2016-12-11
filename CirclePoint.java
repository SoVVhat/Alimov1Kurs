public class CirclePoint {
	public static void main(String[] args) {
		float r = 4f;
		float x0 = 2f;
		float y0 = 2f;
		float x = 3f;
		float y = 3f;
		if (Math.sqrt((x - x0)*(x - x0) + (y - y0)*(y - y0)) < r) {
			System.out.print("Yes");
		}
		else {
			System.out.print("No");
		}
	}
}