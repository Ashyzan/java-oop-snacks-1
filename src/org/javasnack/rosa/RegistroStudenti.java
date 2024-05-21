package org.javasnack.rosa;

import java.sql.Array;
import java.util.Arrays;

public class RegistroStudenti {
	
	private String [] arrayStudente;
	
	
	
	
	// costruttore per inizializzare il registro vuoto
	
	public RegistroStudenti() {
		
		this.arrayStudente = arrayStudente;
	}
	
	
	// getter e setter
	
	
	public String[] getArrayStudente() {
		return arrayStudente;
	}


	public void setArrayStudente(String[] arrayStudente) {
		this.arrayStudente = arrayStudente;
	}
	
	
	// metodo pubblico per aggiungere studenti al registro.

	public void aggiungiStudente(String [] studenti) {
		
		
		setArrayStudente(studenti);
		
				
	}
	
	//Aggiungi un metodo che stampi la lista degli studenti.
	
	public void stampaListaStudenti() {
		
		System.out.println(getArrayStudente()); 
		 
	}
	

	  
 
}
