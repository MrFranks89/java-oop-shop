package org.lessons.java.shop;

import java.util.Random;

/*Un prodotto è caratterizzato da:
- codice (numero intero)
- nome
- descrizione
- prezzo
- iva
Usate opportunamente attributi ed altri metodi per fare in modo che:
- ci sia un metodo che valorizzi il codice prodotto con un numero random
- il prodotto esponga un metodo per avere il prezzo base 
- il prodotto esponga un metodo per avere il prezzo comprensivo di iva
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome */


public class Prodotto {

		int codice;
		String nome;
		String descrizione;
		double prezzo;
		double iva;
		
		int generaCodice() {
			Random randomNumber = new Random();
		    int codice = randomNumber.nextInt(100000);
			return codice;}
		
		String codiceStringa = codice + "";
		
	
		double prezzoBase() {
	        return prezzo;
	    }
		
		double calcolaPrezzoConIVA() {
	        double aliquotaIVA = 22.0; // Aliquota IVA del 22%
	        double importoIVA = prezzo * (aliquotaIVA / 100);
	        return prezzo + importoIVA; // Prezzo totale con IVA
	    }


		String nomeEsteso = "codiceStringa" + "nome";

		
	}
	
	

