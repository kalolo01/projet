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
public class ProduitAchete {
    private double remise;
    private Produit produit;
    
    public ProduitAchete() {}
    
    public ProduitAchete(Produit produit, double remise){
        this.produit = produit;
        this.remise = remise;
    }
    
    public double getRemise() { return remise; }
    public void setRemise(double remise) {this.remise = remise; }
    
    public Produit getProduit() {return produit; }
    public void setProduit(Produit produit) {this.produit = produit; }
    
    @Override
    public int hashCode() {
        return Objects.hash(produit != null ? produit.getId() : 0);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof ProduitAchete)) return false;
        ProduitAchete other = (ProduitAchete) obj;
        return Objects.equals(produit, other.produit);
    }
 
    
}
