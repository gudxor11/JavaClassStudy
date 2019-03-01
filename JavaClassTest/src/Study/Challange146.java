package Study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Challange146 {
	
	 public static void main(String[] args) {
		    int[] a = { 1, 4, 5, 6, 8, 10, 11, 12, 13, 15, 19, 30 };
		    int[] b = { 2, 5, 9, 12, 14, 18, 20 };
		    int[] c = { 5, 7, 12, 14 };
		    int[] duplicatedNumbers = findDuplicatedNumbers(a, b, c);
		    System.out.println("a: " + Arrays.toString(a));
		    System.out.println("b: " + Arrays.toString(b));
		    System.out.println("c: " + Arrays.toString(c));
		    System.out.printf("duplicatedNumbers: %s\n", Arrays.toString(duplicatedNumbers));
		  }
		  private static int[] findDuplicatedNumbers(int[] a, int[] b, int[] c) {
			
			  int[] e = new int[a.length];
			  int f = 0;
			  
			  for (int i = 0; a.length <= i; i++) {
				  for (int j = 0; b.length <= j; j++) {
					  for (int k = 0; b.length <= k; k++) {
						  
						  if(a[i] == b[j] && a[i] == c[k]) {
							  System.out.print("iii");
							  e[f] = a[i];
							  f = f + 1;
						  }
					  }
				  } 
				  e[f] = a[1];
			  }
		    return e;
		  }
		}
	
