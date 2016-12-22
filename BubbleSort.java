
package bubblesort;

public class BubbleSort {
  
    public static void main(String[] args) {
        int n, i, v;
        n =  10; //Integer.valueOf(args[0]);
        int [] arr = new int[n];
        for (i = 0; i < n; i++) {
            arr[i] =(int) (Math.random()*100);
            System.out.print(arr[i] + " ");
        }
        
            System.out.print("\n");
        for (int j = n - 1; j > 0; j--) {
            for (i = 0; i < n-1; i++) {
                if (arr[i+1] < arr[i]) {
                    v = arr[i];
                    arr[i] = arr [i+1];
                    arr[i+1] = v;
                }
            }
        }
        
        for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
