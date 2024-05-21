package org.javasnack.rosa;

public class Studente {

	private String nome;
	
	private String cognome;
	
	private int eta;
	
	public Studente(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
		
	}
	
	public String stampaStudente() {
		
		return "Ecco lo studente: nome " + nome + " cognome " + cognome + " età " + eta;
	}
	
}
