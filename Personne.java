/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique;

import java.util.Objects;

/**
 *
 * @author user
 */
public abstract class Personne {
    protected long id;
    protected String nom;
    protected String prenom;
    
    public Personne() {}
    
    public Personne(long id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public long getId() { return id; }
    public void setId(long id) { this.id = id; }
    
    public String getNom() { return nom; }
    public void setNom(String nom) {this.nom = nom; }
    
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    } 
    
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (!(obj instanceof Personne)) return false;
        Personne other = (Personne) obj;
        return id == other.id;
    }
    
}

