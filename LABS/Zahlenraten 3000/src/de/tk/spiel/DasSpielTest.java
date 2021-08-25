package de.tk.spiel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DasSpielTest {

	@Test
	void testAlles() {
		DasSpiel s=new DasSpiel();
		assertFalse(s.isEnde());
		for (int i = 1; i <= 100; i++) {
			s.eingabe(i);
			if (s.isEnde()) {
				return;
			}
		}
		fail("Alles putt...");
	}

}
