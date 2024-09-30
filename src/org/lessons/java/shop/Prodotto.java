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
- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome V */ 

//Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.

public class Prodotto {

		private int codice;
		private String nome;
		private String descrizione;
		private double prezzo;
		private double iva;
		
		private void setCodice() {
			Random ran = new Random();
			codice = ran.nextInt(10000);
		}
		
		private void setCodice(int codice) {
			this.codice = codice;
		}
		
		Prodotto(){
			setCodice();
			this.iva = 1.22;
		}
		
		Prodotto(String nome, String descrizione, double prezzo){
			this();
			this.nome = nome;
			this.descrizione = descrizione;
			this.prezzo = prezzo;
		}
	
		double prezzoBase() {
	        return this.prezzo;
	    }
		
		double calcolaPrezzoConIVA() {
	        double importoIVA = this.prezzo * (this.iva / 100);
	        return this.prezzo + importoIVA;
	    }
		
		String nomeEsteso () {
			return this.codice + " - " + this.nome;
		}
		
		public double getPrezzo(double prezzo) {
			return this.prezzo;
		}
		
		public String getDescrizione () {
			return this.descrizione;
		}
		
		public int getCodice() {
			return this.codice;
		}
		
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		
	}


