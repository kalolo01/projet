/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique.service;

import java.util.ArrayList;
import java.util.List;
import tg.univlome.epl.dad.boutique.Employe;

/**
 *
 * @author user
 */
public class EmployeService {
     private static EmployeService instance;
    private List<Employe> employes = new ArrayList<>();

    private EmployeService() {}

    public static synchronized EmployeService getInstance() {
        if (instance == null) {
            instance = new EmployeService();
        }
        return instance;
    }

    public void ajouter(Employe e) {
        employes.add(e);
    }

    public void supprimer(Employe e) {
        employes.remove(e);
    }

    public List<Employe> lister() {
        return employes;
    }

    public Employe chercherParId(long id) {
        for (Employe e : employes) {
            if (e.getId() == id) return e;
        }
        return null;
    }
}


