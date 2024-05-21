package org.javasnack.rosa;

public class Main {
	
	public static void main(String[] args) {
		
		RegistroStudenti registo1 = new RegistroStudenti();
		
		registo1.aggiungiStudente(new Studente("Ciccio", "Pallino", 33));
		registo1.aggiungiStudente(new Studente("Paolino", "Giustini", 23));
		registo1.aggiungiStudente(new Studente("Nina", "Smalti", 43));
		registo1.aggiungiStudente(new Studente("Giustino", "Smalti", 33));
		
		registo1.stampaListaStudenti();
		
	}

}
