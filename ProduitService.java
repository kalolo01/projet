/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.dad.boutique.Produit;

/**
 *
 * @author user
 */
public class ProduitService {
       // --- Instance unique (singleton) ---
    private static ProduitService instance;

    // --- Attribut ---
    private List<Produit> liste;

    // --- Constructeur privé ---
    private ProduitService() {
        this.liste = new ArrayList<>();
    }

    // --- Accès à l’instance unique ---
    public static ProduitService getInstance() {
        if (instance == null) {
            instance = new ProduitService();
        }
        return instance;
    }

    // --- Méthodes métiers ---

    public void ajouter(Produit p) {
        liste.add(p);
    }

    public void modifier(Produit p) {
        for (int i = 0; i < liste.size(); i++) {
            Produit courant = liste.get(i);
            if (courant.getId() == p.getId()) {
                liste.set(i, p);
                break;
            }
        }
    }

    public void supprimer(Integer id) {
        liste.removeIf(p -> p.getId() == id);
    }

    public Produit trouverParId(Integer id) {
        for (Produit p : liste) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    public List<Produit> lister() {
        return liste;
    }

    public int compter() {
        return liste.size();
    }
}