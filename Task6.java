
package task6;

public class Task6 {
    public static void main(String[] args) {
    	double sum = 0, pr1, pr2;
        int m, n, k;
        n = 3;
        for (m = 2; m <= n; m++) {
            pr1 = 1; pr2 = 1;
            for (k = 1; k < m; k++) {
                pr1 *= (m-k);
            }
            for (k = 0; k < m; k++) {
                pr2 *= (m-k);
            }
            sum += pr1*pr1/(2*pr2);
        }
        System.out.print(sum);
    }
}


