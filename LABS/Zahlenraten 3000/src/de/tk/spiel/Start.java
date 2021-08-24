package de.tk.spiel;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		int zufallsZahl;
		zufallsZahl = (int) (Math.random()*100)+1;  //1..100
		int versuche=1;
		
		Scanner scanner = new Scanner(System.in); //von Tastatur lesen
		
		while (true) {  //Endlosschleife
			System.out.printf("%d. Versuch: ", versuche);
			int eingabe=scanner.nextInt();
			if(eingabe == zufallsZahl) {
				break;   //beendet die while-Schleife
			}
			else if(zufallsZahl<eingabe) {
				System.out.println("die gesuchte Zahl ist kleiner");
			}
			else {
				System.out.println("die gesuchte Zahl ist größer");
			}
			versuche++;  //Anzahl Versuche um 1 erhöhen
		} //End of while
		
		System.out.println("HERZLICHEN GLÜCKWUNSCH, Versuche: "+versuche);
		
	}

}
