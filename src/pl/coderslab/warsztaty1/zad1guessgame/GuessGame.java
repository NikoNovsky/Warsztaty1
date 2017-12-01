package pl.coderslab.warsztaty1.zad1guessgame;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class GuessGame {

	public static void main(String[] args) {
		boolean result = false;
		Random r = new Random(); 
		int a = r.nextInt(100)+1;
//		System.out.println(a);
		Scanner scan = new Scanner(System.in);
		System.out.println("Wprowadź liczbę:");	
		
		while (result == false) {
			try { 	
				int n = scan.nextInt();				
				if (n == a) {
					System.out.println("Zgadłeś!");
					result = true;
				} else if (n > a){
					System.out.println("Za wysoka liczba, podaj kolejną!");
					result = false;
				} else if (n < a){
					System.out.println("Za niska liczba, podaj kolejną!");
					result = false;
				}
			} catch (InputMismatchException e) {
				System.out.println("To nie jest liczba! Podaj kolejną liczbę!");
				scan.nextLine();
			}
		}
		 scan.close();
	}
}

