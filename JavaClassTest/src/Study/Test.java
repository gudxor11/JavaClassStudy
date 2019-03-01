package Study;

import java.util.Scanner;

public class Test {

	public static void main (String[] args) {

			int Ncard = 7; // 뽑을 카드 수

			int max = 56; // 카드 숫자

			Scanner sc = new Scanner (System.in);

			int n = 0; // 사람수

			double ran = 0; // random 함수 사용

			String[] Scard; // 고른 카드 

			Scard = new String[Ncard];

			String[] card = {"♠1", "♠2", "♠3", "♠4", "♠5", "♠6",

							  "♠7", "♠8", "♠9", "♠10", "♠J", "♠Q", "♠K", "♠A",

							  "◆1", "◆2", "◆3", "◆4", "◆5", "◆6",

							  "◆7", "◆8", "◆9", "◆10", "◆J", "◆Q", "◆K", "◆A",

							  "♣1", "♣2", "♣3", "♣4", "♣5", "♣6",

							  "♣7", "♣8", "♣9", "♣10", "♣J", "♣Q", "♣K", "♣A",

							  "♥1", "♥2", "♥3", "♥4", "♥5", "♥6",

							  "♥7", "♥8", "♥9", "♥10", "♥J", "♥Q", "♥K", "♥A"};

	        System.out.print("사람수 :");

	        
	        int random = 58;
	        
	        n = sc.nextInt();
            String showcard; // 카드 보여주기
            
	        for (int i = 0; i < n; i++) {

	            showcard = "";

	            for (int j = 0; j < Ncard; j++) {
	            	
	            ran = Math.random() * (max) + 1; 
	            random = (int) ran;
         
	            while (card[random - 1] == "") {
            		ran = Math.random() * (max) + 1;
    	            random = (int) ran;
            	} // 중복 제거
	            
	            Scard[j] = card[random - 1];
	            card[random - 1] = "";
	            
	            
	            showcard = showcard + " " + Scard[j];

	            }

	            System.out.println( i+1 + "번의 카드" + showcard);

	        }

	    }




		
	}

