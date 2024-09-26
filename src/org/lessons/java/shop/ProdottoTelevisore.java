package org.lessons.java.shop;

public class ProdottoTelevisore  {
	public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto();

        prodotto1.nome = "Neo QLED 4K 55pollici QN85D TV 2024";
        prodotto1.descrizione = "Processore NQ4 AI Gen2, intelligenza artificiale in 4K "
        		+ "Direct Full Array, contrasti e luminosità impareggiabili "
        		+ "Motion Xcelerator 120Hz, il meglio per il gaming "
        		+ "Dolby Atmos e OTS Lite, suono dinamico e avvolgente";
        prodotto1.prezzo = 1149.00;
        prodotto1.iva = 22;
        
        // Stampa le informazioni del prodotto
        System.out.println(prodotto1.nome + " - " + prodotto1.descrizione);

        // Stampa il prezzo base
        System.out.println("Prezzo base: " + prodotto1.prezzoBase() + "€");

        // Stampa il prezzo con IVA
        System.out.println("Prezzo con IVA: " + String.format("%.2f", prodotto1.calcolaPrezzoConIVA()) + "€");
    }
}
