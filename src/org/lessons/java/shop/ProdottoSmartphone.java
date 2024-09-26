package org.lessons.java.shop;

public class ProdottoSmartphone  {
	public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto();

        prodotto1.nome = "Redmi Note 13";
        prodotto1.descrizione = "Tripla fotocamera da 108 MP | Display AMOLED da 120 Hz | Potenti prestazioni Snapdragon® | "
				+ "Ricarica rapida da 33 W con batteria da 5.000 maH";
        prodotto1.prezzo = 699.99;
        prodotto1.iva = 22;
        
        // Stampa le informazioni del prodotto
        System.out.println(prodotto1.nome + " - " + prodotto1.descrizione);

        // Stampa il prezzo base
        System.out.println("Prezzo base: " + prodotto1.prezzoBase() + "€");

        // Stampa il prezzo con IVA
        System.out.println("Prezzo con IVA: " + String.format("%.2f", prodotto1.calcolaPrezzoConIVA()) + "€");
        
        //System.out.println(nomeEsteso);
        
        Codice codiceSmartphone = new Codice();
    }

}
