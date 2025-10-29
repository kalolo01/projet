/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.dad.boutique.Categorie;

/**
 *
 * @author user
 */
public class CategorieService {
        private static CategorieService instance;
        private List<Categorie> categories = new ArrayList<>();

    private CategorieService() {}

    public static synchronized CategorieService getInstance() {
        if (instance == null) {
            instance = new CategorieService();
        }
        return instance;
    }

    public void ajouter(Categorie c) {
        categories.add(c);
    }

    public void supprimer(Categorie c) {
        categories.remove(c);
    }

    public List<Categorie> lister() {
        return categories;
    }

    public Categorie chercherParId(int id) {
        for (Categorie c : categories) {
            if (c.getId() == id) return c;
        }
        return null;
    }
}

