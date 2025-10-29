/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tg.univlome.epl.dad.boutique;

import java.util.Date;

/**
 *
 * @author user
 */
public class Employe extends Personne {
    private Date dateNaissance;
    
    public Employe(){}
    
    public Employe(long id, String nom, String prenom, Date dateNaissance) {
        super(id, nom, prenom);
        this.dateNaissance = dateNaissance;
    }
    
    public Date getDateNaissance() {return dateNaissance; }
    public void setDateNaissance(Date dateNaissance) {this.dateNaissance = dateNaissance; }
    
}
