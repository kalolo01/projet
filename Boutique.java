/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tg.univlome.epl.dad.boutique;

import java.util.Date;
import tg.univlome.epl.dad.boutique.Achat;
import tg.univlome.epl.dad.boutique.Categorie;
import tg.univlome.epl.dad.boutique.Client;
import tg.univlome.epl.dad.boutique.Employe;
import tg.univlome.epl.dad.boutique.Produit;
import tg.univlome.epl.dad.boutique.ProduitAchete;
import tg.univlome.epl.dad.boutique.service.AchatService;
import tg.univlome.epl.dad.boutique.service.CategorieService;
import tg.univlome.epl.dad.boutique.service.ClientService;
import tg.univlome.epl.dad.boutique.service.EmployeService;
import tg.univlome.epl.dad.boutique.service.ProduitService;

/**
 *
 * @author user
 */
 public class Boutique {

        public static void main(String[] args) {

        System.out.println("=== DÉMARRAGE DU TEST DE LA BOUTIQUE ===\n");

        // --- Instanciation des services (Singletons) ---
        CategorieService categorieService = CategorieService.getInstance();
        ProduitService produitService = ProduitService.getInstance();
        ClientService clientService = ClientService.getInstance();
        EmployeService employeService = EmployeService.getInstance();
        AchatService achatService = AchatService.getInstance();

        // --- Création de quelques catégories ---
        Categorie cat1 = new Categorie(1, "Alimentation", "Produits alimentaires");
        Categorie cat2 = new Categorie(2, "Électronique", "Appareils électroniques");
        categorieService.ajouter(cat1);
        categorieService.ajouter(cat2);

        // --- Création de produits ---
        Produit p1 = new Produit(1, "Pain", 150, new Date(System.currentTimeMillis() + 86400000), cat1);
        Produit p2 = new Produit(2, "Téléphone", 350000, null, cat2);
        produitService.ajouter(p1);
        produitService.ajouter(p2);

        // --- Création d’un client et d’un employé ---
        Client c1 = new Client(1, "Adjo", "Kossi");
        Employe e1 = new Employe(1, "Awa", "Tchalla", new Date(2000 - 1900, 5, 12));
        clientService.ajouter(c1);
        employeService.ajouter(e1);

        // --- Création de produits achetés ---
        ProduitAchete pa1 = new ProduitAchete(p1, 0.1);   // 10% de remise
        ProduitAchete pa2 = new ProduitAchete(p2, 5000);  // remise de 5000 F

        // --- Création d’un achat ---
        Achat achat1 = new Achat(1, new Date(), 1000, c1, e1);
        achat1.getProduitsAchetes().add(pa1);
        achat1.getProduitsAchetes().add(pa2);

        achatService.ajouter(achat1);

        // --- AFFICHAGE DES DONNÉES ---
        System.out.println("CATEGORIES :");
        categorieService.lister().forEach(c -> System.out.println("- " + c.getLibelle()));

        System.out.println("\nPRODUITS :");
        produitService.lister().forEach(p -> System.out.println("- " + p.getLibelle() + " (" + p.getCategorie().getLibelle() + ")"));

        System.out.println("\nCLIENTS :");
        clientService.lister().forEach(c -> System.out.println("- " + c.getPrenom() + " " + c.getNom()));

        System.out.println("\nEMPLOYÉS :");
        employeService.lister().forEach(e -> System.out.println("- " + e.getPrenom() + " " + e.getNom()));

        System.out.println("\nACHATS :");
        achatService.lister().forEach(a -> {
            System.out.println("- Achat #" + a.getId() + " par " + a.getClient().getPrenom() + " " + a.getClient().getNom());
            System.out.println("  Total à payer : " + a.getTotalAPayer() + " F");
        });

        // --- Vérif du singleton ---
        System.out.println("\nTest du Singleton :");
        System.out.println("categorieService == autreInstance ? " + (categorieService == CategorieService.getInstance()));

        System.out.println("\n=== FIN DU TEST ===");
    }
}
