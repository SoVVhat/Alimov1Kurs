public class yesno {
	public static void main(String[] args) {
		double x0, y0, x, y, r, n;
		x0 = 2;
		y0 = 2;
		r = 2;
		x = 2;
		y = 1;
		n = Math.sqrt((x0-x)*(x0-x)+(y0-y)*(y0-y));
		if (n < r) {
		System.out.print("yes");
		}
		else {
		System.out.print("no");
		}
	}	
}
