package fr.andrew.business.produit;

import fr.andrew.bean.Produit;

import java.util.ArrayList;

public class ProduitsBusiness {

    public ArrayList<Produit> getListeProduit(){
        Produit alexaEcho = new Produit("Alexa echo", 129.99, "ressources/img/produit/alexa echo sub 129.99.jpg");
        Produit clavier = new Produit("Clavier", 123.00, "ressources/img/produit/clavier 123.jpg");
        Produit ecran = new Produit("Écran", 2175.00,"ressources/img/produit/ecran 2175.jpg");
        Produit pcPortable = new Produit("PC Portable", 299.00, "ressources/img/produit/pc 299.jpg");
        Produit smartphone = new Produit("Smartphone", 299.00, "ressources/img/produit/smartphone 299.jpg");
        Produit souris = new Produit("Souris", 25.90, "ressources/img/produit/souris 25.90.jpg");
        Produit tabletteGraphique = new Produit("Tablette graphique", 421.00, "ressources/img/produit/tablette graphique 421.jpg");
        Produit tablette = new Produit("Tablette", 99.99, "ressources/img/produit/tablette 99.99.jpg");

        ArrayList<Produit> produit = new ArrayList<Produit>();
        produit.add(alexaEcho);
        produit.add(clavier);
        produit.add(ecran);
        produit.add(pcPortable);
        produit.add(smartphone);
        produit.add(souris);
        produit.add(tabletteGraphique);
        produit.add(tablette);

        return  produit;
    }
}
