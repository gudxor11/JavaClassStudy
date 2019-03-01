package Study;

import java.util.Arrays;
import java.util.Random;

public class Challange210 {
	public static void main(String[] args) {
	    // generate
	    int[] randNums = generate();
	    
	    // count
	    int[] counters = count(randNums);
	    
	    // print
	    System.out.printf("랜덤 넘버: %s\n", Arrays.toString(randNums));
	    for (int i = 0; i < counters.length; i++) {
	      System.out.printf("%d의 개수: %d\n", i + 1, counters[i]);
	    }
	  }
	  
	  private static int[] generate() {
	    int[] arr = new int[10];
	    Random ran = new Random();

	    for (int i = 0; i < 10; i++) {
	      arr[i] = 1 + ran.nextInt(4);
	    }

	    return arr;
	  }
	  
	  private static int[] count(int[] arr) {
	    int[] Counts = new int[4];
	    for (int n : arr) {//n에 arr값 순서대로 대입
	      Counts[n - 1]++;
	    }
	    return Counts;
	  }
	}

