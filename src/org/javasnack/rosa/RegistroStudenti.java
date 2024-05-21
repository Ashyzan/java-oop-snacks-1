package org.javasnack.rosa;

import java.sql.Array;
import java.util.Arrays;

public class RegistroStudenti {
	
	private Studente [] arrayStudente;
	
	private int posizioneArray = 0;
	
	
	
	
	// costruttore per inizializzare il registro vuoto
	
	public RegistroStudenti() {
		
		this.arrayStudente = new Studente[3];
	}
	
	
	
	// metodo pubblico per aggiungere studenti al registro.

	public void aggiungiStudente(Studente input) {
		 
		
	        Arrays.fill(arrayStudente, input); 
	        System.out.println("ho inserito un nuovo studente nell'array");
	        
	
		
				
	}
	
	//Aggiungi un metodo che stampi la lista degli studenti.
	
	public void stampaListaStudenti() {
		
		System.out.println("Ecco la tua lista: ");
		
		System.out.println(Arrays.toString(this.arrayStudente));
		
	
		 
	}
	  
 
}
