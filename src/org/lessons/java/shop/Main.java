package org.lessons.java.shop;

public class Main {

	public static void main(String[] args) {
		Prodotto p1 = new Prodotto();
		p1.nome = "monitor";
		p1.descrizione = "monitor LG 32\" a schermo piatto";
		p1.prezzo = 173.31;
		p1.iva = 22;
		p1.setCodice();
		System.out.println("Il codice del prodotto è " + p1.codice);
		System.out.println("Il nome esteso del prodotto è " + p1.nomeEsteso());  
		System.out.println("Prezzo con IVA: " + String.format("%.2f", p1.calcolaPrezzoConIVA()) + "€"); 
	}
}
