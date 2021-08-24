package de.tk.spiel;

import java.util.Scanner;

public class StartOopConsole {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //von Tastatur lesen
		DasSpiel spiel=new DasSpiel();  //Instanziierung
		
		while (true) {
			System.out.print(spiel.getVersuche()+1+". Versuche: ");
			spiel.eingabe(scanner.nextInt());
			if (spiel.isEnde()) {
				break;
			}
			else if (spiel.isKleiner()) {
				System.out.println("die gesuchte Zahl ist kleiner");
			}
			else {
				System.out.println("die gesuchte Zahl ist größer");
			}
		} //end of while
		System.out.println("HERZLICHEN GLÜCKWUNSCH, Versuche: "+spiel.getVersuche());

	}

}
