package org.lessons.java.shop;

public class ProdottoTelevisore  {
	public static void main(String[] args) {
        Prodotto televisore = new Prodotto();

        televisore.nome = "Neo QLED 4K 55 pollici QN85D TV 2024";
        televisore.descrizione = "Processore NQ4 AI Gen2, intelligenza artificiale in 4K "
        		+ "Direct Full Array, contrasti e luminosità impareggiabili "
        		+ "Motion Xcelerator 120Hz, il meglio per il gaming "
        		+ "Dolby Atmos e OTS Lite, suono dinamico e avvolgente";
        televisore.prezzo = 1149.00;
        televisore.iva = 22;
        
        // Stampa le informazioni del prodotto
        System.out.println(televisore.nome + " - " + televisore.descrizione);

        // Stampa il prezzo base
        System.out.println("Prezzo base: " + televisore.prezzoBase() + "€");

        // Stampa il prezzo con IVA
        System.out.println("Prezzo con IVA: " + String.format("%.2f", televisore.calcolaPrezzoConIVA()) + "€");
        
        // Stampa il codice prodotto
        System.out.println("Codice prodotto: " + televisore.codice);
        
        // Stampa il nome esteso
        //String nomeEsteso = televisore.codice + " - " + televisore.nome;
        System.out.println("Nome esteso: " + televisore.nomeEsteso());
        
    }
}
