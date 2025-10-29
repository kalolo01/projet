/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author user
 */
public class Achat {
    private long id;
    private Date dateAchat;
    private double remise;
    private Client client;
    private Employe employe;
    private List<ProduitAchete> produitsAchetes;

    // --- Constructeurs ---
    public Achat() {
        this.produitsAchetes = new ArrayList<>();
    }

    public Achat(long id, Date dateAchat, double remise, Client client, Employe employe) {
        this.id = id;
        this.dateAchat = dateAchat;
        this.remise = remise;
        this.client = client;
        this.employe = employe;
        this.produitsAchetes = new ArrayList<>();
    }

    // --- Getters & Setters ---
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public List<ProduitAchete> getProduitsAchetes() {
        return produitsAchetes;
    }

    public void setProduitsAchetes(List<ProduitAchete> produitsAchetes) {
        this.produitsAchetes = produitsAchetes;
    }

    // --- Méthode spécifique ---
    public double getTotalAPayer() {
        double total = 0;
        for (ProduitAchete pa : produitsAchetes) {
            double prix = pa.getProduit().getPrixUnitaire();
            double reduction = pa.getRemise();

            // Si la remise est < 1, on la traite comme un pourcentage
            if (reduction < 1) {
                total += prix * (1 - reduction);
            } else {
                total += (prix - reduction);
            }
        }
        total -= remise; // remise globale sur l’achat
        return total;
    }

    // --- equals & hashCode ---
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Achat achat = (Achat) o;
        return id == achat.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

    


    