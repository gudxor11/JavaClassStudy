package Study;

public class Challange238 {
	
	public static void main(String[] args) {
	  int cents = 2357;
	  int dollars = 0;
	  
	  dollars = cents/100;
	  cents = cents%100;
	  System.out.printf("%d달러 %d센트\n", dollars, cents);
	}
}


