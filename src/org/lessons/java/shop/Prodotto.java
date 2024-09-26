package org.lessons.java.shop;

import java.util.Random;

/*Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente attributi ed altri metodi per fare in modo che:
- ci sia un metodo che valorizzi il codice prodotto con un numero random V
- il prodotto esponga un metodo per avere il prezzo base V
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva V
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome */


public class Prodotto {

		int codice;
		String nome;
		String descrizione;
		double prezzo;
		double iva;
		
		Prodotto(){
			codice = generaCodice();
		}
		
		int generaCodice() {
			Random randomNumber = new Random();
		    return randomNumber.nextInt(10000);}
		
		
		String codiceStringa = codice + "";
		
	
		double prezzoBase() {
	        return prezzo;
	    }
		
		double calcolaPrezzoConIVA() {
	        double importoIVA = prezzo * (iva / 100);
	        return prezzo + importoIVA;
	    }
		
		

		
	}
	
	

