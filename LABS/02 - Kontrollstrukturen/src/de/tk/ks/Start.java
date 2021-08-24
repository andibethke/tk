package de.tk.ks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Iterator;

public class Start {

	public static void main(String[] args) {
		//Entscheidungen
		int sekunde=LocalTime.now().getSecond();
		System.out.println(sekunde);
		
		if (sekunde % 2 == 0) {
			System.out.println("GERADE");
		}
		else {
			System.out.println("UNGERADE");
		}
		
		DayOfWeek tag = LocalDate.now().getDayOfWeek();
		
		switch (tag) {
		case MONDAY:
			System.out.println("Montag");
			break;
		case TUESDAY:
			System.out.println("Dienstag");
			break;

		default:
			break;
		}
		int i=0;
		//Schleifen
		while (i < 10) {
			i++;
			System.out.println(i);
		}
		//Zählschleife
		for(int x=1000; x<1010; x++) {
			System.out.println(x);
		}
		
		
	}

}
