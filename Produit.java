/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author user
 */
public class Produit {
    private long id;
    private String libelle;
    private double prixUnitaire;
    private Date datePeremption;
    private Categorie categorie;
    
    public Produit() {}
    
    public Produit(long id, String libelle, double prixUnitaire, Date dateperemption, Categorie categorie) {
        this.id = id;
        this.libelle = libelle;
        this.prixUnitaire = prixUnitaire;
        this.datePeremption = datePeremption;
        this.categorie = categorie;
    }
    
    public long getId() { return id; }
    public void setI(long id) {this.id = id; }
    
    public String getLibelle() {return libelle; }
    public void setLibelle(String libelle) {this.libelle = libelle; }
    
    public double getPrixUnitaire(){return prixUnitaire; }
    public void setPrixUnitaire(double prixUnitaire) {this.prixUnitaire = prixUnitaire; }
    
    public Date getDatePeremption() { return datePeremption; }
    public void setDatePeremption(Date datePeremption) {this.datePeremption = datePeremption; }
    
    public Categorie getCategorie() { return categorie; }
    public void setCategorie(Categorie categorie) {this.categorie = categorie; }
    
    public boolean estPerime() {
        return datePeremption != null && datePeremption.before(new Date());
    }
    
    public boolean estPerime(Date dateReference) {
        return datePeremption != null && datePeremption.before(dateReference);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(!(obj instanceof Produit)) return false;
        Produit other = (Produit) obj;
        return id == other.id;
    }
    
    
    
    
    
    
    
}
