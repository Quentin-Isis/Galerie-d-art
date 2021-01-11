/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author QUENTIN
 */
@Entity @ToString(callSuper = true) @NoArgsConstructor

public class Artiste extends Personne{
    private String biographie;
    
    public Artiste(Integer id, String nom,String adresse, String biographie){
        super(id, nom, adresse);
        
    }
}
