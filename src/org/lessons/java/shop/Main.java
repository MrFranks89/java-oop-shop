package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Prodotto p1 = new Prodotto();
		p1.nome = "monitor";
		p1.descrizione = "monitor LG 32\" a schermo piatto";
		p1.prezzo = 173.31;
		p1.iva = 22;
		p1.setCodice();
//		System.out.println("Il codice del prodotto è " + p1.codice);
//		System.out.println("Il nome esteso del prodotto è " + p1.nomeEsteso());  
//		System.out.println("Prezzo con IVA: " + String.format("%.2f", p1.calcolaPrezzoConIVA()) + "€"); 
	
		Prodotto p3 = new Prodotto();
		p3.nome = "Stampante";
		p3.descrizione = "Stampante Canon";
		p3.prezzo = 49.9;
		p3.iva = 22;
		p3.setCodice();
		
		System.out.println("p1 code: " + p1.codice + ", p3 code: " + p3.codice);
		
		System.out.println("Per ottenere informazioni sui prodotti "
				+ "digitare il codice " + p1.codice + " o " + p3.codice);
	
		Scanner scan = new Scanner(System.in);
		
		int scelta = scan.nextInt();
		boolean fine = false; //serve per terminare il while
		
		while(!fine) {
			//se la scelta è codice 1 sarà stampato questo
			if(scelta == p1.codice) {
				System.out.println("Il codice del prodotto è " + p1.codice);
				System.out.println("Il nome esteso del prodotto è " + p1.nomeEsteso());  
				System.out.println("Prezzo con IVA: " + String.format("%.2f", p1.calcolaPrezzoConIVA()) + "€"); 
				fine = true;
			} else if(scelta == p3.codice) {//sennò sarà questo a essere stampato
				System.out.println("Il codice del prodotto è " + p3.codice);
				System.out.println("Il nome esteso del prodotto è " + p3.nomeEsteso());  
				System.out.println("Prezzo con IVA: " + String.format("%.2f", p3.calcolaPrezzoConIVA()) + "€"); 
				fine = true;
			} else {//se il codice inserito è sbagliato riparte il ciclo finché non viene messo quello giusto
				System.out.println("Codice non valido, reinserire");
				System.out.println("Per ottenere informazioni sui prodotti "
						+ "digitare il codice " + p1.codice + " o " + p3.codice);
				scelta = scan.nextInt();
			}
		}

	}
}
