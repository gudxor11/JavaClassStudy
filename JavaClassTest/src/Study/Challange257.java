package Study;

public class Challange257 {
	public static void main(String[] args) {
	    char[] name = "SEHONG".toCharArray();
	    printRotation(name);
	  }
	  private static void printRotation(char[] arr) {
	     /* 해당 메소드를 구현하시오. */
		  
		  for (int i = arr.length; i >= 0; i--) {
		      for (int j = 0, start = i; j < arr.length; j++, start++) {
		        System.out.print(arr[start % arr.length]);
		      }
		      System.out.println();
		    }
		  }
	  }
