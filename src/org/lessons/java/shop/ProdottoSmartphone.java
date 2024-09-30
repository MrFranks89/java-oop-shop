package org.lessons.java.shop;

public class ProdottoSmartphone  {
	public static void main(String[] args) {
        Prodotto smartphone = new Prodotto("Redmi Note 13","Tripla fotocamera da 108 MP | Display AMOLED da 120 Hz | Potenti prestazioni Snapdragon® | "
				+ "Ricarica rapida da 33 W con batteria da 5.000 maH", 699.99);

        /*//smartphone.nome = "Redmi Note 13";
        //smartphone.descrizione = "Tripla fotocamera da 108 MP | Display AMOLED da 120 Hz | Potenti prestazioni Snapdragon® | "
		//		+ "Ricarica rapida da 33 W con batteria da 5.000 maH";
        //smartphone.prezzo = 699.99;
        //smartphone.iva = 22;
        
        // Stampa le informazioni del prodotto
        System.out.println(smartphone.nome + " - " + smartphone.descrizione);

        // Stampa il prezzo base
        System.out.println("Prezzo base: " + smartphone.prezzoBase() + "€");

        // Stampa il prezzo con IVA
        System.out.println("Prezzo con IVA: " + String.format("%.2f", smartphone.calcolaPrezzoConIVA()) + "€");
        
        // Stampa il codice prodotto
        System.out.println("Codice prodotto: " + smartphone.codice);
        
        //String nomeEsteso = smartphone.codice + " - " + smartphone.nome;
        System.out.println("Nome esteso: " + smartphone.nomeEsteso());
     ;*/
        
        System.out.println(smartphone.nomeEsteso());
    }

}
