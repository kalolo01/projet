/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.dad.boutique.Achat;

/**
 *
 * @author user
 */
public class AchatService {
     private static AchatService instance;
    private List<Achat> achats = new ArrayList<>();

    private AchatService() {}

    public static synchronized AchatService getInstance() {
        if (instance == null) {
            instance = new AchatService();
        }
        return instance;
    }

    public void ajouter(Achat a) {
        achats.add(a);
    }

    public void supprimer(Achat a) {
        achats.remove(a);
    }

    public List<Achat> lister() {
        return achats;
    }

    public Achat chercherParId(long id) {
        for (Achat a : achats) {
            if (a.getId() == id) return a;
        }
        return null;
    }
}
    
