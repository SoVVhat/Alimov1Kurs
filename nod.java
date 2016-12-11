public class nok {
	public static void main(String[] args) {
		long a = 8768753, b = 77687654, i = 1, k = 1, z;
		if (a % b == 0) {
		  System.out.print(a);
		  if (b % a == 0) {
		  System.out.print(b);
		  }
		}
		else {
		  if (a > b) {
			z = b;  
		  }
		  else {
		    z = a; 
		  }
		  while (i < z) {
			  if (a % i == 0 & b % i == 0) {
				  k = i*k;
			  }
			  i++;
		  }
		}
		System.out.print(k);
	}	
}