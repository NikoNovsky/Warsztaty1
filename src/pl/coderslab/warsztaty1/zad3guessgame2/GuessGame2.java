package pl.coderslab.warsztaty1.zad3guessgame2;

import java.util.Scanner;

public class GuessGame2 {

	public static void main(String[] args) {
		int min = 0;
		int max = 1000;
		int guess = (max-min)/2 + min;
		int count = 0;
//		boolean toMuch = false;
//		boolean toLow = false;
		boolean correct = false;
//		String number=""; 

		Scanner scan = new Scanner(System.in);
		System.out.println("Pomyśl liczbę od 1 do 1000, a ja zgadnę po max. 10 próbach.\nWpisz \"dużo\", \"mało\" lub \"trafiłeś\" .");   
		System.out.println("Zgaduję: "+ guess);																											
		
		while (correct == false) {
			String n = scan.next();
			try {
//				String n = scan.next();
				if (n.equals("trafiłeś")) {
					count++;
					System.out.println("Zgadłem za " + count + " razem!");
					correct = true;
//					scan.close();
				} else if (n.equals("dużo")){
//					scan.close();
//					min = min;
					max = guess;
					guess = (max-min)/2 + min;
					count++;
					System.out.println("Zgaduję: "+guess);
					correct = false;
					
				} else if (n.equals("mało")){
//					scan.close();
					min = guess;
//					max = max;
					guess = (max-min)/2 + min;
					count++;
					System.out.println("Zgaduję: "+guess);
					correct = false;
					

				}

			} catch (Exception e) {
				System.out.println("Błąd!");
				scan.nextLine();
			}
		}
		scan.close();
	}

}

